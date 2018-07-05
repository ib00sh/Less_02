package Less;

public class MyArraySizeExeption extends Throwable {
    public MyArraySizeExeption() {

    }
    public String toString() {
        String s = "Несоответсвие размера";
        return s;
    }
}
