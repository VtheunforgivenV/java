package Task_6;

/**
 * Created by kevin.toerpsch on 22.03.2017.
 */
public class Task_6_Main {

    public static void main(String[] args) {
        //Erstellung Array - Felder nacheinander beschreiben
        int[] array = new int[10];
        array[0] = 3;
        array[1] = 6;
        array[2] = 9;
        array[3] = 12;
        array[4] = 15;
        array[5] = 18;
        array[6] = 21;
        array[7] = 24;
        array[8] = 27;
        array[9] = 30;
        //Erstellung Array - Felder beim instanziieren beschreiben
        array = new int[]{
                3, 6, 9, 12, 15, 18, 21, 24, 27, 30
        };

        //for-Schleife
        System.out.println("For-Schleife");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        //foreach-Schleife
        System.out.println("\nForeach-Schleife");
        for (Integer ints : array) {
            System.out.println(ints);
        }
    }
}
