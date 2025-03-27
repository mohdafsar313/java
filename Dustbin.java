class Dustbin {
    String brand;
    String material;
    String color;
    String shape;
    int capacity;
    int height;
    int width;
    int weight;
    int durability;
    int price;
    int warranty;
    int lidType;
    int footPedalStrength;
    int recyclingType;
    int odorControlLevel;
    int mobility;
    int waterproofLevel;
    int fireResistance;
    
    public Dustbin(String brand, String material, String color, String shape, int capacity, int height, int width, int weight,
                   int durability, int price, int warranty, int lidType, int footPedalStrength, int recyclingType, int odorControlLevel,
                   int mobility, int waterproofLevel, int fireResistance) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.durability = durability;
        this.price = price;
        this.warranty = warranty;
        this.lidType = lidType;
        this.footPedalStrength = footPedalStrength;
        this.recyclingType = recyclingType;
        this.odorControlLevel = odorControlLevel;
        this.mobility = mobility;
        this.waterproofLevel = waterproofLevel;
        this.fireResistance = fireResistance;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Height: " + height + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Durability: " + durability);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Lid Type: " + lidType);
        System.out.println("Foot Pedal Strength: " + footPedalStrength);
        System.out.println("Recycling Type: " + recyclingType);
        System.out.println("Odor Control Level: " + odorControlLevel);
        System.out.println("Mobility: " + mobility);
        System.out.println("Waterproof Level: " + waterproofLevel);
        System.out.println("Fire Resistance: " + fireResistance);
        System.out.println();
    }
}