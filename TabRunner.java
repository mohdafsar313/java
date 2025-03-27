class TabRunner {
    public static void main(String[] args) {
        Tab tab1 = new Tab("Samsung", "Galaxy Tab S8", "Android", "Snapdragon 8 Gen 1", "Black", 11, 8, 128, 8000, 13, 500, 600, 2, 120, 2800, 5, 1, 9, 8);
        tab1.display();
        
        Tab tab2 = new Tab("Apple", "iPad Pro", "iPadOS", "M2", "Silver", 12, 16, 512, 10000, 12, 600, 1200, 2, 120, 2732, 5, 2, 10, 9);
        tab2.display();
        
        Tab tab3 = new Tab("Lenovo", "Tab P11", "Android", "Snapdragon 730G", "Gray", 11, 6, 128, 7500, 13, 520, 450, 1, 90, 2400, 4, 1, 8, 7);
        tab3.display();
    }
}