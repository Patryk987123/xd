abstract class KartaPlatnicza implements Platnosc {
    private double saldo;

    public KartaPlatnicza(double saldo) {
        this.saldo=saldo;
    }
    public double getSaldo() {  
        return saldo;
    }

    protected void setSaldo(double saldo) { 
        this.saldo=saldo;
    }
    public abstract void doladuj(double kwota);
    
}