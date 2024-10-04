public class Wiatrak {
    public final int slow=1;
    public final int medium=2;
    public final int fast=3;
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    public Wiatrak() {
        this.speed=slow;
        this.on=false;
        this.radius=5;
        this.color="Zielony";
    }

    public Wiatrak(int speed, boolean on, int radius, String color) {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public String informacje() {
        return "Predkosc: "+speed+" Stan:"+on+" Promien:"+radius+" Kolor:"+color;
    }
    
}
