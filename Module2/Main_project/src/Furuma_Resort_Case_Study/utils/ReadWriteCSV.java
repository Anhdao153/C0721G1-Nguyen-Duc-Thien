package Furuma_Resort_Case_Study.utils;

import Furuma_Resort_Case_Study.models.Customer;
import Furuma_Resort_Case_Study.models.Employee;
import io_binary.bai_tap.product_manager.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCSV {
    private static void writeListStringToCSV(List<String> stringList, String path, boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi  ghi file");
        }
    }
    private static List<String> readCSV(String path){
        File file = new File(path);
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi đọc  file");
        }
        return listString;
    }
    public static void writeListEmployeeToCSV(List<Employee> employeelist, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Employee employee : employeelist){
            stringList.add(employee.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }

    public static List<Employee> getListEmployeeFromCSV(String path){
        List<Employee> employeeList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Employee employee = new Employee(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2])
                    ,array[3],Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6]
                    ,array[7],Double.parseDouble(array[8]),Long.parseLong(array[9]),array[10],array[11]);
            employeeList.add(employee);
        }
        return employeeList;
    }
    public static void writeListCustomerToCSV(List<Customer> customerList,String path,boolean append){
        List<String> stringList =new ArrayList<>();
        for (Customer Customer : customerList){
            stringList.add(Customer.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static List<Customer> getListCustomerFromtCSV(String path){
        List<Customer> customerlist =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Customer customer = new Customer(array[0],Integer.parseInt(array[1]),
                    array[2],Integer.parseInt(array[3]),Integer.parseInt(array[4]),
                    array[5],array[6],Integer.parseInt(array[7]),Integer.parseInt(array[8]));
            customerlist.add(customer);
        }
        return customerlist;
    }
}
