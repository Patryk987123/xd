import java.util.Arrays;

public class Bookshop extends Shop{
    public String[] products;

    public Bookshop(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }
    @Override
    public String getInformation(){
        return super.getInformation()+" Produkty: "+ Arrays.toString(products);
    }

}
