public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double total = speed * 221;
        if(speed <= 4) {
            return total;
        } else if(speed <= 8) {
            return total * 90 / 100;
        } else if(speed <= 9) {
            return total * 80 / 100;
        } else {
            return total * 77 / 100;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
