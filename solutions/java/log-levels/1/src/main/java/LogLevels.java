public class LogLevels {
    
    public static String message(String logLine) {
        int i=0;
        while(logLine.charAt(i) != ':'){
            i++;
        }

        int pos1 = logLine.length()-1;
        int pos2 = i;

        for(int j = i+2; j < logLine.length(); j++) {
            if(Character.isLetter(logLine.charAt(j))){
                pos1 = Math.min(pos1, j);
                pos2 = Math.max(pos2, j);
            }
        }

        return logLine.substring(pos1, pos2+1);
    }

    public static String logLevel(String logLine) {
        String h = "";
        for(int i=1; i<logLine.length() && logLine.charAt(i)!=']'; i++) {
            h += Character.toLowerCase(logLine.charAt(i));
        }
        return h;
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
