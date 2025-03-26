class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed();
        System.out.println("The default value for type is: " + bed.type);
        System.out.println("The default value for size is: " + bed.size);
        System.out.println("The default value for hasHeadboard is: " + bed.hasHeadboard);
        System.out.println("The default value for material is: " + bed.material);

        // Assigning values
        bed.type = "Queen";
        bed.size = 6.5;
        bed.hasHeadboard = true;
        bed.material = "Wood";

        System.out.println("The values after initializing:");
        System.out.println("The bed type is: " + bed.type);
        System.out.println("The bed size is: " + bed.size);
        System.out.println("Does it have a headboard? " + bed.hasHeadboard);
        System.out.println("The material used is: " + bed.material);
    }
}