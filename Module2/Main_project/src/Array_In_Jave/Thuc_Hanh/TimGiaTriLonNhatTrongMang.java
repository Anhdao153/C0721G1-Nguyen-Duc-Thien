package Array_In_Jave.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
//        int max = 0;
//        System.out.println("Nhập 5 giá trị cho mảng");
//        Scanner scanner = new Scanner(System.in);
//
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("số lớn nhất: " + max);
//        int max2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max2 && max > max2 && max > arr[i]) {
//                max2 = arr[i];
//            }
//        }
//        System.out.println("Số lớn thứ 2: " + max2);

// bài của a Phước
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập size của mảng: ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hãy nhập phần tử có index là " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng vừa tạo là: " + Arrays.toString(array));
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2 && array[i] != max1) {
                max2 = array[i];
            } else if (max1 == max2) {
                max2 = array[i];
            }
        }
        System.out.println("\n Mảng có giá trị lớn thứ 2 là: " + max2);
    }
}

