public class JedliksToyCar {
    private int battery = 100;
    private int distance = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + Integer.toString(distance) + " meters";
    }

    public String batteryDisplay() {
        if(battery > 0)
            return "Battery at " + Integer.toString(battery) + "%";
        return "Battery empty";
    }

    public void drive() {
        if(battery > 0) {
            battery--;
            distance += 20;
        }
    }
}
