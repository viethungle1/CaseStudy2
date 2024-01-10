package model;

import controller.AdminController;

public class Studentt {
    public static Student getAnimal(String type) {
        if ("gifted".equals(type)) {
            System.out.println("Nhập thành công");
            return AdminController.createGiftedStudent();
        } else if ("sciences".equals(type)){
            System.out.println("Nhập thành công");
            return AdminController.createSciencesStudent();
        } else if ("social".equals(type)){
            System.out.println("Nhập thành công");
            return AdminController.createSocialStudent();
        } else {
            System.out.println("Nhập lại");
            return null;
        }
    }
}
