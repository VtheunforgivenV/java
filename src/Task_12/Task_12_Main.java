package Task_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin.toerpsch on 23.03.2017.
 */
public class Task_12_Main {

    public static void main(String[] args) {
        //Liste von IScope erstellen
        List<IScope> scopes = new ArrayList<>();

        //Objekt der Klasse Quad erzeugen und der Liste hinzufügen
        Quad quad = new Quad(5);
        scopes.add(quad);

        //Objekt der Klasse Triangle erzeugen und der Liste hinzufügen
        Triangle triangle = new Triangle(2);
        scopes.add(triangle);

        //Objekt der Klasse Rectangle erzeugen und der Liste hinzufügen
        Rectangle rectangle = new Rectangle(5, 2);
        scopes.add(rectangle);

        //Liste von Werten ausgeben (mit angabe der Klasse)
        for (IScope scope : scopes) {
            System.out.println("Klasse: " + scope.getClass().getSimpleName() + " - Umfang: " + scope.getScopeValue());
        }
    }
}
