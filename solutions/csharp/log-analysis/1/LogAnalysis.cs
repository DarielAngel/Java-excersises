public static class LogAnalysis 
{
    
    // TODO: define the 'SubstringAfter()' extension method on the `string` type
    public static string SubstringAfter(this string log, string s) {
        string test = "";

        int l = log.Length;
        int t = s.Length;
        int i=0;
        for(;i+t < l; i++) {
            if(log.Substring(i,t) == s) {
                i += t;
                break;
            }
        }

        return log.Substring(i,l-i);
    }

    // TODO: define the 'SubstringBetween()' extension method on the `string` type

    public static string SubstringBetween(this string log, string s, string a){
        string l = log.SubstringAfter(s);
        string r = l.SubstringAfter(a);

        int ta = a.Length;
        int ts = s.Length;
        int t = log.Length;
        int x = l.Length;
        int y = r.Length;

        return log.Substring(t-x,t-(y+ta)-(t-x));
    }
    
    // TODO: define the 'Message()' extension method on the `string` type
    public static string Message(this string log){
        return log.SubstringAfter("]: ");
    }

    // TODO: define the 'LogLevel()' extension method on the `string` type

    public static string LogLevel(this string log){
        return log.SubstringBetween("[","]");
    }
}