class Paintbrush {
    String brand;
    String type;
    String bristleMaterial;
    String handleMaterial;
    double length;
    double width;
    boolean isWashable;
    boolean isSynthetic;
    int durability;
    
    public Paintbrush(String brand, String type, String bristleMaterial, String handleMaterial, double length, 
                      double width, boolean isWashable, boolean isSynthetic, int durability) {
        this.brand = brand;
        this.type = type;
        this.bristleMaterial = bristleMaterial;
        this.handleMaterial = handleMaterial;
        this.length = length;
        this.width = width;
        this.isWashable = isWashable;
        this.isSynthetic = isSynthetic;
        this.durability = durability;
    }
    
    public void display() {
        System.out.println("Paintbrush Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Bristle Material: " + bristleMaterial);
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Washable: " + isWashable);
        System.out.println("Synthetic Bristles: " + isSynthetic);
        System.out.println("Durability: " + durability + " years");
        System.out.println();
    }
}