/*
 * Пользователь вводит с клавиатуры два числа. Первое
 * число — это значение, второе число процент, который
 * необходимо посчитать. Например, мы ввели с клавиатуры
 * 50 и 10. Требуется вывести на экран 10 процентов от 50.
 * Результат: 5.
 */
package IW03_06_2019;

import java.util.Scanner;

public class Task04 {

    public static void main(String arg[]) {
        double a;
        double b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число:");
            a = sc.nextInt();
            //Scanner sc = new Scanner(System.in);
            System.out.println("Введите процент:");
            b = sc.nextInt();
        }
        System.out.println(b + " Процентов от " + a + " Составляет " + ((a/100)*b));
    }

}
