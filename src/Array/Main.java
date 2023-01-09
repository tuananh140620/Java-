package Array;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String[] cars = { "Honda", "BMW", "Ford", "Mazda" };
        // thay đổi phần tử đầu tiên của mảng cars
        //cars[0] = "Morning";
        // hiển thị phần tử đầu tiên của mảng cars
        //System.out.println("Phần tử đầu tiên: " + cars[0]);

        String[] cars = {"Honda", "BMW", "Ford", "Mazda", "BMW"};
        for (int i = 0; i < 4; i++) {
            System.out.println(cars[i]);
        }
        Arrays.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
