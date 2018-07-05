package Less;

public class MyArrayDataException extends Throwable {
    int i, j;
    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
    public String toString() {
        String s = "Ошибка в столбце номер: " + i + " и строке номер: " + j +" ";
        return s;
    }
}
