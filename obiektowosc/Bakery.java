import java.util.Arrays;

public class Bakery extends Shop{
    public String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }
    @Override
    public String getInformation(){
        return super.getInformation()+" Produkty: "+ Arrays.toString(products);
    }
}
