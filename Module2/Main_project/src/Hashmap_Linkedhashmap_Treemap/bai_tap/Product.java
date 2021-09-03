package Hashmap_Linkedhashmap_Treemap.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Product implements Comparator<ProductManager> {
    @Override
    public int compare(ProductManager o1, ProductManager o2) {
        if (o1.getMoney() > o2.getMoney()) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ProductManager> productManagers = new ArrayList<>();
        String product = "null";
        int id = 0;
        double money = 0;
        int option = 0;
        ProductManager manager = new ProductManager(product, money, id);
        while (option != 7) {
            System.out.println("Bấm 1 để Thêm sản một phẩm mới");
            System.out.println("Bấm 2 để sửa thông tin sp theo ID");
            System.out.println("Bấm 3 để xóa sp theo ID");
            System.out.println("Bấm 4 để hiển thị danh sách sp");
            System.out.println("Bấm 5 để tìm sp theo tên");
            System.out.println("Bấm 6 để sắp xếp sản phẩm tăng dần hoặc giảm dần theo giá");
            System.out.println("Bấm 7 để thoát");
            option = Integer.parseInt(in.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhập tên sản phẩm");
                    product = in.nextLine();
                    System.out.println("nhập giá tiền của sản phẩm");
                    money = Double.parseDouble(in.nextLine());
                    System.out.println("nhập Id của sản phẩm");
                    id = Integer.parseInt(in.nextLine());
                    manager = new ProductManager(product, money, id);
                    productManagers.add(manager);
                    break;
                case 2:
                    System.out.println("Nhập ID để sửa sản phẩm");
                    id = Integer.parseInt(in.nextLine());
                    for (int i = 0; i < productManagers.size(); i++) {
                        if (id == productManagers.get(i).getId()) {
                            productManagers.remove(i);
                            System.out.println("Nhập lại tên sản phẩm");
                            product = in.nextLine();
                            System.out.println("nhập lại giá tiền của sản phẩm");
                            money = Double.parseDouble(in.nextLine());
                            System.out.println("nhập lại Id của sản phẩm");
                            id = Integer.parseInt(in.nextLine());
                            manager.changeProduct(product, money, id);
                            productManagers.add(i, manager);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập ID để xóa sản phẩm");
                    id = Integer.parseInt(in.nextLine());
                    for (int i = 0; i < productManagers.size(); i++) {
                        if (id == productManagers.get(i).getId()) {
                            productManagers.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println(productManagers + "\n");
                    break;

                case 5:
                    System.out.println("nhập tên sản phẩm để tìm");
                    product = in.nextLine();
                    for (int i = 0; i < productManagers.size(); i++) {
                        System.out.println(productManagers.get(i).getProduct());
                        if (product.equals(productManagers.get(i).getProduct())) {
                            System.out.println("Sản phẩm bạn cần tìm là:");
                            System.out.println(productManagers.get(i));
                        } else {
                            System.out.println("sản phẩm của bạn không có trong danh sách");
                        }

                    }
                    break;
                case 6:
//                    System.out.println("chọn 1 để xếp tăng/ 2 để giảm");
//                    int b = in.nextInt();
//                    if (b == 1) {
                        Collections.sort(productManagers, new ProductManager());
//                    } else if( b==2){
//                        Collections.sort(productManagers, new ProductManager());
//                    }
                    break;
            }
        }


    }


}
