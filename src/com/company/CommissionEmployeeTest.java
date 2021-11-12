package com.company;

public class CommissionEmployeeTest {

    public static void main(String[] args){

        CommissionEmployee employee = new CommissionEmployee("Bill", "Williamson", "7577381", 600, 0.01);
        System.out.print(employee.toString());
        System.out.println();

        employee.setFirstName("Bill");
        employee.setLastName("Williamson");
        employee.setSocialSecurityNumber("7577381");
        employee.setGross(720);

        System.out.print(employee.toString());




    }
}