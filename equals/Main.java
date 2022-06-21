public class Main {
    public static void main(String[] args) {
        System.out.println("\n"
                + "The default equals() method compares the reference of two instances."
                + "\n");

        Car car1 = new Car("Toyota", "blue");
        Car car2 = new Car(car1);
        System.out.println(car1.customToString());
        System.out.println(car2.customToString());
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println();

        System.out.println("Car class customEquals method performs these functions"
                + " I didn't @Override the default equals method because I wanted to use it to return the object reference."
                + "\n\t1. Return false if obj is null"
                + "\n\t2. Return false if obj is not instance of correct class"
                + "\n\t3. Convert obj to the correct class"
                + "\n\t4. Compare fields from both objects"
                + "\n\t5. Return results\n");

        System.out.println(car1.customToString());
        System.out.println(car2.customToString());
        System.out.println("car1.customEquals(car2): " + car1.customEquals(car2));
        System.out.println();

        System.out.println("Change car1.make = \"Ford\"");
        car1.make = "Ford";
        Car car3 = null;
        String car4 = "Bobcat";
        System.out.println(car1.customToString());
        System.out.println(car2.customToString());
        System.out.println("car1.customEquals(car2): " + car1.customEquals(car2));
        System.out.println("\nMake car3 null: " + car3);
        System.out.println("car1.customEquals(car3): " + car1.customEquals(car3));
        System.out.println("\nMake car4 a String: " + car4);
        System.out.println("car1.customEquals(car4): " + car1.customEquals(car4));
        System.out.println();
    }

}
