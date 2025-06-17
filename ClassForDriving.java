public class CarForDriving {

    
    private boolean carStarted;
    private String gear; 
    private int speed;
    private boolean headlightsOn;
    private boolean wipersOn;
    private boolean leftIndicatorOn;
    private boolean rightIndicatorOn;
    private boolean seatbeltFastened;

    public CarForDriving() {
        carStarted = false;
        gear = "P";
        speed = 0;
        headlightsOn = false;
        wipersOn = false;
        leftIndicatorOn = false;
        rightIndicatorOn = false;
        seatbeltFastened = false;
    }

    public void startCar() {
        if (seatbeltFastened) {
            carStarted = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Please fasten your seatbelt before starting.");
        }
    }

    public void stopCar() {
        carStarted = false;
        speed = 0;
        gear = "P";
        System.out.println("Car stopped.");
    }

    public void fastenSeatbelt() {
        seatbeltFastened = true;
        System.out.println("Seatbelt fastened.");
    }

    public void changeGear(String newGear) {
        if (newGear.matches("P|R|N|D")) {
            gear = newGear;
            System.out.println("Gear changed to: " + gear);
        } else {
            System.out.println("Invalid gear.");
        }
    }

    public void accelerate() {
        if (carStarted && gear.equals("D")) {
            speed += 10;
            System.out.println("Accelerated to " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate. Make sure car is started and in 'D' gear.");
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 10;
            System.out.println("Braked to " + speed + " km/h");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    public void toggleHeadlights() {
        headlightsOn = !headlightsOn;
        System.out.println("Headlights turned " + (headlightsOn ? "ON" : "OFF"));
    }

    public void toggleWipers() {
        wipersOn = !wipersOn;
        System.out.println("Wipers turned " + (wipersOn ? "ON" : "OFF"));
    }

    public void signalLeft() {
        leftIndicatorOn = true;
        rightIndicatorOn = false;
        System.out.println("Left indicator ON");
    }

    public void signalRight() {
        rightIndicatorOn = true;
        leftIndicatorOn = false;
        System.out.println("Right indicator ON");
    }

    public void cancelSignals() {
        leftIndicatorOn = false;
        rightIndicatorOn = false;
        System.out.println("Indicators OFF");
    }

    public void showStatus() {
        System.out.println("=== Car Status ===");
        System.out.println("Car Started: " + carStarted);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Gear: " + gear);
        System.out.println("Headlights: " + (headlightsOn ? "ON" : "OFF"));
        System.out.println("Wipers: " + (wipersOn ? "ON" : "OFF"));
        System.out.println("Left Indicator: " + (leftIndicatorOn ? "ON" : "OFF"));
        System.out.println("Right Indicator: " + (rightIndicatorOn ? "ON" : "OFF"));
        System.out.println("Seatbelt: " + (seatbeltFastened ? "FASTENED" : "NOT FASTENED"));
    }

    public static void main(String[] args) {
        CarForDriving car = new CarForDriving();
        car.fastenSeatbelt();
        car.startCar();
        car.changeGear("D");
        car.accelerate();
        car.signalLeft();
        car.toggleHeadlights();
        car.showStatus();
        car.brake();
        car.stopCar();
    }
}
