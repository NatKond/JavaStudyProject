import lesson3.Lesson3;
import java.util.Scanner;

public class Study {
    public static void main(String[] args){
        System.out.println("Задание статических и локальных переменных внутри класса");
        System.out.println();
        System.out.println(Lesson3.staticNumber);
        Lesson3 lesson3 = new Lesson3();
        lesson3.setNonStaticNum(5);
        System.out.println(lesson3.nonstaticNum);

        System.out.println("Получение данных с консоли");
        System.out.print("Задайте число:");
        Scanner scanner = new Scanner(System.in);
        int numberUser = scanner.nextInt();
        System.out.println("Заданное число: " + numberUser);


        System.out.println("Считать два числа из консоли, и сложить их и вывести результат");

        //Целые числа
        System.out.print("Введите первое целое число a: ");
        int userNumber1 = scanner.nextInt();
        System.out.print("Введите второе целое число b: ");
        int userNumber2 = scanner.nextInt();
        System.out.println("a + b = " + (userNumber1+userNumber2));
        System.out.println();
        //Дробные числа
        System.out.print("Введите первое дробное число c: ");
        double userDouble1 = scanner.nextDouble();
        System.out.print("Введите второе дробное число d: ");
        double userDouble2 = scanner.nextDouble();
        System.out.println("c + d = " + (userDouble1+userDouble2));
        System.out.println();

        System.out.println("Считать два числа из консоли в переменный экземпляра класса и вывести результат их сложения");
        System.out.print("Задайте первый параметр объекта lesson3: ");
        lesson3.nonstaticNum = scanner.nextInt();
        System.out.print("Задайте второй параметр объекта lesson3: ");
        lesson3.nonstaticNum2 = scanner.nextInt();
        System.out.println("Сумма введенных параметров класса: " + (lesson3.nonstaticNum + lesson3.nonstaticNum2));
        System.out.println();
    }
}
