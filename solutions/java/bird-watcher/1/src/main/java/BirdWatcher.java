
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] x = {0, 2, 5, 3, 7, 8, 4};
        return x;
    }

    public int getToday() {
        int[] x = this.birdsPerDay;
        return x[x.length-1];
    }

    public void incrementTodaysCount() {
        int[] x = this.birdsPerDay;
        x[x.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i:this.birdsPerDay)
            if(i == 0)
                return true;

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int cont=0;
        int lim = Math.min(this.birdsPerDay.length, numberOfDays);
        for(int i=0;i<lim;i++) {
            cont += this.birdsPerDay[i];
        }        
        return cont;
    }

    public int getBusyDays() {
        int cont=0;
        for(int i:this.birdsPerDay) {
            if(i >= 5)
                cont++;
        }
        return cont;
    }
}
