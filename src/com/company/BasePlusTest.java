package com.company;

public class BasePlusTest {

    public static void main(String[] args){

        BasePlus mat = new BasePlus("Jack", "Marston", "563", 1000, 0.05, 900);
        System.out.print(mat.toString());
        System.out.println();

        mat.setBaseSalary(950);
        mat.setCommissionRate(0.2);
        mat.setGross(800);
        mat.setLastName("Marston");

        System.out.print(mat.toString());
        System.out.println();

        double earning = mat.earnings();

        System.out.printf("Marston gets %.2f this month!", earning);
        System.out.println();


    }



}