import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner (System.in);
    System.out.println("Give me two points (x1, y1) and (x2, y2)");
    int userx1 = userInput.nextInt();
    int usery1 = userInput.nextInt();
    int userx2 = userInput.nextInt();
    int usery2 = userInput.nextInt();
    System.out.println ("The distance is " + distance(userx1, usery1, userx2, usery2));
    System.out.println("when the quadratic is positive" + quadraticPlus(-1, 1, 1));
    System.out.println("when the quadratic is negative " + quadraticMinus(-1, 1, 1));

  }

public static double distance(int x1, int y1, int x2, int y2)
  {
    int diffx = x2 - x1;
    int diffy = y2 - y1;
    int insideResult = diffx * diffx + diffy * diffy;
    double answer = Math.sqrt(insideResult);
    return answer;
  }


public static double quadraticPlus(int a, int b, int c)
{
  double discriminant = Math.sqrt((b * b) - (4 * a * c));
  double numerator = -b + discriminant;
  double denominator = 2*a;
  double answer = numerator / denominator;
  return answer;
}

public static double quadraticMinus(int a, int b, int c)
{
  double discriminant = Math.sqrt((b * b) - (4 * a * c));
  double numerator = -b - discriminant;
  double denominator = 2*a;
  double answer = numerator / denominator;
  return answer;
}
}
