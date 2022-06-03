public class RuntimeException1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println("\narray.length: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Index: " + i);
            System.out.println("\sElement : " + array[i]);
        }

        /**
         * Don't do this
         */
        System.out.println("\narray.length: " + array.length);
        try {
            for (int i = 0; i < array.length + 1; i++) {
                System.out.print("Index: " + i);
                System.out.println("\sElement : " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n\nCongratulations! You caught an unchecked exception.");
            System.out.println("\tException: " + e.getMessage());
            System.out.println("\nDon't catch unchecked exceptions. \n\t!!! FIX THE CODE !!!\n");

        }
    }
}
