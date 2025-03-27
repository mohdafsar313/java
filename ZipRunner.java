class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip("YKK", "Metal", 20.5, "Closed-End", "Black", true, false, 10);
        zip1.display();
        
        Zip zip2 = new Zip("Coats", "Plastic", 25.0, "Open-End", "Blue", false, true, 7);
        zip2.display();
        
        Zip zip3 = new Zip("Opti", "Nylon", 30.0, "Invisible", "White", true, false, 5);
        zip3.display();
    }
}
