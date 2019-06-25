/*В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
* результат целочисленного деления x на y;
* остаток от деления x на y;
* квадратный корень x.
*/
package IW27_05_2019;
public class Task01 {
    public static void main(String args[]){
        int x = 18;
        int y = 7;
        System.out.println("Целочисленное деление x/y = " + x/y);
        System.out.println("Остаток от деления x/y = " + x%y);
        System.out.println("Квадратный корень x = " + Math.sqrt(x));
        
    }
    
}
