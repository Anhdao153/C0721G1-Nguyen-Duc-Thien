package io_text.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File("C:\\Users\\a\\Desktop\\text11.txt");
            File filetest = new File("C:\\Users\\a\\Desktop\\test.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(filetest,true));
            String line = "";
       //     int sum = 0;
            while ((line = br.readLine()) != null) {
                bw.write(line);
            }
            br.close();
            bw.close();
            BufferedReader be = new BufferedReader(new FileReader(file));
            while ((line = be.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Không tìm thấy file hoặc nội dung");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
