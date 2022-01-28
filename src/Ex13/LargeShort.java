package Ex13;

public class LargeShort {
    public static void main(String[] args) {
        int[] arr = {10, 49, 388, 2000, 0, 322, 482, 2, 454, 580};
        int minCount, maxCount;
        int count = 0;
        while (arr[0] != 0) {
            arr[0] /= 10;
            count++;
        }
        maxCount = minCount = count;
        for (int x : arr) {
            count = 0;
            while (x != 0) {
                x /= 10;
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
                if (minCount > count) {
                    minCount = count;
                }
            }
        }
        System.out.println("Maximum size is: " + maxCount + " .Minimum size is: " + minCount + ".");
    }
}
