public class Wiatrak {
    public final int slow=1;
    public final int medium=2;
    public final int fast=3;
    private int speed;
    private boolean on;
    private int promien;
    private String kolor;

    public Wiatrak() {
        this.speed=slow;
        this.on=false;
        this.promien=5;
        this.kolor="Zielony";
    }

    public Wiatrak(int speed, boolean on, int promien, String kolor) {
        this.speed=speed;
        this.on=on;
        this.promien=promien;
        this.kolor=kolor;
    }

    public String informacje() {
        return "Predkosc: "+speed+" Stan:"+on+" Promien:"+promien+" Kolor:"+kolor;
    }
    
}
