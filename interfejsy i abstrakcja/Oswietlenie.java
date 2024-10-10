public class Oswietlenie extends InteligentneUrzadzenie {
    @Override
    public void wlacz() {
        System.out.println("Oswietlenie wlaczone.");
    }

    @Override
    public void wylacz() {
        System.out.println("Oswietlenie wylaczone.");
    }

    @Override
    public void ustawHarmonogram() {
        System.out.println("Ustawiono harmonogram dla oswietlenia.");
    }
}