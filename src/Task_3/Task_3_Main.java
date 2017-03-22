package Task_3;

/**
 * Created by Administrator on 22.03.2017.
 */
public class Task_3_Main {

    public static void main(String[] args) {
        int x = 10;

        if (x > 10 && x < 20) {
            System.out.println("Ich liege zwischen 10 und 20");
        } else {
            System.out.println("Ich bin entweder kleiner gleich 10 oder größer gleich 20");
        }

        if (x < 10 || x > 20) {
            System.out.println("Ich bin kleiner als 10 oder größer als 20");
        } else {
            System.out.println("Ich bin größer gleich 10 oder kleiner gleich 20");
        }

    }
}
