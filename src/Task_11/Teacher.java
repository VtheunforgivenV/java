package Task_11;

import Task_10.Person;

/**
 * Created by kevin.toerpsch on 23.03.2017.
 * Klasse erbt von der Klasse Person
 * Alle Attribute (Werte) und Methoden werden dabei auch dieser Klasse zugaenglich.
 * D.h. die Klasse Person wird erweitert (extends)
 */
public class Teacher extends Person {

    private String teachingLesson;

    public Teacher(String firstname, String lastname, String lesson) {
        //Zuweisen des Vor- und Nachnamens. Referenzen auf Werte durch Veerbung vorhanden
        this.firstname = firstname;
        this.lastname = lastname;
        //Zuweisen des Unterrichtsfaches
        this.teachingLesson = lesson;
    }

    public void printTeachingLesson() {
        //Namen ausgeben Methode printName vorhanden, da von Person geerbt
        printName();
        //Ausgabe des Unterrichtsfaches + hinzufuegen von zwei Zeilenumbruechen
        System.out.print(teachingLesson + "\n\n");
    }
}
