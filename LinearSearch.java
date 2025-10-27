public class LinearSearch {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int key =4;
        boolean status=false;

        for (int i=0;i<arr.length;i++ ) {
            if (arr[i]==key) {
                System.out.println("value found at index : "+i);
                status=true;
                break;
            }
        }
        if (!status) {
            System.out.println("value not found");
        }
    }
    
}
