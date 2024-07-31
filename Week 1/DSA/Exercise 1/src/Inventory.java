import java.util.ArrayList;

class Inventory {
    private ArrayList<Product> items;

    void viewInventory() {
        System.out.println("INVENTORY");
        int i = 1;
        for (Product product : items) {
            System.out.println(
                String.format("""
                    Position: %d
                    Name: %s
                    Quantity: %d
                    Price: %d
                            """, 
                    i,product.getProductName(), product.getQuantity(), product.getPrice()
                )
            );
        }
    }

    void addProduct(Product newProduct) {
        items.add(newProduct);
    }

    void updateProduct(int position, Product product) throws Exception {
        try {
            items.remove(position);
            items.add(position, product);
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }

    void deleteProduct(int position) throws Exception {
        try {
            if (items.size() != 0)
                items.remove(position);
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
