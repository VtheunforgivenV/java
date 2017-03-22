package Task_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 22.03.2017.
 */
public class Task_8_Main {

    public static void main(String[] args) {

        //Listenvariable erzeugen
        List<Integer> list;
        //Der Variablen list den Rückgabewert von der Methode generateList zuweisen
        list = generateList();
        //Ausgabe der Liste
        printList(list);
    }

    private static List<Integer> generateList() {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(6);
        intList.add(9);
        intList.add(12);
        intList.add(15);
        intList.add(18);
        intList.add(21);
        intList.add(24);
        intList.add(27);
        intList.add(30);
        return intList;
    }

    private static void printList(List<Integer> printList) {
        for (Integer ints : printList) {
            System.out.println(ints);
        }
    }
}
