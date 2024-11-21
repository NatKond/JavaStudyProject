package lesson3;

public class Lesson3 {
    public int nonstaticNum = 0;//переменная экземплра
    public int nonstaticNum2 = 0;//переменная э кземплра
    public static int staticNumber = 7;//статическа переменна класса

    public void setNonStaticNum(int num){
        nonstaticNum = num;
    }

    int method(){
        int temp = 6;//локальная переменная
        temp++;
        return temp;
    }
}
