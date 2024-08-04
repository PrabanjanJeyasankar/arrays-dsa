public class TotalSumOfAllSubarrays {
    public static void main(String[] args) {
        int array[] = {4,2,10,3};
        int sizeOfTheArray = array.length;
        int totalSum = 0;
        for(int iterator = 0; iterator < sizeOfTheArray; iterator++){
            totalSum += ((iterator + 1) * (sizeOfTheArray - iterator) * (array[iterator]));
        }
        System.out.println(totalSum);
    }
}
