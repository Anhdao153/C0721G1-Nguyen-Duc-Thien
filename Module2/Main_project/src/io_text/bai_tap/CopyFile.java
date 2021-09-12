package io_text.bai_tap;

import java.io.*;

public class CopyFile {
    public void readFile(String path) {
        try {
            File reader = new File(path);
            File write = new File(path);
            if (!reader.exists()) {
                throw new FileNotFoundException();
            }
            if (!write.exists()){
                throw new IOException();
            }
            //(new FileReader|new FileWriter
            //nghia la no thao tac voi cai file ma minh tao.
            BufferedReader br = new BufferedReader(new FileReader(reader));
            BufferedWriter bw = new BufferedWriter(new FileWriter(write, true));
            String line = br.readLine();
            //check xem br.readline co phai la dong null khong,
            // neu k null thi se chay br.write(line).
            // Nghia la bw se ghi lai (line) vao file write.
            while (line != null) {
                bw.write(line);
            }
            br.close();
            bw.close();

            BufferedReader be = new BufferedReader(new FileReader(reader));
            while ((line = be.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File loi hoac k ton tai");
        } catch (IOException e) {
            System.out.println("Chua co file de ghi len");
        }
    }
}
