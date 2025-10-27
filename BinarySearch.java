public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int low=0;
        int high=arr.length-1;
        int key=4;
        boolean status=false;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]==key) {
                System.out.println("value found at index: "+mid);
                status=true;
                break;
            } else if (arr[mid]<key) {
                low=mid+1;
            } else if (arr[mid]>key) {
                high=mid-1;
            }
        }
        if (!status) {
            System.out.println("value not found");
        }
    }
}




