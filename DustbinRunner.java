class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin("Philips", "Plastic", "Blue", "Round", 50, 60, 40, 5, 8, 1200, 2, 1, 3, 1, 5, 4, 3, 2);
        dustbin1.display();
        
        Dustbin dustbin2 = new Dustbin("LG", "Stainless Steel", "Silver", "Square", 30, 50, 35, 6, 9, 1800, 3, 2, 4, 2, 7, 5, 4, 3);
        dustbin2.display();
        
        Dustbin dustbin3 = new Dustbin("SimpleHuman", "Aluminum", "Black", "Rectangular", 70, 75, 50, 8, 10, 2500, 5, 3, 5, 3, 9, 6, 5, 4);
        dustbin3.display();
    }
}