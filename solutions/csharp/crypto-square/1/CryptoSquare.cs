public static class CryptoSquare
{
    public static string Ciphertext(string plaintext)
    {
        string normal = "";

        plaintext = plaintext.ToLower();

        for(int i=0;i<plaintext.Length;i++) {
            if(plaintext[i] >= 'a' && plaintext[i] <= 'z' || 
              plaintext[i] >= '0' && plaintext[i] <= '9') {
                normal += plaintext[i];
            }
        }

        int r = 1;
        int c = 1;
        int t = normal.Length;

        while(r * c < t) {
            r++;
            c++;
        }

        if((r-1) * c >= t) r--;

        for(int i=t;i<=c*r;i++) {
            normal += " ";
        }
        
        string msg = "";

        Console.WriteLine(normal + "_" + c + "_" + r);

        for(int i=0;i<c;i++) {
            bool a = (i < c-1);
            for(int j=0;j<r;j++) {
                msg += normal[i + j*c];
            }
            if(a) msg += " ";
        }

        return msg;
    }
}
