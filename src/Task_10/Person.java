package Task_10;

/**
 * Created by kevin.toerpsch on 23.03.2017.
 */
public abstract class Person {

    protected String firstname;
    protected String lastname;

    protected void printName() {
        System.out.println(this.firstname + " " + this.lastname);
    }

}
