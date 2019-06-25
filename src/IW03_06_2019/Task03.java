/*
 * Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел,
 * разницу чисел, произведение числе. Результат вычислений вывести на экран.
 */
package IW03_06_2019;
import java.util.*;
public class Task03 {
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число:");
      int a = sc.nextInt();
      //Scanner sc = new Scanner(System.in);
      System.out.println("Введите число:");
      int b = sc.nextInt();
      sc.close();
      System.out.println("Сумма чисел: " + (a+b));
      System.out.println("Разница чисел: " + (a-b));
      System.out.println("Произведение чисел: " + (a*b));
    }
    
}
