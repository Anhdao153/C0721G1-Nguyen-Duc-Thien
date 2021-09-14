package Furuma_Resort_Case_Study;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.*;
import Furuma_Resort_Case_Study.services.EmployeeServiceImpl;

public class test {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService =new EmployeeServiceImpl();
       // Employee employee =new Employee();

        employeeService.add(employeeService);

        System.out.println(employeeService.employee1.toString());


    }
}
