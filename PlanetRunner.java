class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth", "Terrestrial", 5.972, 6371, 9.81, 365.25, 149.6, 1, false, true);
        planet1.display();
        
        Planet planet2 = new Planet("Jupiter", "Gas Giant", 1898, 69911, 24.79, 4333, 778.5, 79, true, true);
        planet2.display();
        
        Planet planet3 = new Planet("Mars", "Terrestrial", 0.641, 3389.5, 3.71, 687, 227.9, 2, false, true);
        planet3.display();
    }
}
