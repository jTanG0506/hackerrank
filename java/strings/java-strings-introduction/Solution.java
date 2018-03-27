import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    System.out.println(A.length() + B.length());
    System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
    String upperA = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
    String upperB = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
    System.out.println(upperA + " " + upperB);
  }

}
