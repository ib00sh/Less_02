package Less;

import java.util.Random;

public class Array {
    public static void main(String[] args) throws MyArraySizeExeption, MyArrayDataException {
        int sum = 0;
        Random random = new Random();
        String[][] arrayStr = new String[4][4];
        // String[][] arrayStr = new String[4][5];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arrayStr[i][j] = String.valueOf(random.nextInt(10));
            }
        }
        display(arrayStr);
        // sArray[1][3]= "4x";
        try {
            sum = sumArray(arrayStr);
        }catch (MyArraySizeExeption e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }
        System.out.println("Сумма чисел массива = "+sum);
    }
    static void display(String[][] arrayStr){
        for (int i = 0; i < arrayStr.length ; i++) {
            for (int j = 0; j < arrayStr.length; j++) {
                System.out.print(arrayStr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumArray(String[][] sArray) throws MyArraySizeExeption,
                                                         MyArrayDataException {
        int sum = 0;
        if(sArray.length != 4) throw new MyArraySizeExeption();
        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i].length != 4) throw new MyArraySizeExeption();
            for(int j = 0; j < sArray[i].length; j++) {
             try {
                    sum += Integer.parseInt(sArray[i][j]);
                }catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}