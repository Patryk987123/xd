public class Shop {
    public String address;
    public int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getInformation(){
        return "Address: "+address+" Size: "+size;
    }
}
