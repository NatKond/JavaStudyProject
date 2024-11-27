import java.util.Random;

public class Study {
    public static int getSum(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
    public static double getSum(double a, double b){
        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setAge(5);
        dog.setName("Bobik");
        dog.addName("Tusik");
        System.out.println(dog.toString());
        Random rand = new Random();

        int a1 = rand.nextInt(0, 25);
        int b1 = rand.nextInt(-25, 0);
        int sum1 = getSum(a1, b1);
        System.out.println("a = " + a1 + ", b = " + b1 + ", sum = " + sum1);
        System.out.println();

        double a2 = rand.nextDouble(0,25);
        double b2 = rand.nextDouble(-25,0);
        double sum2 = getSum(a2, b2);
        System.out.println("a = " + a2 + ", b = " + b2 + ", sum = " + sum2);
        System.out.println();

        float a3 = rand.nextFloat();
        float b3 = rand.nextFloat();
        double sum3 = getSum(a3, b3);
        System.out.println("a = " + a3 + ", b = " + b3 + ", sum = " + sum3);
        System.out.println();

        System.out.println("Random integer: " + rand.nextInt(-25,25));
        System.out.println("Random float: " + rand.nextFloat(0,10));
        System.out.println("Random double: " + rand.nextDouble());
        System.out.println("Random boolean: " + rand.nextBoolean());
        System.out.println("Random from Math: " + Math.random());
    }
}
