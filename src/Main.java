//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int n, i, c;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Nhập vào số phần tử của mảng: ");
//            n = scanner.nextInt();
//        } while (n <= 0);
//
//        int A[] = new int[n];
//
//        System.out.println("Nhập các phần tử cho mảng: ");
//        for (i = 0; i < n; i++) {
//            System.out.print("Nhập phần tử thứ " + i + ": ");
//            A[i] = scanner.nextInt();
//        }
//
//        System.out.println("Nhập số nguyên k: ");
//        int k = scanner.nextInt();
//
//        // xóa phần tử k ra khỏi mảng
//        // vòng lặp for sẽ khởi tạo c = i = 0
//        // và duyệt i từ 0 đến n
//        // nếu phần tử tại vị trí i khác với số nguyên k
//        // thì gán phần tử tại i cho phần tử tại k
//        // sau đó tăng c lên 1
//        for (c = i = 0; i < n; i++) {
//            if (A[i] != k) {
//                A[c] = A[i];
//                c++;
//            }
//        }
//
//        n = c;  // lúc này số phần tử trong mảng sẽ bằng c
//
//        // hiển thị các phần tử trong mảng sau khi xóa k
//        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
//        for (i = 0; i < n; i++) {
//            System.out.print(A[i] + "\t");
//        }
//    }
//}
public class Main {

    public static void main(String[] args) {
        int[] arr = {1,7,5,6,2,9,8,-1};
        int x = 5;
        int pos = searchElement(arr, x);
        if (pos == -1){
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay tai vi tri: " + pos);
        }
    }

    /**
     * @Param array[n] va X
     * return index[0, n - 1] neu tim thay
     * return -1 neu khong tim thay
     */
    static int searchElement(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}