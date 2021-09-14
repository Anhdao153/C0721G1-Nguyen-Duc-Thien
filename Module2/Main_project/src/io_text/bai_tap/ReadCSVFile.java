package io_text.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "code,name";

    public static void main(String[] args) {
        String path="";
       Scanner scanner=new Scanner(System.in);
        path=scanner.nextLine();
        ReadFile(path);
    }
    public static void ReadFile(String path){
        try {
            File link = new File(path);
            if (!link.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(link));
           String line="";

            while ( (line=br.readLine())!=null){

                printContry(parseCsvLine(line));
            }
            br.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Deo Tim Thay File ");
        } catch (IOException e) {
            System.out.println("Co loi gi do ma tao deo tim ra");
            e.printStackTrace();
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void printContry(List<String> country) {
        System.out.println(
                "Country [code= "
                        + country.get(0)
                        + ", country= " + country.get(1)
                        + "]");
    }
}
