import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Wrapper {
    public static void main(String[] args) {
        int wholeNumber = 5;
        long largeWholeNumber = 5000000000L;
        double decimal = 5.493;
        char letter = 'b';

        Integer integerWholeNumber = 5;
        Long longLargeWholeNumber = 5000000000l;
        Double doubleDecimal = 5.493;
        Character charLetter = 'b';

        System.out.println("\nint wholeNumber = 5;"
                + "\nlong largeWholeNumber = 5000000000L;"
                + "\ndouble decimal = 5.493;"
                + "\nchar letter = 'b';"

                + "\n\nInteger integerWholeNumber = 5;"
                + "\nLong longLargeWholeNumber = 5000000000l;"
                + "\nDouble doubleDecimal = 5.493;"
                + "\nCharacter charLetter = 'b';");

        System.out.println("\nThe preceding code initializes primitive variables, and "
                + "\nthen initializes object variables of the wrapper types associated with each"
                + "\nprimitive variable.");

        System.out.println(
                "\nThe wrapper classes are immutable.\nImmune to reference trap.\nVariables of the type do have functions vs. the derived primitives which do not have functions.\nMay be null vs. primitives.\nHave no getters or setters.\n");
        System.out.println("Most of the time, use the primitives.");
    }
}
