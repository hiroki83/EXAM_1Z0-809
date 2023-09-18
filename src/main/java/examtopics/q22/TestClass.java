package examtopics.q22;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
  public static void main(String ... args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter GDP: ");
    // line 1
    int GDP = Integer.parseInt(br.readLine());
    System.out.println("GDP=" + GDP);
  }
}
