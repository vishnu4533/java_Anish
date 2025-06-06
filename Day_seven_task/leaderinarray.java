package Day_seven_task;


public class leaderinarray {
    public static void main(String[] args) {
    int arr[] = {16, 17, 4, 3, 5, 2};
    int n = arr.length;
        int[] leaders = new int[n];
        int count = 0;
        int max = arr[n - 1];
        leaders[count++] = max;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders[count++] = max;
            }
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}



