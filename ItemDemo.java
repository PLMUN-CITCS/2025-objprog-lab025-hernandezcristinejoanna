// Define the Item class
class Item {
    // Static variable to count objects created
    static int objectCount = 0;

    // Instance variable to store item name
    String itemName;

    // Constructor to initialize itemName and increment objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment the static objectCount every time an object is created
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display the item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

// Main class to test the Item class
public class ItemDemo {
    public static void main(String[] args) {
        // Create three Item objects with different names
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Call the instance method to display the item names
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Call the static method to display the total number of objects created
        Item.displayObjectCount();
    }
}
