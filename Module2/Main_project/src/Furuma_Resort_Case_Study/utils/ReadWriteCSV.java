package Furuma_Resort_Case_Study.utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import Furuma_Resort_Case_Study.models.*;
import io_binary.bai_tap.product_manager.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

    public static void writeListHouseToCSV(List<House> houseList, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (House house : houseList){
            stringList.add(house.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }

    public static List<House> getListHouseFromCSV(String path){
        List<House> houseList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            House house = new House(Double.parseDouble(array[0]),Integer.parseInt(array[1]),
                    Integer.parseInt(array[2]),Integer.parseInt(array[3]),
                    Double.parseDouble(array[4]),array[5],array[6]);
            houseList.add(house);
        }
        return houseList;
    }
    public static void writeListVillaToCSV(List<Villa> villaList, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Villa villa : villaList){
            stringList.add(villa.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static List<Villa> getListVillaFromCSV(String path){
        List<Villa> villaList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Villa villa = new Villa(Double.parseDouble(array[0]),Double.parseDouble(array[1]),Integer.parseInt(array[2]),
                    array[3],array[4],
                    Double.parseDouble(array[5]),Integer.parseInt(array[6]),Integer.parseInt(array[7]));
            villaList.add(villa);
        }
        return villaList;
    }
    public static void writeListRoomToCSV(List<Room> roomList, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Room room : roomList){
            stringList.add(room.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static List<Room> getListRoomFromCSV(String path){
        List<Room> roomList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Room room = new Room(Double.parseDouble(array[0]),Integer.parseInt(array[1]),
                    Integer.parseInt(array[2]),Double.parseDouble(array[3]),
                    array[4]);
            roomList.add(room);
        }
        return roomList;
    }
    public static void writeListBookingToCSV(List<Booking> bookings, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Booking booking : bookings){
            stringList.add(booking.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static List<Booking> getListBookingFromCSV(String path){
        List<Booking> bookings =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Booking booking = new Booking(new Customer(array[0],Integer.parseInt(array[1]),
                    array[2],Integer.parseInt(array[3]),Integer.parseInt(array[4]),
                    array[5],array[6],Integer.parseInt(array[7]),Integer.parseInt(array[8])),new Room(Double.parseDouble(array[9]),Integer.parseInt(array[10]),
                    Integer.parseInt(array[11]),Double.parseDouble(array[12]),
                    array[13]), Integer.parseInt(array[14]));
            bookings.add(booking);
        }
        return bookings;
    }


}
