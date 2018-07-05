package Less;

public class Main {

    public static void main(String[] args) throws Exception {

        double weight = 0;
        double height = 0;


        String str = "118 2.05 \n" +
                "106 1.77 \n" +
                "87 1.83 \n" +
                "45 1.12 \n" +
                "70 1.87 \n" +
                "54 1.57 \n" +
                "105 1.76 \n" +
                "50 1.96 \n" +
                "114 1.76 \n" +
                "72 2.45 \n" +
                "53 2.10 \n" +
                "66 2.25 \n" +
                "54 1.50 \n" +
                "95 1.62 \n" +
                "86 1.72 \n" +
                "62 1.57 \n" +
                "65 2.24 \n" +
                "72 1.43 \n" +
                "93 2.01 \n" +
                "109 3.01 \n" +
                "106 2.97 \n" +
                "77 1.69 \n" +
                "114 2.09 \n" +
                "98 1.72 \n" +
                "85 2.46 \n" +
                "113 1.94 \n" +
                "53 1.77 \n" +
                "106 2.30";
        String strArr[] = str.split(" ");
        double numArr[] = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Double.parseDouble(strArr[i]);
            numArr[i+1] = Double.parseDouble(strArr[i+1]);
            calc(numArr[i],numArr[i+1]);
            i++;
        }
    }

     static void calc(double weight, double height) {
        double bmi = weight / (height * height);
        System.out.print("Рост = " + height + " метра. Вес = " + weight + " кг. ");
        System.out.printf(" Индекс массы тела: %.2f", bmi);
        if (bmi < 18.5 ){
            System.out.print(" у вас недостаточная масса тела");
        }
        else if(18.5 <= bmi && bmi < 25.0 ) {
            System.out.print(" у вас нормальная масса тела");
        }
        else if(25.0 <= bmi && bmi < 30.0 ) {
            System.out.print(" у вас избыточная масса тела");
        }
        else {
            System.out.print(" у вас ожирение");
        }
         System.out.println();
        }
    }