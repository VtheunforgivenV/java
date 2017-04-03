package Task_11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin.toerpsch on 23.03.2017.
 */
public class Task_11_Main {

    public static void main(String[] args) {
        //Initialisierung der Map
        Map<Integer, Teacher> teacherMap = new HashMap<>();
        int counter = 0;

        //Erzeugen des Lehrerobjektes (0)
        Teacher teacher = new Teacher("Uwe", "Rommel", "Mathe");
        //Lehrer der Map hinzufügen
        teacherMap.put(counter, teacher);
        //counter um 1 erhöhen
        counter += 1;

        //Erzeugen des Lehrerobjektes (1)
        teacher = new Teacher("Anja", "Rommel", "Informatik");
        //Lehrer der Map hinzufügen
        teacherMap.put(counter, teacher);
        //counter um 1 erhöhen
        counter += 1;

        //Erzeugen des Lehrerobjektes (2)
        teacher = new Teacher("Constanze", "Rommel", "Physik");
        //Lehrer der Map hinzufügen
        teacherMap.put(counter, teacher);
        //counter um 1 erhöhen
        counter += 1;

        //Erzeugen des Lehrerobjektes (3)
        teacher = new Teacher("Kevin", "Törpsch", "Informatik, Mathe");
        //Lehrer der Map hinzufügen
        teacherMap.put(counter, teacher);
        //counter um 1 erhöhen
        counter += 1;

        //Erzeugen des Lehrerobjektes (4)
        teacher = new Teacher("Peter", "Rommel", "Geographie");
        //Lehrer der Map hinzufügen
        teacherMap.put(counter, teacher);
        //counter um 1 erhöhen
        counter += 1;

        //Überprüfung ob Lehrer mit Schlüssel 3 vorhanden
        if (teacherMap.containsKey(3)) {
            System.out.println("Ausgabe des Lehrers mit dem Schlüssel 3: ");
            //Zugreifen auf Lehrer mit Schlüssel 3 und Ausgabe von dessen Werten
            teacherMap.get(3).printTeachingLesson();
        }

        //Lehrer mit Schlüssel 3 ersetzen
        teacher = new Teacher("Ingrid", "Seupt", "Hauswirtschaft");
        teacherMap.put(3, teacher);

        System.out.println("Ausgabe der vorhandenen Lehrer innerhalb der Map:");
        //Lehrer in einer For-Each-Schleife ausgeben
        for (Integer key : teacherMap.keySet()) {
            System.out.println("Schlüssel: " + key);
            teacherMap.get(key).printTeachingLesson();
        }
    }
}
