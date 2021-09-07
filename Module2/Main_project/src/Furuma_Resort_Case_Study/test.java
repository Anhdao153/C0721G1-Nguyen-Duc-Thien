package Furuma_Resort_Case_Study;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Booking;
import Furuma_Resort_Case_Study.models.House;
import Furuma_Resort_Case_Study.models.Villa;

public class test {
    public static void main(String[] args) {
        FuramaController menu = new FuramaController();
        Villa villa = new Villa();
        House house=new House();
        Booking booking=new Booking();
        System.out.println(villa.TenDichVu());
        System.out.println("Chào mừng bạn đến với dịch vụ phòng");
        System.out.println("Giá phòng hạng villa: 500k/ người | 50k/1m2 | 500k/đêm | 500k/tầng | 50k/1m2 hồ bơi");
        System.out.println("Giá phòng hạng House: 500k/ người | 50k/1m2 | 500k/đêm | 500k/tầng");
//        villa.DienTichPhong();
//
//        //System.out.println(villa.getSquare());
//
//        villa.SoNguoiToida();
//
//        villa.KieuThue();
//
//        villa.SquareHoboi();
//
//        villa.SoTang();
//
//        villa.ChiPhiThue();// 500k/ người | 50k/1m2 | 500k/đêm | 500k/tầng | 50k/1m2 hồ bơi
//
////        System.out.println(villa.getCost());
//       house.DienTichPhong();
//
//        //System.out.println(villa.getSquare());
//
//        house.SoNguoiToida();
//
//        house.KieuThue();
//
//        house.SoTang();
//
//        house.ChiPhiThue();// 500k/ người | 50k/1m2 | 500k/đêm | 500k/tầng
//
//        System.out.println(house.getCost());



    }
}
