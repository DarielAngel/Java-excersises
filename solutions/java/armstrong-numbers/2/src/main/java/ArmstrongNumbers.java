class ArmstrongNumbers {

    int po(int x, int e) {
        int r=1;
        while(e > 0) {
            if(e % 2 == 1) r *= x;
            x *= x;
            e >>= 1;
        }
        return r;
    }
    
    boolean isArmstrongNumber(int n) {
        if(n == 0) return true;
        
        int sum = 0, x = n, p = 0;
        int t = (int)Math.log10(n) + 1;
        int a[] = new int[t];

        boolean ok = false;
        
        for(int i = 0; i < t; i++) {
            a[i] = n % 10;
            n /= 10;
            if(a[i] > 1)
                ok = true;
        }
        
        do {
            sum = 0;
            p++;
            for(int i=0; i<t; i++){
                sum += po(a[i], p);
            }
        } while (sum < x && ok);

        return sum == x;
    }

}
