public class Ex06Pyramid {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 0; i <= rows; i++) {
      for (int j = rows - i; j >= 1; j--) {
        if (j > 1)
          System.out.print("\s\s");
        else
          System.out.print("\s*\n");
      }
    }
  }
}