class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox = new IronBox();
        System.out.println("The default value for brand is: " + ironBox.brand);
        System.out.println("The default value for power is: " + ironBox.power);
        System.out.println("The default value for weight is: " + ironBox.weight);
        System.out.println("The default value for is steam iron is: " + ironBox.isSteamIron);
        
        ironBox.brand = "Philips";
        ironBox.power = 1500;
        ironBox.weight = 2.5;
        ironBox.isSteamIron = true;
        
        System.out.println("The values after initializing:");
        System.out.println("The brand of the iron box: " + ironBox.brand);
        System.out.println("The power of the iron box: " + ironBox.power + "W");
        System.out.println("The weight of the iron box: " + ironBox.weight + "kg");
        System.out.println("Is it a steam iron? " + ironBox.isSteamIron);
    }
}
