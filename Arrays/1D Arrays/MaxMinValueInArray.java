//this programme is used to find the minimum and maximum value in array

  public static void main(final String[] args) {
        final int[] arr = { 1, 23, 4, 34, 2 };
        System.out.println(max(arr));
    }
    //this function will return the max value
    static int max(final int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; ++i) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
//this function will return the min value
 static int min(final int[] arr) {
        int min1 = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }
        return min1;
    }
