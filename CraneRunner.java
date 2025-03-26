class CraneRunner {
    public static void main(String[] args) {
        Crane crane = new Crane();
        System.out.println("The default value for type is: " + crane.type);
        System.out.println("The default value for load capacity is: " + crane.loadCapacity);
        System.out.println("The default value for height is: " + crane.height);
        System.out.println("The default value for is mobile is: " + crane.isMobile);
        
        crane.type = "Tower Crane";
        crane.loadCapacity = 2000;
        crane.height = 50.5;
        crane.isMobile = false;
        
        System.out.println("The values after initializing:");
        System.out.println("The type of the crane: " + crane.type);
        System.out.println("The load capacity of the crane: " + crane.loadCapacity + " kg");
        System.out.println("The height of the crane: " + crane.height + " meters");
        System.out.println("Is it mobile? " + crane.isMobile);
    }
}