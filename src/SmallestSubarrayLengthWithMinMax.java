import java.util.Scanner;

public class SmallestSubarrayLengthWithMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfTheArray = scanner.nextInt();

        int[] array = new int[sizeOfTheArray];

        System.out.println("Enter the elements of the array: ");
        for (int iterator = 0; iterator < sizeOfTheArray; iterator++) {
            array[iterator] = scanner.nextInt();
        }

        int[] minMaxValues = findMinMaxValues(array);
        int minValue = minMaxValues[0];
        int maxValue = minMaxValues[1];

        int answer = findSmallestSubarrayLength(array, minValue, maxValue);
        System.out.println("The length of the smallest subarray that contains the minimum and maximum values: " + answer);
    }

    public static int[] findMinMaxValues(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static int findSmallestSubarrayLength(int[] array, int minValue, int maxValue) {
        int latestMinIndex = -1;
        int latestMaxIndex = -1;
        int minSubarrayLength = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                latestMinIndex = i;
                if (latestMaxIndex >= 0) {
                    minSubarrayLength = Math.min(minSubarrayLength, i - latestMaxIndex + 1);
                }
            }
            if (array[i] == maxValue) {
                latestMaxIndex = i;
                if (latestMinIndex >= 0) {
                    minSubarrayLength = Math.min(minSubarrayLength, i - latestMinIndex + 1);
                }
            }
        }

        return minSubarrayLength;
    }
}
