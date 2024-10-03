public class Konto {
    private int id;
    private int saldo;

    public Konto(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    public int getId() {
        return id;
    }

    public String Check() {
        return "Balans wynosi:"+saldo;
    }

    public void wplac(int kwota) {
            saldo=saldo+kwota;
            System.out.println("Wpłacono:" + kwota);
    }

    public void wyplac(int kwota) {
            saldo=saldo-kwota;
            System.out.println("Wypłacono: " + kwota); 
    }
}