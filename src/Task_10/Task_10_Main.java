package Task_10;

/**
 * Created by kevin.toerpsch on 23.03.2017.
 */
public class Task_10_Main {

    public static void main(String[] args) {
        //Erzeugen des Lehrerobjektes
        Teacher teacher = new Teacher("Uwe", "Rommel", "Mathe");
        //Ausgabe der Lehrerdaten
        teacher.printTeachingLesson();

        //Erzeugen eines Schuelerobjektes
        Student student = new Student("Anja", "Rommel", "Studium");
        //Ausgabe der Daten des Schuelers
        student.printGrade();
    }
}
