class SirenRunner {
    public static void main(String[] args) {
        Siren siren = new Siren();
        System.out.println("The default value for sound type is: " + siren.soundType);
        System.out.println("The default value for volume is: " + siren.volume);
        System.out.println("The default value for color is: " + siren.color);
        System.out.println("The default value for is emergency is: " + siren.isEmergency);
        
        siren.soundType = "Wailing";
        siren.volume = 120;
        siren.color = "Red";
        siren.isEmergency = true;
        
        System.out.println("The values after initializing:");
        System.out.println("The sound type of the siren: " + siren.soundType);
        System.out.println("The volume of the siren: " + siren.volume + " dB");
        System.out.println("The color of the siren: " + siren.color);
        System.out.println("Is it for emergencies? " + siren.isEmergency);
    }
}
