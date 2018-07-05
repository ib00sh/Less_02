package Less;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainException {
    public static void main(String[] args) {

        try {
            System.out.println(sqrt(-10));
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(new MainException());

    }
    public static int sqrt (int n){
        if (n>0){
           return n/2;
        }
        throw new ArithmeticException("нельзя, число отрицательное!");
    }
}
