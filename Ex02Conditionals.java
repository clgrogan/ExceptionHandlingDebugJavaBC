public class Ex02Conditionals {
  public static void main(String[] args) {

    int age = 19;
    double debt = 0;
    String creditScore;
    boolean canApply;

    creditScore = debt == 0 ? "Good" : "Bad";
    canApply = age > 18;

    if (canApply && creditScore.equals("Good")) {
      System.out.println("We're processing your application");
    } else {
      System.out.println("You cannot apply");
    }

  }
}
