package Sample;

public class Above {


    public static int above(int[] arr, int num) {

        if(arr[0] > num) {
            return 0;
        }

        int sum = 0;

        for(int i = 1; i <= arr.length; i++) {

            for(int j = 0; j < i; j++) {
                    sum+= arr[j];
            }
            if(sum > num) {
                return i - 1 ;
            }
            sum = 0;
        }
        return -1;

    }


    public static void main(String[] args) {

        int[] arr = new int[]{5, -5, 9, 1, -1, 7, 8};

        System.out.println(above(arr, 10));

    }


}
