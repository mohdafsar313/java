class Satellite {
    String name;
    String operator;
    String purpose;
    double mass;
    double orbitalAltitude;
    double orbitalSpeed;
    int launchYear;
    String launchVehicle;
    boolean active;
    int lifespan;
    
    public Satellite(String name, String operator, String purpose, double mass, double orbitalAltitude, 
                     double orbitalSpeed, int launchYear, String launchVehicle, boolean active, int lifespan) {
        this.name = name;
        this.operator = operator;
        this.purpose = purpose;
        this.mass = mass;
        this.orbitalAltitude = orbitalAltitude;
        this.orbitalSpeed = orbitalSpeed;
        this.launchYear = launchYear;
        this.launchVehicle = launchVehicle;
        this.active = active;
        this.lifespan = lifespan;
    }
    
    public void display() {
        System.out.println("Satellite Name: " + name);
        System.out.println("Operator: " + operator);
        System.out.println("Purpose: " + purpose);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Orbital Altitude: " + orbitalAltitude + " km");
        System.out.println("Orbital Speed: " + orbitalSpeed + " km/s");
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Active: " + active);
        System.out.println("Lifespan: " + lifespan + " years");
        System.out.println();
    }
}
