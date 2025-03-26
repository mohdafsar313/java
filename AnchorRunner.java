class AnchorRunner {
    public static void main(String[] args) {
        Anchor anchor = new Anchor();
        System.out.println("The default value for material is: " + anchor.material);
        System.out.println("The default value for weight is: " + anchor.weight);
        System.out.println("The default value for isRustResistant is: " + anchor.isRustResistant);
        System.out.println("The default value for type is: " + anchor.type);

        // Assigning values
        anchor.material = "Steel";
        anchor.weight = 15.5;
        anchor.isRustResistant = true;
        anchor.type = "Fluke";

        System.out.println("The values after initializing:");
        System.out.println("The anchor material is: " + anchor.material);
        System.out.println("The anchor weight is: " + anchor.weight);
        System.out.println("Is it rust-resistant? " + anchor.isRustResistant);
        System.out.println("The anchor type is: " + anchor.type);
    }
}