package realestatelisttings;

/**
 * 3 4 5 1
 *
 *
 */
public class MissingNumberZekari {
    private static int missingNumber(int[] array) {
        int numbers = array.length + 1;
        int sumOfAll = (numbers * (numbers + 1)) / 2;
        int sumOfArray = 0;
        for (int i = 0; i <= numbers - 2; i++) {
            sumOfArray = sumOfArray + array[i];
        }
        return sumOfAll - sumOfArray;
    }

    public static void main(String... args){
        int[] arr={3,4,5,1};
        System.out.println(missingNumber(arr));
    }
}
