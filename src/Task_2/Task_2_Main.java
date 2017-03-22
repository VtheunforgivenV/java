package Task_2;

/**
 * Created by Administrator on 22.03.2017.
 */
public class Task_2_Main {

    public static void main(String[] args) {
        int x = 10;

        //kleiner 10
        if(x < 10){
            System.out.println("Ich bin kleiner als 10");
        }else{
            System.out.println("Ich bin größer als 10");
        }

        //kleiner gleich 10
        if(x <= 10){
            System.out.println("Ich bin kleiner gleich 10");
        }else{
            System.out.println("Ich bin größer als 10");
        }

        //größer als 10
        if(x > 10){
            System.out.println("Ich bin größer als 10");
        }else{
            System.out.println("Ich bin kleiner als 10");
        }

        //größer gleich 10
        if(x >= 10){
            System.out.println("Ich bin größer gleich  10");
        }else{
            System.out.println("Ich bin kleiner als 10");
        }

        //gleich 10
        if(x == 10){
            System.out.println("Ich bin gleich 10");
        }else{
            System.out.println("Ich bin ungleich 10");
        }

        //ungleich 10
        if(x != 10){
            System.out.println("Ich bin ungleich als 10");
        }else{
            System.out.println("Ich bin gleich 10");
        }
    }
}
