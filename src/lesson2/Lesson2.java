package lesson2;

public class Lesson2 {

    byte b1 = 7 % 5;
    short sh1 = 10;
    int integer2 = 10 - 5;
    Integer integer = 5 + 4 + 1;
    long longInt = 5620*25;

    float float1 = 25.0F;
    Double double1 = (double)10 / 3;

    char ch1 = 102;
    char ch2 = 'a';
    char ch3 = 'A';
    String string1 = "Hello";
    public Byte getByte(){
        return b1;
    };

    public Integer getInt(){
        return integer;
    };

    public Integer getInt2(){
        return integer2;
    };

    public Long getLong(){
        return longInt;
    };

    public Double getDouble(){
        return double1;
    };

    public char getChar(){
        return ch1;
    };

    public void sayHi(String name){
        System.out.println(string1 + " " + name + "!");
    };

    public void firstProblem(){
        System.out.println("Применить все математические операторы и результаты операций вывести в консоль");
        int a1 = 168;
        int a2 = 1500;
        System.out.println("a1 = " + a1 + ", a2 = " + a2);
        System.out.println("a1 + a2 = " + (a1+a2));
        System.out.println("a2 - a1 = " + (a2-a1));
        System.out.println("a1 * a2 = " + (a1*a2));
        System.out.println("a1 / a2 = " + a2/a1); //выводит целочисленную часть результата деления
        System.out.println("a1 % a2 = " + a1%a2); // выводит остаток от деления
        System.out.println("a1 / a2 = " + (double)a2/a1); //выводит результат деления с дробной частью
        System.out.println();
    }
}
