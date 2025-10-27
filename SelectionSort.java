import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr []={1,5,3,4,2};
        int n=arr.length;
        for (int i=0;i<n;i++) {
            int min=i;
            for (int j=i+1;j<n;j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}

