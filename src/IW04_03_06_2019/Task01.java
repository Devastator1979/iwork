/*
 * Пользователь вводит с клавиатуры три цифры. Необходимо создать число,
 * содержащее эти цифры. Например, если с клавиатуры введено 7, 3, 8, тогда
 * нужно сформировать число 738.
 */
package IW04_03_06_2019;

import java.util.Scanner;

public class Task01 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру 1:");
        int a = sc.nextInt();
        //Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру 2:");
        int b = sc.nextInt();
        System.out.println("Введите цифру 3:");
        int c = sc.nextInt();
        sc.close();
        System.out.println("Сформированное число = " + a + b + c);
    }

}
