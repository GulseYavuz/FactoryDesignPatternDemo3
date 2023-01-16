public class HepsiBurada implements IProduct {
    private String productName;

    @Override
    public void productName() {

    }
    public HepsiBurada(String productName){
        this.productName = productName;
        System.out.println("Urun adi: " + productName);
    }
}
