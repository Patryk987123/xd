public class KartaKredytowa extends KartaPlatnicza {
    private double limit;  

    public KartaKredytowa(double saldo, double limit){
        super(saldo);
        this.limit=limit;
    }
    public double getLimit(){ 
        return limit;
    }

    @Override
    public void wykonajPlatnosc(double kwota) {
        if(getSaldo()+getLimit()>=kwota){
            setSaldo(getSaldo()-kwota);
            System.out.println("Platnosc "+kwota+" PLN zaakceptowana");
        } 
        else{
            System.out.println("Brak środków na karcie");
        }
    }

    @Override
    public void doladuj(double kwota){
        setSaldo(getSaldo()+kwota);
        System.out.println("Doładowano "+kwota+" PLN. Nowe saldo: "+getSaldo()+" PLN");
    }
}