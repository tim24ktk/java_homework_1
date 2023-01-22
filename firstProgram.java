import java.util.Scanner;

public class firstProgram {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int value = getNumberByUser("Введите число: ");
    int result = calculateTriangularNumber(value);
    System.out.printf("Треугольное число %s", printResult(result));
  }

  // получение данных от пользователя
  public static int getNumberByUser(String text) {
    System.out.println(text);
    return sc.nextInt();
  }

  
  // получение n-го треугольного числа
  public static int calculateTriangularNumber(int value) {
    int result = 0;
    int i = 0;

    while (i <= value) {
      result += i;
      i++;
    }

    return result;
  }

  // печать результата
  public static String printResult(int number) {
    String otherString = Integer.toString(number);
    return otherString ;
  }


}