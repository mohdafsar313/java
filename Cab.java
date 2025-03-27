class Cab {
    String brand;
    String model;
    String fuelType;
    String color;
    int seatingCapacity;
    int engineCapacity;
    int mileage;
    int maxSpeed;
    int price;
    int warranty;
    int safetyRating;
    int comfortLevel;
    int luggageCapacity;
    int transmissionType;
    int entertainmentSystem;
    int gpsEnabled;
    int airConditioning;
    int fuelEfficiency;
    
    public Cab(String brand, String model, String fuelType, String color, int seatingCapacity, int engineCapacity, int mileage, int maxSpeed,
               int price, int warranty, int safetyRating, int comfortLevel, int luggageCapacity, int transmissionType,
               int entertainmentSystem, int gpsEnabled, int airConditioning, int fuelEfficiency) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.warranty = warranty;
        this.safetyRating = safetyRating;
        this.comfortLevel = comfortLevel;
        this.luggageCapacity = luggageCapacity;
        this.transmissionType = transmissionType;
        this.entertainmentSystem = entertainmentSystem;
        this.gpsEnabled = gpsEnabled;
        this.airConditioning = airConditioning;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Color: " + color);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Safety Rating: " + safetyRating + " stars");
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Luggage Capacity: " + luggageCapacity + " liters");
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Entertainment System: " + entertainmentSystem);
        System.out.println("GPS Enabled: " + (gpsEnabled == 1 ? "Yes" : "No"));
        System.out.println("Air Conditioning: " + (airConditioning == 1 ? "Yes" : "No"));
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
        System.out.println();
    }
}