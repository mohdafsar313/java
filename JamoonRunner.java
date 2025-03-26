class JamoonRunner {
    public static void main(String[] args) {
        Jamoon jamoon = new Jamoon();
        System.out.println("The default value for color is: " + jamoon.color);
        System.out.println("The default value for taste is: " + jamoon.taste);
        System.out.println("The default value for weight is: " + jamoon.weight);
        System.out.println("The default value for is sweet is: " + jamoon.isSweet);
        
        jamoon.color = "Purple";
        jamoon.taste = "Sweet";
        jamoon.weight = 50.5;
        jamoon.isSweet = true;
        
        System.out.println("The values after initializing:");
        System.out.println("The color of the jamoon: " + jamoon.color);
        System.out.println("The taste of the jamoon: " + jamoon.taste);
        System.out.println("The weight of the jamoon: " + jamoon.weight);
        System.out.println("Is it sweet? " + jamoon.isSweet);
    }
}
