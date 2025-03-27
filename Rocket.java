class Rocket {
    String name;
    String manufacturer;
    String fuelType;
    int height;
    int weight;
    int payloadCapacity;
    int thrust;
    int stages;
    int maxSpeed;
    int launchCost;
    int missionLife;
    int successRate;
    
    public Rocket(String name, String manufacturer, String fuelType, int height, int weight, int payloadCapacity, 
                  int thrust, int stages, int maxSpeed, int launchCost, int missionLife, int successRate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.payloadCapacity = payloadCapacity;
        this.thrust = thrust;
        this.stages = stages;
        this.maxSpeed = maxSpeed;
        this.launchCost = launchCost;
        this.missionLife = missionLife;
        this.successRate = successRate;
    }
    
    public void display() {
        System.out.println("Rocket Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " tons");
        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
        System.out.println("Thrust: " + thrust + " kN");
        System.out.println("Stages: " + stages);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Launch Cost: $" + launchCost + " million");
        System.out.println("Mission Life: " + missionLife + " years");
        System.out.println("Success Rate: " + successRate + "%");
        System.out.println();
    }
}
