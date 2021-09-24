package Bai_Thi.controller;
import Bai_Thi.model.Teacher;
import Bai_Thi.utils.ReadWriteBaiThi;

import java.util.List;

public class TeacherImlp {
    final String PATH_TEACHER="C:\\Users\\This PC\\Desktop\\Thien\\Code\\Thien 2\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Bai_Thi\\data\\teacher.csv";
    public void show(){
        List<Teacher> teacherList= ReadWriteBaiThi.getListTeacherFromCSV(PATH_TEACHER);
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println((i + 1) + ". " + teacherList.get(i));
        }
    }
}
