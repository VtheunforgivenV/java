package Task_1;

/**
 * Created by Administrator on 22.03.2017.
 */
public class Task_1_Main {

    public static void main(String[] args) {
        int result;

        //1.1
        int x = 2;
        int y = 1;
        result = x + y;
        System.out.println(result); // Ergebnis 3

        //1.2
        x = result;
        y = 2;
        result = x - y;
        System.out.println(result); // Ergebnis 1

        //1.3
        x = 10;
        y = 3;
        result = x * y;
        System.out.println(result); // Ergebnis 30

        //1.4
        x = 25;
        y = 6;
        result = x / y;
        System.out.println(result); // Ergebnis 4
        result = x % y;
        System.out.println(result); // Ergebnis 1
    }
}
