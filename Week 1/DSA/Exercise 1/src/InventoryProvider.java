public class InventoryProvider {
    static Inventory instance;

    static Inventory provideInventory(){
        if(instance==null){
            instance = new Inventory();
        }
        return instance;
    }
}
