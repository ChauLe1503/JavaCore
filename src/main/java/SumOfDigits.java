import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    int n, res;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("input n : ");
      n = scanner.nextInt();
    } while (n <= 0);
    res = sum_digit_of_num(n);
    System.out.println("Sum of digits of " + n + " is " + res);
    scanner.close();
  }

  public static int sum_digit_of_num(int number) {
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number = number / 10;
    }
    return sum;

  }
}
