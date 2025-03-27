class Duster {
    String brand;
    String material;
    String color;
    int weight;
    int durability;
    int price;
    int warranty;
    int handleLength;
    int bristleType;
    int dustRetentionCapacity;
    int flexibility;
    int waterResistance;
    int ecoFriendly;
    
    public Duster(String brand, String material, String color, int weight, int durability, int price, int warranty,
                  int handleLength, int bristleType, int dustRetentionCapacity, int flexibility, int waterResistance, int ecoFriendly) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.durability = durability;
        this.price = price;
        this.warranty = warranty;
        this.handleLength = handleLength;
        this.bristleType = bristleType;
        this.dustRetentionCapacity = dustRetentionCapacity;
        this.flexibility = flexibility;
        this.waterResistance = waterResistance;
        this.ecoFriendly = ecoFriendly;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Durability: " + durability);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Handle Length: " + handleLength + " cm");
        System.out.println("Bristle Type: " + bristleType);
        System.out.println("Dust Retention Capacity: " + dustRetentionCapacity);
        System.out.println("Flexibility: " + flexibility);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Eco-Friendly: " + (ecoFriendly == 1 ? "Yes" : "No"));
        System.out.println();
    }
}