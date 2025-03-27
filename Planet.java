class Planet {
    String name;
    String type;
    double mass;
    double radius;
    double gravity;
    double orbitalPeriod;
    double distanceFromSun;
    int numberOfMoons;
    boolean hasRings;
    boolean hasAtmosphere;
    
    public Planet(String name, String type, double mass, double radius, double gravity, double orbitalPeriod, 
                  double distanceFromSun, int numberOfMoons, boolean hasRings, boolean hasAtmosphere) {
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.radius = radius;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
        this.hasRings = hasRings;
        this.hasAtmosphere = hasAtmosphere;
    }
    
    public void display() {
        System.out.println("Planet Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Mass: " + mass + " x10^24 kg");
        System.out.println("Radius: " + radius + " km");
        System.out.println("Gravity: " + gravity + " m/s^2");
        System.out.println("Orbital Period: " + orbitalPeriod + " days");
        System.out.println("Distance from Sun: " + distanceFromSun + " million km");
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Has Rings: " + hasRings);
        System.out.println("Has Atmosphere: " + hasAtmosphere);
        System.out.println();
    }
}
