public class Punkt {
    private double x;
    private double y;

    public Punkt() {
        this.x=0;
        this.y=0;
    }

    public Punkt(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double odleglosc(double x, double y) {
        return Math.sqrt(Math.pow((this.x-x), 2)+Math.pow((this.y-y),2));
    }

    public double odleglosc(Punkt punkt) {
        return Math.sqrt(Math.pow((this.x-punkt.x), 2)+Math.pow((this.y-punkt.y),2));
    }

}