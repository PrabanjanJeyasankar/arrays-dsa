public class SumOfEachAndEverySubarray {
    public static void main(String[] args) {
        int array[] = {4,2,10,3};
        int sizeOfTheArray = array.length;

        for(int iterator = 0; iterator < sizeOfTheArray; iterator++){
            int sum = 0;
            for(int jterator = iterator; jterator < sizeOfTheArray; jterator++){
                sum += array[jterator];
                System.out.println(sum);
            }
        }

    }
}
