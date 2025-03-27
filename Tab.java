class Tab {
    String brand;
    String model;
    String operatingSystem;
    String processor;
    String color;
    int screenSize;
    int ram;
    int storage;
    int batteryCapacity;
    int cameraQuality;
    int weight;
    int price;
    int warranty;
    int refreshRate;
    int resolution;
    int connectivity;
    int portType;
    int speakerQuality;
    int durability;
    
    public Tab(String brand, String model, String operatingSystem, String processor, String color, int screenSize, int ram, int storage, int batteryCapacity,
               int cameraQuality, int weight, int price, int warranty, int refreshRate, int resolution, int connectivity, int portType, int speakerQuality, int durability) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.color = color;
        this.screenSize = screenSize;
        this.ram = ram;
        this.storage = storage;
        this.batteryCapacity = batteryCapacity;
        this.cameraQuality = cameraQuality;
        this.weight = weight;
        this.price = price;
        this.warranty = warranty;
        this.refreshRate = refreshRate;
        this.resolution = resolution;
        this.connectivity = connectivity;
        this.portType = portType;
        this.speakerQuality = speakerQuality;
        this.durability = durability;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor: " + processor);
        System.out.println("Color: " + color);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Camera Quality: " + cameraQuality + " MP");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
        System.out.println("Resolution: " + resolution + " pixels");
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Port Type: " + portType);
        System.out.println("Speaker Quality: " + speakerQuality);
        System.out.println("Durability: " + durability);
        System.out.println();
    }
}