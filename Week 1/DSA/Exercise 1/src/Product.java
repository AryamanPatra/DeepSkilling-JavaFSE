import java.util.UUID;

class Product {

    private String productId;
    private String productName;
    private int quantity;
    private int price;

    public Product(String productName, int quantity, int price) {
        this.productId = UUID.randomUUID().toString();
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPrice() {
        return price;
    }

    

}
