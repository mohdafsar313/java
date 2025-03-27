class CabRunner {
    public static void main(String[] args) {
        Cab cab1 = new Cab("Toyota", "Camry", "Petrol", "White", 5, 2500, 15, 220, 30000, 3, 5, 8, 500, 1, 1, 1, 1, 14);
        cab1.display();
        
        Cab cab2 = new Cab("Honda", "Civic", "Diesel", "Black", 5, 2000, 18, 200, 28000, 3, 4, 7, 450, 2, 1, 1, 1, 16);
        cab2.display();
        
        Cab cab3 = new Cab("Tesla", "Model 3", "Electric", "Red", 5, 0, 25, 250, 50000, 5, 5, 9, 550, 1, 1, 1, 1, 20);
        cab3.display();
    }
}