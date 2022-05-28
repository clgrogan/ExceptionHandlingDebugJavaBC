import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex04Pyramid {
  public static void main(String[] args) {
    String output = "\n";
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j <= i; j++) {
        if (i == j) {
          output += ("\s*\s\n");
        } else {
          output += ("\s\s");
        }
      }
    }
    System.out.println(output);
  }
}