package Ex10;

import java.util.Arrays;
// Перепишите  рассмотренный  класс MinMax(пример  No2)таким образом,
// чтобы в нем использовалась разновидность for-eachцикла for.
public class MinMax {
    public static void main(String args[]) {
        int nums[] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = 9;
        nums[8] = 287;
        nums[9] = 49;
        min = max = nums[0];
        for (int x:nums) {
            if(min > x) min = x;
            if(max < x) max = x;
        }
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Минимальный элемент: " + min + ".Максимальный элемент: " + max);
    }
}

