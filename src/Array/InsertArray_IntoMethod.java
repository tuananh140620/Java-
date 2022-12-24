package Array;

public class InsertArray_IntoMethod {
//    static void min(int arr[]) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++)
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        System.out.println(min);
//    }

    public static void main(String args[]) {
//        int a[] = { 33, 3, 4, 5 };
//        min(a);// truyền mảng tới phương thức
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f',
                'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
