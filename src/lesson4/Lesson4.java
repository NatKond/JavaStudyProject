package lesson4;

public class Lesson4 {
     public void firstProblem(){
            System.out.println("Произвести int -> long путем “расширения”");
            int testNumber = 127;
            int testNumber2 = 1025;
            long testLongNumber = testNumber;
            long testLongNumber2 = testNumber2;
            System.out.println(testLongNumber);
            System.out.println(testLongNumber2);
            System.out.println("Произвести int -> byte путем “сужения”");
            byte testByteNumber = (byte) testNumber;
            byte testByteNumber2 = (byte) testNumber2;
            System.out.println(testByteNumber);
            System.out.println(testByteNumber2);
            System.out.println("double -> int");
            double testDoubleNumber = testNumber;
            double testDoubleNumber2 = testNumber2;
            System.out.println(testDoubleNumber);
            System.out.println(testDoubleNumber2);
            System.out.println("int -> double");
            int testIntNumberFromDouble = (int) testDoubleNumber;
            int testIntNumberFromDouble2 = (int)testDoubleNumber2;
            System.out.println(testIntNumberFromDouble);
            System.out.println(testIntNumberFromDouble2);
            //Распечатайте результат в консоль
            //Для теста используйте число int = 127, а затем с числом 128
            //Проанализируйте вывод
        }

        public void secondProblem(){
            System.out.println("Создать новую строку: “I study Java”");
            String strTest = "I study Java";
            System.out.println(strTest);
            System.out.println("Вывести в консоль длину строки");
            System.out.println(strTest.length());
            System.out.println(strTest.charAt(4));
            System.out.println("Вывести в консоль часть строки “Java” используя substring");
            System.out.println(strTest.substring(3, 12));
        }
    }
