/**
 * Created by V on 12/18/2016.
 */
public class Main {
    public static void main(String... args){

        String[] st = new String[2];


        try {
            System.out.println(st[10]);
        }catch (Throwable ex){ // Exception
            System.out.println("Елемента масива з даним індексом не існує");
        }

    }
}
