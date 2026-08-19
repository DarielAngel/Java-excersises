class Darts {
    int score(double x, double y) {
        double d = x*x + y*y;

        if(d <= 1.0f) return 10;
        else if(d <= 25.0f) return 5;
        else if(d <= 100.0f) return 1;
        return 0;
    }
}
