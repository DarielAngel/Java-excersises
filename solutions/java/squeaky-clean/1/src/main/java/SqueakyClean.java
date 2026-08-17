class SqueakyClean {
    static String clean(String identifier) {
        if(identifier.equals(""))
            return identifier;

        String h = identifier.substring(0,1);
        
        for(int i=1;i<identifier.length();i++) {
            char a = identifier.charAt(i-1);
            char b = identifier.charAt(i);
            if(a == '-' && b >= 'a' && b <= 'z') {
                h += Character.toUpperCase(b);
            } else {
                h += b;
            }
        }
        
        String s = h.replace(" ","_");

        char[] x = s.toCharArray();

        String ans = "";

        boolean ok = false;

        for(char c: x) {
            if(c == '4') c = 'a';
            else if(c == '3') c = 'e';
            else if(c == '0') c = 'o';
            else if(c == '1') c = 'l';
            else if(c == '7') c = 't';

            if(Character.isLetter(c) || c == '_') {
                ans += c;
            }
            
        }
        
        return ans;
    }
}
