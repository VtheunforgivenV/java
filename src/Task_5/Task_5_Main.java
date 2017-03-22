package Task_5;

/**
 * Created by Administrator on 22.03.2017.
 */
public class Task_5_Main {

    public static void main(String[] args) {

        //for-Schleife
        System.out.println("For-Schleife");
        for (int zaehl = 0; zaehl < 10; zaehl++) {
            System.out.println(zaehl);
        }

        //do-while-Schleife
        System.out.println("\nDo-While-Schleife");
        int x = 0;
        do {
            System.out.println(x);
            x = x + 1; //oder x++ oder x+=1
        } while (x < 10);

        //while-Schleife
        System.out.println("\nWhile-Schleife");
        x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

    }
}
