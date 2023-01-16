public class Trendyol implements IProduct {
    private String productName;

    @Override
    public void productName() {

    }
    public Trendyol(String productName){
        this.productName = productName;
        System.out.println("Urun adi: " + productName);
    }
}

