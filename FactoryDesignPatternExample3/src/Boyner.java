public class Boyner implements IProduct {
    private String productName;

    @Override
    public void productName() {

    }
    public Boyner(String productName){
        this.productName = productName;
        System.out.println("Urun adi: " + productName);
    }
}
