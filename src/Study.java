import lesson2.Lesson2;

public class Study {
    public static void main(String[] args){
        System.out.println("Создаем свой класс и вызываем методы типа");
        Lesson2 lesson2 = new Lesson2();
        System.out.println(lesson2.getByte());
        System.out.println(lesson2.getInt());
        System.out.println(lesson2.getInt2());
        System.out.println(lesson2.getChar());
        System.out.println(lesson2.getLong());
        System.out.println(lesson2.getDouble());
        lesson2.sayHi("Natalia Kondratenko");
        System.out.println();

        lesson2.firstProblem();

        System.out.println("В методе main инициализировать все примитивные типы.");
        int x = 5;
        byte y = 11;
        short z = 24;
        long l = 20;

        float f = 24.8F;
        double d = 0.2;
        boolean b = false;
        char c = 'N';
        System.out.println("Выведите в консоль char и сумму сложение всех численных переменнны");
        System.out.println(f);
        System.out.println(x);
        System.out.println(c + " " + (x+y+z+l+f+d));

        System.out.println(b);
    }
}
