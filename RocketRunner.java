class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("Falcon 9", "SpaceX", "RP-1/LOX", 70, 549, 22800, 7607, 2, 27000, 62, 10, 98);
        rocket1.display();
        
        Rocket rocket2 = new Rocket("Saturn V", "NASA", "RP-1/LOX, LH2/LOX", 111, 2970, 140000, 35100, 3, 39700, 185, 8, 96);
        rocket2.display();
        
        Rocket rocket3 = new Rocket("Ariane 5", "Arianespace", "Solid, LH2/LOX", 52, 780, 10500, 13900, 2, 40000, 220, 15, 95);
        rocket3.display();
    }
}