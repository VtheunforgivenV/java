package Task_7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 22.03.2017.
 */
public class Task_7_Main {

    public static void main(String[] args) {

        //Liste erzeugen
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(15);
        list.add(18);
        list.add(21);
        list.add(24);
        list.add(27);
        list.add(30);

        //for-Schleife
        System.out.println("For-Schleife");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        //foreach-Schleife
        System.out.println("\nForeach-Schleife");
        for (Integer integer : list) {
            System.out.println(integer);
        }


        //Entfernen von Einträgen - Erstellung von neuer Liste mit Elementen, welche nicht entfernt werden soll.
        //Nachträglich der alten Liste die neue Liste zuordnen
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer == 3 || integer == 9 || integer == 15 || integer == 21 || integer == 27) {
                newList.add(integer);
            }
        }
        list = newList;
        //Entfernen von Einträgen - Manuell
        list.remove((Integer) 6);
        list.remove((Integer) 12);
        list.remove((Integer) 18);
        list.remove((Integer) 24);
        list.remove((Integer) 30);

        //Ausgabe geänderte Liste
        System.out.println("\nForeach-Schleife - geaenderte Liste");
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
