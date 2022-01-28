package Ex3;

import java.util.Arrays;
//Напишите программу, в которой массив используется для нахождения
// среднего арифметического десяти значений типа double. Используйте любые десять чисел.
public class ArethmeticMean {
    public static void main(String[] args) {
        double[] Arr = {5.7, 2.5, 6.378, -8.1, 4.9, 7.6, 9.222, 10.467, 4.643, 4.567};
        double Sum = 0;
        for (double x:Arr) {
            Sum += x;
        }
        double Mean = Sum / Arr.length;
        System.out.printf("Средене арифметическое: %.4s", Mean);
    }
}
