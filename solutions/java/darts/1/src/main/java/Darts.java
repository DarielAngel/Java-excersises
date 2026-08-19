class Darts {
    int score(double x, double y) {
        double d = Math.sqrt(x*x + y*y);

        if(d <= 1.0f) return 10;
        else if(d <= 5.0f) return 5;
        else if(d <= 10.0f) return 1;
        return 0;
    }
}
