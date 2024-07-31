import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the inventory management system!");
        Scanner sc = new Scanner(System.in);
        Inventory inventory = InventoryProvider.provideInventory();

        if (inventory == null) {
            System.out.println("Exception - Inventory is being used in another instance");
            sc.close();
            return;
        }

        int choice;
        l: do {
            System.out.print(
                    """
                            OPTIONS:
                            1. Add a new Product
                            2. Update an existing product
                            3. Delete an existing product
                            4. View Products
                            0. Quit the system
                            Choice:
                                """);
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("System closing!");
                    break l;
                case 1:
                    addNewProduct(sc, inventory);
                    break;
                case 2:
                
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error - Invalid Input");
                    break;
            }
        } while (choice > 0 && choice <= 4);

        sc.close();
    }

    private static void addNewProduct(Scanner sc, Inventory inventory) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price");
        int price = sc.nextInt();
        inventory.addProduct(new Product(name, quantity, price));
    }

    
}
