package io_text.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.err.println("file nay khong co noi dung");
        }
        return numbers;
    }
    public void writeFile(String filepath, int max){
        try {
            FileWriter writer = new FileWriter(filepath, true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("max number is: "+max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
