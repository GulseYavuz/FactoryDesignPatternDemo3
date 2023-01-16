public class ProductFactory {
    public static IProduct showProduct(String shopName) {
        IProduct product ;

        if (shopName == "HepsiBurada") {
            product = new HepsiBurada(shopName);
        }
        else if(shopName == "Boyner"){
            product = new Boyner(shopName);
        }
        else {
            product = new Trendyol(shopName);
        }
        return product;
    }


}
