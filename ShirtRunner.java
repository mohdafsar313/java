class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        System.out.println("The default value for color is: " + shirt.color);
        System.out.println("The default value for size is: " + shirt.size);
        System.out.println("The default value for brand is: " + shirt.brand);
        System.out.println("The default value for full sleeve is: " + shirt.isFullSleeve);
        
        shirt.color = "Blue";
        shirt.size = "Medium";
        shirt.brand = "Nike";
        shirt.isFullSleeve = true;
        
        System.out.println("The values after initializing:");
        System.out.println("The color of the shirt: " + shirt.color);
        System.out.println("The size of the shirt: " + shirt.size);
        System.out.println("The brand of the shirt: " + shirt.brand);
        System.out.println("Is it full sleeve? " + shirt.isFullSleeve);
    }
}