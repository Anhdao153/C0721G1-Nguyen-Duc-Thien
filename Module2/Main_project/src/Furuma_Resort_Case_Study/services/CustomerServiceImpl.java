package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Customer;
import Furuma_Resort_Case_Study.utils.ReadWriteCSV;

import java.util.List;
import java.util.Scanner;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;
import static Furuma_Resort_Case_Study.data.data.persons;

public class CustomerServiceImpl implements CustomerService{
    Customer customer1= new Customer();
    private boolean isCreated = false;
    final String PATH_CUSTOMER = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\customer_database.csv";

    public void displayCustomerMenu() {
        FuramaController furamaController=new FuramaController();
        int value=0;
        while (true) {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3 Edit customer\n" +
                    "4 Delete customer\n"+
                    "5 Return main menu");
            value = selectionmenu();
            switch (value) {
                case 1:
                    show();
                    break;
                case 2:
                    add(customer1);
                    persons.add(customer1);
                    ReadWriteCSV.writeListCustomerToCSV(persons, PATH_CUSTOMER,true);
                    break;
                case 3:
                    System.out.println("Nhập id mà bạn muốn check:" );
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    furamaController.displayMainMenu();
                    break;
            }
        }
    }
    @Override
    public void show() {
        List<Customer> customerList= ReadWriteCSV.getListCustomerFromtCSV(PATH_CUSTOMER);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i));
        }
    }

    @Override
    public Object edit() {
        List<Customer> customerList= ReadWriteCSV.getListCustomerFromtCSV(PATH_CUSTOMER);
        Scanner in = new Scanner(System.in);
        show();
        System.out.println("Chọn Khách hàng cần sửa thông tin");
        int choose= Integer.parseInt(in.nextLine());
        System.out.println("Nhập ID khách hàng mới");
        int newCustomerID= Integer.parseInt(in.nextLine());
        System.out.println("Nhập email mới");
        String newEmail= in.nextLine();
        System.out.println("nhập địa chỉ mới");
        String newAddress=in.nextLine();
        customerList.get(choose-1).setCustomerID(newCustomerID);
        customerList.get(choose-1).setEmail(newEmail);
        customerList.get(choose-1).setAddress(newAddress);
        ReadWriteCSV.writeListCustomerToCSV(customerList, PATH_CUSTOMER,false);
        show();
        return customerList;
    }

    @Override
    public void add(Object o) {
        Customer customer=new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name " + ((isCreated) ? customer.name : " ") + ": ");
        customer.name = sc.nextLine();

        System.out.println("Enter your age " + ((isCreated) ? customer.age : " ") + ": ");
        customer.age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your address " + ((isCreated) ? customer.address : " ") + ": ");
        customer.address = sc.nextLine();

        System.out.println("Enter your phone " + ((isCreated) ? customer.phone : " ") + ": ");
        customer.phone = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your CMND " + ((isCreated) ? customer.CMND : " ") + ": ");
        customer.CMND = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your gender " + ((isCreated) ? customer.gender : " ") + ": ");
        customer.gender = sc.nextLine();

        System.out.println("Enter your email " + ((isCreated) ? customer.email : " ") + ": ");
        customer.email = sc.nextLine();

        System.out.println("Enter your salary " + ((isCreated) ? customer.getCustomerID() : " ") + ": ");
        customer.setCustomerID(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter your birth year " + ((isCreated) ? customer.birthday : " ") + ": ");
        customer.birthday = Integer.parseInt(sc.nextLine());

        if (!isCreated) {
            isCreated = true;
        }
        customer1=customer;
    }


    @Override
    public void delete() {
        List<Customer> customerList = ReadWriteCSV.getListCustomerFromtCSV(PATH_CUSTOMER);
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("chọn khách hàng cần xóa và không phục vụ nữa");
        int khongtiemnang = Integer.parseInt(scanner.nextLine());
        customerList.remove(khongtiemnang-1);
        ReadWriteCSV.writeListCustomerToCSV(customerList, PATH_CUSTOMER,false);
        show();
    }

}
