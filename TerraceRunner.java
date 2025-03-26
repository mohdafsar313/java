class TerraceRunner {
    public static void main(String[] args) {
        Terrace terrace = new Terrace();
        System.out.println("The default value for number of chairs is: " + terrace.numberOfChairs);
        System.out.println("The default value for terrace name is: " + terrace.terraceName);
        System.out.println("The default value for area is: " + terrace.area);
        System.out.println("The default value for has roof is: " + terrace.hasRoof);
        
        terrace.numberOfChairs = 10;
        terrace.terraceName = "Rooftop Terrace";
        terrace.area = 1200.5;
        terrace.hasRoof = false;
        
        System.out.println("The values after initializing:");
        System.out.println("The number of chairs: " + terrace.numberOfChairs);
        System.out.println("The terrace name is: " + terrace.terraceName);
        System.out.println("The area is: " + terrace.area);
        System.out.println("Does it have a roof? " + terrace.hasRoof);
    }
}