public class Termostat extends InteligentneUrzadzenie {
    @Override
    public void wlacz() {
        System.out.println("Termostat wlaczony.");
    }

    @Override
    public void wylacz() {
        System.out.println("Termostat wylaczony.");
    }

    @Override
    public void ustawHarmonogram() {
        System.out.println("Ustawiono harmonogram dla termostatu.");
    }
}
