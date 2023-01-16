public class Main {
    public static void main(String[] args) {

        IProduct hepsiburada = ProductFactory.showProduct("araba");
        IProduct trendyol = ProductFactory.showProduct("kitap");
        IProduct boyner = ProductFactory.showProduct("çanta");

        hepsiburada.productName();
        trendyol.productName();
        boyner.productName();

    }
}