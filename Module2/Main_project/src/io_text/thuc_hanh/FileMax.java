package io_text.thuc_hanh;

import java.util.List;
import java.util.Scanner;

public class FileMax {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        System.out.println("Nhap duong dan vao");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        List<Integer> numbers = readAndWriteFile.readFile(path);
        String path2 = scanner.nextLine();
        int maxvalue = findMax(numbers);
        readAndWriteFile.writeFile(path2, maxvalue);
    }
}
