package Task_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin.toerpsch on 22.03.2017.
 */
public class Task_9_Main {

    public static void main(String[] args) {

        //Listenvariable erzeugen
        List<JavaInt> list;
        //Der Variablen list den Rückgabewert von der Methode generateList zuweisen
        list = generateList();
        //Ausgabe der Liste
        printList(list);
    }

    private static List<JavaInt> generateList() {
        List<JavaInt> intList = new ArrayList<>();
        //normalerweise Objekterzeugung: JavaInt javaInt = new JavaInt(3); hier kann dies abgekürzt werden, da das Objekt zu einer Liste hinzugefügt wird.
        intList.add(new JavaInt(3));
        intList.add(new JavaInt(6));
        intList.add(new JavaInt(9));
        intList.add(new JavaInt(12));
        intList.add(new JavaInt(15));
        intList.add(new JavaInt(18));
        intList.add(new JavaInt(21));
        intList.add(new JavaInt(24));
        intList.add(new JavaInt(27));
        intList.add(new JavaInt(30));
        return intList;
    }

    private static void printList(List<JavaInt> printList) {
        for (JavaInt javaInt : printList) {
            System.out.println(javaInt.getValue());
        }
    }
}
