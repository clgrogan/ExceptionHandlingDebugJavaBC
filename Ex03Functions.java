public class Ex03Functions {
  public static void main(String[] args) {
    int maxNumber = 15;
    int random;
    System.out.println();
    System.out.println("Range: 1 - " + maxNumber);
    for (int i = 0; i <= 30; i++) {
      random = random(maxNumber);
      System.out.println("Number " + random + " is " + isPrime(random));
    }
    System.out.println();
  }

  public static int random(int range) {
    double random = Math.random() * range + 1;
    return (int) random;
  }

  public static String isPrime(int random) {
    if (random == 1)
      return "COMPOSITE";
    String isPrime = "PRIME";
    for (int i = 2; i < random; i++) {
      if (random % i == 0) {
        isPrime = "COMPOSITE";
        break;
      }
    }
    return isPrime;
  }
}