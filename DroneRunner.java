
class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone("DJI Mavic 3", "DJI", 0.9, 75, 46, 15, 20, true, true, "Remote");
        drone1.display();
        
        Drone drone2 = new Drone("Parrot Anafi", "Parrot", 0.32, 55, 25, 4, 21, true, false, "App");
        drone2.display();
        
        Drone drone3 = new Drone("Autel EVO II", "Autel Robotics", 1.2, 72, 40, 9, 48, true, true, "Remote");
        drone3.display();
    }
}
