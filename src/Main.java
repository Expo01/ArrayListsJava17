
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) { //record created with 3 fields. Purpose of record seems to be just
    // for the passing of information and not calling of methods of that class

    public GroceryItem(String name) { //like a constructor, calls the 3 parameter variant of the GroceryItem constructor and
        // hard codes type and count but requires name parameter to be passed
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3]; //this is all just plain ole array where indexes are set to new
        // objects of GroceryItem class
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); //without diamond brackets specifying type, this is similar to using an
        // array of 'Objects' which can lead to type problems
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>(); // here the diamond brackets used and now only accepts GroceryItems
        // and the diamond operator '<>' also required where Java will infer the correct type as stated in diamond brackets, but without
        // which, at compile time, Java will just read this as a raw arrayList (the equivalent of 'Object' class)
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}