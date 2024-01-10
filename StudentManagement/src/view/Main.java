package view;

import controller.AdminController;
import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập đối tượng cần khởi tạo");
//        String student = scanner.nextLine();
//        AdminController.addNewStudent(StudentFactory.getAnimal(student));
        AdminController.deleteByIndex(0);
        for (Student i : AdminController.studentList) {
            System.out.println(i);
        }
    }
}