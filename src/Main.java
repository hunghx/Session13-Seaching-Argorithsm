import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hùng");
        list.add("Khánh");
        list.add("Nam");
        list.add("Bình");
        list.add("Tiệp");
        System.out.println(list.indexOf("Hùng"));
        System.out.println(list.indexOf("Nghĩa"));
    }
    // 6,13,14,15,33,35,43,51,66,78,90 - 33
    int binarySearch(int arr[], int low=0,3,4 int high=10,4, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2; //5,2,3,4
            if (arr[mid] == value) { //35,14,15
                return mid;
            }
            if (arr[mid] > value) {
                return binarySearch(arr, low, mid - 1, value);
            }
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }

}