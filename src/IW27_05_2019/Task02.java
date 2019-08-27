/*
 * В переменной n хранится натуральное (целое) трехзначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
package IW27_05_2019;

public class Task02 {

    public static void main(String arg[]) {
        int x = 251;
        int x1 = 259;
        int sum = 0;
        int sum1 = 0;
        int nextint = 0; 
        while (x != 0) {
            //Суммирование цифр числа
            sum += (x % 10);
            x /= 10;
        }
        System.out.println(sum + " ");
        //Второй вариант решения
        for (x = x1; x != 0; x /= 10) {
            sum1 += (x % 10);
        }
        System.out.println(sum1 + " ");
    }

}
