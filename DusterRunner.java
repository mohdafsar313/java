class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster("Scotch-Brite", "Microfiber", "Green", 200, 8, 500, 2, 30, 1, 9, 7, 5, 1);
        duster1.display();
        
        Duster duster2 = new Duster("O-Cedar", "Feather", "White", 150, 7, 450, 1, 25, 2, 8, 6, 4, 1);
        duster2.display();
        
        Duster duster3 = new Duster("Swiffer", "Synthetic", "Blue", 180, 9, 600, 3, 28, 3, 10, 8, 6, 1);
        duster3.display();
    }
}