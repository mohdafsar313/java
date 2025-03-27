class Zip {
    String brand;
    String material;
    double length;
    String type;
    String color;
    boolean isWaterResistant;
    boolean isAutomatic;
    int durability;
    
    public Zip(String brand, String material, double length, String type, String color, 
               boolean isWaterResistant, boolean isAutomatic, int durability) {
        this.brand = brand;
        this.material = material;
        this.length = length;
        this.type = type;
        this.color = color;
        this.isWaterResistant = isWaterResistant;
        this.isAutomatic = isAutomatic;
        this.durability = durability;
    }
    
    public void display() {
        System.out.println("Zip Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " cm");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Durability: " + durability + " years");
        System.out.println();
    }
}
