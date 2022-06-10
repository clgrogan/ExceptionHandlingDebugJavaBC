import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        ArrayList<String> stringCollection = new ArrayList<String>();
        System.out.println("\nArrayLists are resizable. We've declared an array list with..."

                + "\n\tArrayList<String> stringCollection = new ArrayList<String>();"

        );
        System.out.println("\nCommon ArrayList Methods");
        System.out.println("\tadd() adds an element to the collection.");
        System.out.println("\tset(index, element) replaces an element in the collection");
        System.out.println("\tremove(index) removes an element from the collection");
        System.out.println("\tsize() returns the size of the collection, similar to array.length");
        System.out.println("\tclear() removes all elements of the collection");
        System.out.println();
        System.out.println();
        System.out.println(
                "Demonstration of the usage of ArrayList methods\n\t it would be good to step through the execution.\n");
        System.out.println("Initial stringCollection size: " + stringCollection.size());
        stringCollection.add("Joe");
        stringCollection.add("Jim");
        stringCollection.add("John");
        System.out.println("\nPost add() stringCollection size: " + stringCollection.size());
        for (int i = 0; i < stringCollection.size(); i++) {
            System.out.println("Element index " + i + ": " + stringCollection.get(i));
        }
        stringCollection.set(0, "Joe Fresh");
        stringCollection.add(3, "Suzie Q");
        System.out.println("\nPost set(0, \"Joe Fresh\" & add(3, \"Suzie Q\") \n\tstringCollection size: "
                + stringCollection.size());

        for (int i = 0; i < stringCollection.size(); i++) {
            System.out.println("Element index " + i + ": " + stringCollection.get(i));
        }
        stringCollection.remove(2);
        System.out.println("\nPost remove(2) stringCollection size: " + stringCollection.size());
        for (int i = 0; i < stringCollection.size(); i++) {
            System.out.println("Element index " + i + ": " + stringCollection.get(i));
        }
        stringCollection.clear();
        System.out.println("\nPost clear() stringCollection size: " + stringCollection.size());
        for (int i = 0; i < stringCollection.size(); i++) {
            System.out.println("Element index " + i + ": " + stringCollection.get(i));
        }

    }
}
