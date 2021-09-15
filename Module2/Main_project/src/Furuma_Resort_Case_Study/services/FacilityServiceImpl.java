package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Employee;
import Furuma_Resort_Case_Study.models.House;
import Furuma_Resort_Case_Study.models.Room;
import Furuma_Resort_Case_Study.models.Villa;
import Furuma_Resort_Case_Study.utils.ReadWriteCSV;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;
import static Furuma_Resort_Case_Study.data.data.facility;

public class FacilityServiceImpl implements FacilityService {
    final String PATH_FACILITY = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\facility_service_database.csv";
    private boolean isCreated = false;
    final String PATH_HOUSE = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\house_database.csv";
    final String PATH_VILLA = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\villa_database.csv";
    final String PATH_ROOM = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\room.csv";

    Room roomlist = new Room();
    House houselist = new House();
    Villa villalist = new Villa();

    public LinkedHashMap<House,Integer> facilityHouselist= new LinkedHashMap<House, Integer>();
    public static LinkedHashMap<Villa, Integer> facilityVillalist= new LinkedHashMap<Villa, Integer>();
    public static LinkedHashMap<Room, Integer> facilityRoomlist= new LinkedHashMap<Room, Integer>();
    public void displayFacilityMenu() {
        FuramaController furamaController = new FuramaController();
        int room=0;
        int villa=0;
        int house=0;
        int value = 0;
        while (true) {
            System.out.println("1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Delete facility service\n" +
                    "5 Return main menu");
            value = selectionmenu();
            switch (value) {
                case 1:
                     show();
                     break;
                case 2:
                    System.out.println("1. Add new house\n" + "2. Add new villa\n" + "3. Add new room\n" + "4. return FacilityMenu");
                    int choose1 = selectionmenu();
                    switch (choose1) {
                        case 1:
                            System.out.println("Adding a new house");
                            addhouse(houselist);
                            facility.add(houselist);
                            house++;
                            facilityHouselist.put(houselist,house);
                            ReadWriteCSV.writeListHouseToCSV(facility, PATH_HOUSE, true);

                            break;
                        case 2:
                            System.out.println("Adding a new villa");
                            addvilla(villalist);
                            facility.add(villalist);
                            villa++;
                            facilityVillalist.put(villalist,villa);
                            ReadWriteCSV.writeListVillaToCSV(facility, PATH_VILLA, true);
                            break;
                        case 3:
                            System.out.println("Adding a new room");
                            addroom(roomlist);
                            facility.add(roomlist);
                            room++;
                            facilityRoomlist.put(roomlist,room);
                            ReadWriteCSV.writeListRoomToCSV(facility, PATH_ROOM, true);
                            break;
                        case 4:
                            displayFacilityMenu();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Show house\n" + "2. Show villa\n" + "3. Show room\n" + "4. return FacilityMenu");
                    int choose = selectionmenu();
                    switch (choose){
                        case 1:
                            System.out.println(facilityHouselist.get(houselist));
                            break;
                        case 2:
                            System.out.println(facilityVillalist.get(villalist));
                            break;
                        case 3:
                            System.out.println(facilityRoomlist.get(roomlist));
                            break;
                        case 4:
                            displayFacilityMenu();
                            break;
                    }
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
        System.out.println("1. Show house\n" + "2. Show villa\n" + "3. Show room\n" + "4. return FacilityMenu");
        int choose=selectionmenu();
        if (choose == 1) {
            List<House> houseList = ReadWriteCSV.getListHouseFromCSV(PATH_HOUSE);
            for (int i = 0; i < houseList.size(); i++) {
                System.out.println((i + 1) + ". " + houseList.get(i));
            }
        } else if (choose==2){
            List<Villa> villaList = ReadWriteCSV.getListVillaFromCSV(PATH_VILLA);
            for (int i = 0; i < villaList.size(); i++) {
                System.out.println((i + 1) + ". " + villaList.get(i));
            }
        } else if (choose==3){
            List<Room> roomList = ReadWriteCSV.getListRoomFromCSV(PATH_ROOM);
            for (int i = 0; i < roomList.size(); i++) {
                System.out.println((i + 1) + ". " + roomList.get(i));
            }
        }
        else if (choose==4){
         displayFacilityMenu();
        }
    }

    @Override
    public String edit() {
        return null;
    }

    @Override
    public void add(Object o) {
    }

    public void addhouse(Object o) {
        House house = new House();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Square of house " + ((isCreated) ? house.getSquare() : " ") + ": ");
        house.setSquare(Double.parseDouble(sc.nextLine()));

        System.out.println("Enter Sotang " + ((isCreated) ? house.getSotang() : " ") + ": ");
        house.setSotang(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter number of people " + ((isCreated) ? house.getPeople() : " ") + ": ");
        house.setPeople(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter your KieuThue " + ((isCreated) ? house.getKieuThue() : " ") + ": ");
        house.setKieuThue(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter cost " + ((isCreated) ? house.getCost() : " ") + ": ");
        house.setCost(Double.parseDouble(sc.nextLine()));

        System.out.println("Enter Tendichvu" + ((isCreated) ? house.getTendichvu() : " ") + ": ");
        house.setTendichvu(sc.nextLine());

        System.out.println("Enter Tieuchuanphong " + ((isCreated) ? house.getTieuchuanphong() : " ") + ": ");
        house.setTieuchuanphong(sc.nextLine());
        if (!isCreated) {
            isCreated = true;
        }
        houselist = house;
    }

    public void addvilla(Object o) {
        Villa villa = new Villa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Square of villa " + ((isCreated) ? villa.getSquare() : " ") + ": ");
        villa.setSquare(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter Squarehoboi of villa " + ((isCreated) ? villa.getSquarehoboi() : " ") + ": ");
        villa.setSquarehoboi(Double.parseDouble(sc.nextLine()));

        System.out.println("Enter Sotang " + ((isCreated) ? villa.getSotang() : " ") + ": ");
        villa.setSotang(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter Tieuchuanphong " + ((isCreated) ? villa.getTieuchuanphong() : " ") + ": ");
        villa.setTieuchuanphong(sc.nextLine());
        System.out.println("Enter Tendichvu" + ((isCreated) ? villa.getTendichvu() : " ") + ": ");
        villa.setTendichvu(sc.nextLine());

        System.out.println("Enter cost " + ((isCreated) ? villa.getCost() : " ") + ": ");
        villa.setCost(Double.parseDouble(sc.nextLine()));

        System.out.println("Enter your KieuThue " + ((isCreated) ? villa.getKieuThue() : " ") + ": ");
        villa.setKieuThue(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter number of people " + ((isCreated) ? villa.getPeople() : " ") + ": ");
        villa.setPeople(Integer.parseInt(sc.nextLine()));
        if (!isCreated) {
            isCreated = true;
        }
        villalist = villa;
    }

    public void addroom(Object o) {
        Room room = new Room();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Square of room " + ((isCreated) ? room.getSquare() : " ") + ": ");
        room.setSquare(Double.parseDouble(sc.nextLine()));


        System.out.println("Enter number of people " + ((isCreated) ? room.getPeople() : " ") + ": ");
        room.setPeople(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter your KieuThue " + ((isCreated) ? room.getKieuThue() : " ") + ": ");
        room.setKieuThue(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter cost " + ((isCreated) ? room.getCost() : " ") + ": ");
        room.setCost(Double.parseDouble(sc.nextLine()));

        System.out.println("Enter Tendichvu" + ((isCreated) ? room.getTendichvu() : " ") + ": ");
        room.setTendichvu(sc.nextLine());


        if (!isCreated) {
            isCreated = true;
        }
        roomlist = room;

    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("1. Xóa House\n2. Xóa Villa\n3. Xóa Room\n4. Về menu\n5 Show danh sach");
        int choose = selectionmenu();

        if (choose == 1) {
            List<Room> roomList = ReadWriteCSV.getListRoomFromCSV(PATH_ROOM);
            System.out.println("chọn số phòng khách đã trả");
            int traphong = Integer.parseInt(scanner.nextLine());
            roomList.remove(traphong - 1);
            ReadWriteCSV.writeListRoomToCSV(roomList, PATH_ROOM, false);
        } else if (choose == 2) {
            List<Villa> villaList = ReadWriteCSV.getListVillaFromCSV(PATH_ROOM);
            System.out.println("chọn số phòng khách đã trả");
            int traphong = Integer.parseInt(scanner.nextLine());
            villaList.remove(traphong - 1);
            ReadWriteCSV.writeListVillaToCSV(villaList, PATH_ROOM, false);
        } else if(choose==3){
            List<Room> roomList = ReadWriteCSV.getListRoomFromCSV(PATH_ROOM);
            System.out.println("chọn số phòng khách đã trả");
            int traphong = Integer.parseInt(scanner.nextLine());
            roomList.remove(traphong - 1);
            ReadWriteCSV.writeListRoomToCSV(roomList, PATH_ROOM, false);
        } else if (choose==5){
            displayFacilityMenu();
        } else {
            show();
        }
    }
}
