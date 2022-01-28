package Ex14;
//Создайте  массив  чисел.Найдите  в  массивеколичество
// чисел, содержащих только четные цифры.

public class EvenNumbers {
    public boolean IS_EVEN = true;
    public static void main(String[] args) {
        int[] arr = {10, 49, 388, 2000, 0, 322, 482, 2, 454, 580};
        int count = 0;
        for (int x : arr) {
            if(isAllEven(x)) count++;
        }

        System.out.println(count);
    }


    public static boolean isAllEven(int num) {
        int trash = num;
        int count = 0;
        boolean isAllEven;
        while (trash != 0) {
            trash/=10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            trash = num % 10;
            if(!isEven(trash)){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num%2 == 0 ? true : false;
    }
}
 /*public static boolean onTen(int num) {
        boolean is = true;
        if(num%10 != 0) {
            if (!isEven(num % 10)) {
                return false;
            }
            if(num % 10 != 0) {
                num /= 10;
                is = onTen(num);
            }
        }
        return is;
    }*/
