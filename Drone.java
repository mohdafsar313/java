class Drone {
    String model;
    String manufacturer;
    double weight;
    double maxSpeed;
    double flightTime;
    double range;
    int cameraResolution;
    boolean gpsEnabled;
    boolean obstacleAvoidance;
    String controlType;
    
    public Drone(String model, String manufacturer, double weight, double maxSpeed, double flightTime, double range, 
                 int cameraResolution, boolean gpsEnabled, boolean obstacleAvoidance, String controlType) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.flightTime = flightTime;
        this.range = range;
        this.cameraResolution = cameraResolution;
        this.gpsEnabled = gpsEnabled;
        this.obstacleAvoidance = obstacleAvoidance;
        this.controlType = controlType;
    }
    
    public void display() {
        System.out.println("Drone Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Flight Time: " + flightTime + " minutes");
        System.out.println("Range: " + range + " km");
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
        System.out.println("GPS Enabled: " + gpsEnabled);
        System.out.println("Obstacle Avoidance: " + obstacleAvoidance);
        System.out.println("Control Type: " + controlType);
        System.out.println();
    }
}
