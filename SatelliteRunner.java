class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite("Hubble Space Telescope", "NASA/ESA", "Astronomy", 11110, 547, 7.5, 1990, "Space Shuttle Discovery", true, 30);
        satellite1.display();
        
        Satellite satellite2 = new Satellite("GPS IIF-1", "USAF", "Navigation", 1630, 20200, 3.9, 2010, "Atlas V", true, 15);
        satellite2.display();
        
        Satellite satellite3 = new Satellite("Sentinel-1A", "ESA", "Earth Observation", 2300, 693, 7.5, 2014, "Soyuz", true, 7);
        satellite3.display();
    }
}
