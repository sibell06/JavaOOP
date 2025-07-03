import java.util.Scanner;

public class DemoMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //заменяме вида на този код с методи
        int number = Integer.parseInt(scanner.nextLine());

        //System.out.println(number * 2);
        //System.out.println(number / 2);
        printNumber(multiplyBy2(number));
        printNumber(divideBy2(number));

    }
    // метод за умножение
    public static int multiplyBy2(int number){
        return number * 2;
    }
    //метод за деление
    public static int divideBy2(int number){
        return number / 2;

    }
    //метод за отпечатване на число
    public static void printNumber(int number){
        System.out.println(number);
    }

}
