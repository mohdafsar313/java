class HangerRunner {
    public static void main(String[] args) {
        Hanger hanger = new Hanger();
        System.out.println("The default value for material is: " + hanger.material);
        System.out.println("The default value for type is: " + hanger.type);
        System.out.println("The default value for capacity is: " + hanger.capacity);
        System.out.println("The default value for has hooks is: " + hanger.hasHooks);
        
        hanger.material = "Wood";
        hanger.type = "Clothes Hanger";
        hanger.capacity = 5;
        hanger.hasHooks = true;
        
        System.out.println("The values after initializing:");
        System.out.println("The material of the hanger: " + hanger.material);
        System.out.println("The type of the hanger: " + hanger.type);
        System.out.println("The capacity of the hanger: " + hanger.capacity);
        System.out.println("Does it have hooks? " + hanger.hasHooks);
    }
}