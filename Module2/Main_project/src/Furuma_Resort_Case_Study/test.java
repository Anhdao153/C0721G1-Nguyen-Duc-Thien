package Furuma_Resort_Case_Study;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Villa;

public class test {
    public static void main(String[] args) {
        FuramaController menu=new FuramaController();
        Villa villa=new Villa();
        System.out.println(villa.TenDichVu());

        villa.DienTichPhong();

        System.out.println(villa.getSquare());

        villa.SoNguoiToida();

        villa.KieuThue();

        villa.ChiPhiThue();

        System.out.println(villa.getCost());
    }
}
