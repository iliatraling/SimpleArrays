package Ex2;
//Покажитевсе  варианты,  которыми  можно  воспользоваться  для инициализации
// элементов одномерного массива целочисленными значениями от 1 до 5.
public class InicializationArray {
    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 3, 4, 5};
        int[] Arr2 = new int[5];

        for (int i = 0; i < Arr2.length; i++) {
            Arr2[i] = i + 1;
        }

        int[] Arr3 = new int[5];
        Arr3[0] = 1;
        Arr3[1] = 2;
        Arr3[2] = 3;
        Arr3[3] = 4;
        Arr3[4] = 5;
    }
}
