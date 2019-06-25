/*
 *Напишите программу, вычисляющую площадь квадрата. Пользователь с клавиатуры
 * вводит размер стороны квадрата.
*/
package IW03_06_2019;
import java.util.*;
public class Task05 {
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите размер стороны квадрата:");
      int a = sc.nextInt();
      sc.close();
      System.out.println("Площадь квадрата S=" + (a*a));
    }
    
}
