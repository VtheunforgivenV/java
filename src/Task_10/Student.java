package Task_10;

/**
 * Created by kevin.toerpsch on 23.03.2017.
 * Klasse erbt von der Klasse Person
 * Alle Attribute (Werte) und Methoden werden dabei auch dieser Klasse zugaenglich.
 * D.h. die Klasse Person wird erweitert (extends)
 */
public class Student extends Person {

    private String grade;

    public Student(String firstname, String lastname, String grade) {
        //Zuweisen des Vor- und Nachnamens. Referenzen auf Werte durch Veerbung vorhanden
        this.firstname = firstname;
        this.lastname = lastname;
        //Zuweisung der Klassenstufe
        this.grade = grade;
    }

    public void printGrade() {
        //Namen ausgeben Methode printName vorhanden, da von Person geerbt
        printName();
        //Ausgabe der Klassenstufe + hinzufuegen von zwei Zeilenumbruechen
        System.out.print(grade + "\n\n");
    }
}
