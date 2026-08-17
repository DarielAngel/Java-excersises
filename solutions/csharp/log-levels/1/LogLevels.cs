static class LogLine
{
    public static string Message(string logLine)
    {
        string[] log = logLine.Split(" ");
        
        string s = "";

        foreach(String i in log)
            Console.WriteLine(i);

        int t = log.Length;

        for(int i=1;i<t;i++) {
            Console.WriteLine(i + " -> [" + log[i] + "] ... [" + log[i].Trim() + "]");

            if(log[i].Trim().Length > 0) {
                if(s.Length > 0) s += " ";
                s += log[i].Trim();
            }
        }
        
        return s;
    }

    public static string LogLevel(string logLine)
    {
        string[] s = logLine.Split(" ");

        int t = s[0].Trim().Length;
        
        return s[0].Trim().Substring(1,t-3).ToLower();
    }

    public static string Reformat(string logLine)
    {
        string msg = Message(logLine);
        string log = LogLevel(logLine);

        return msg + " (" + log + ")";
    }
}
