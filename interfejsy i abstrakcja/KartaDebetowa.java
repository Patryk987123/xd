public class KartaDebetowa extends KartaPlatnicza {
    public KartaDebetowa(double saldo) {
        super(saldo);
    }

    @Override
    public void wykonajPlatnosc(double kwota) {
        if(getSaldo()>=kwota){
            setSaldo(getSaldo()-kwota);
            System.out.println("Płatność "+kwota+" PLN zaakceptowana");
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