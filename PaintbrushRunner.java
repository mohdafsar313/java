class PaintbrushRunner {
    public static void main(String[] args) {
        Paintbrush brush1 = new Paintbrush("Winsor & Newton", "Round", "Natural Hair", "Wood", 20.5, 1.2, true, false, 5);
        brush1.display();
        
        Paintbrush brush2 = new Paintbrush("Princeton", "Flat", "Synthetic", "Plastic", 18.0, 2.5, true, true, 3);
        brush2.display();
        
        Paintbrush brush3 = new Paintbrush("Da Vinci", "Fan", "Natural Hair", "Bamboo", 22.0, 3.0, false, false, 7);
        brush3.display();
    }
}
