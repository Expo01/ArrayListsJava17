import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items); // factory method. '.of' inbuilt method of List returns elements passed into a list
        System.out.println(list);
//
//        list.add("yogurt");         this will throw an exception because List is an immutable class
//        System.out.println(list);


        ArrayList<String> groceries = new ArrayList<>(list); // passing an argument into the constructor: 'list' which uses
        // its elements in an Arraylist, which is now mutable. No '.of' method appears to exist in ArrayList mutable class
        groceries.add("yogurt");
        System.out.println(groceries);


        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")); //if you know some elements in the Arrayalist you want,
        // you can directly pass those values into the argument and then add more later.
        System.out.println(nextList);
        nextList.add("olives");

        groceries.addAll(nextList); // you can combine a list to another list outside the initial constructor argument using '.addAll'
        System.out.println(groceries);


        System.out.println("Third item = " + groceries.get(2)); //returns element at specified index

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard",
                "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard",
                "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder()); //Comparator allows comparison of instance.
                                                //.naturalOrder alphabetizes
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder()); //reverse alphabetizing
        System.out.println(groceries);

        System.out.println("=====");
        var groceryArray = groceries.toArray(new String[groceries.size()]); //'.toArray' turns ArrayList into an array
                                // and new String[] created and set to size of the ArrayList being copied
        System.out.println(Arrays.toString(groceryArray));
    }
}
