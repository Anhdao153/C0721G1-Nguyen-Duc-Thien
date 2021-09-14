package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Employee;
import Furuma_Resort_Case_Study.utils.ReadWriteCSV;

import java.util.List;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;

public class FacilityServiceImpl implements FacilityService {
    final String PATH_FACILITY="D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\facility_service_database.csv";
public void displayFacilityMenu() {
    FuramaController furamaController = new FuramaController();
    int value = 0;
    while (true) {
        System.out.println("1.1 Display list facility\n" +
                "2 Add new facility\n" +
                "3 3 Display list facility maintenance\n" +
                "4 Delete facility service\n" +
                "5 Return main menu");
        value = selectionmenu();
    }
}


    @Override
    public void show() {

    }

    @Override
    public String edit() {
        return null;
    }

    @Override
    public void add(Object o) {


    }

    @Override
    public void delete() {

    }


}
