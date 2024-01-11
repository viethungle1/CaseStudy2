package view;

import controller.Controller;
import mananger.StudentManager;
import model.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("----------MENU----------");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên khỏi danh sách");
            System.out.println("5. Kết quả học tập của sinh viên");
            System.out.println("6. Sắp xếp sinh viên theo tuổi");
            System.out.println("0. Exit");
            System.out.print("=> Enter a number: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Controller.showList();
                    break;
                case 2:
                    System.out.println("---THÊM SINH VIÊN---");
                    System.out.println("1. Năng khiếu");
                    System.out.println("2. Tự nhiên");
                    System.out.println("3. Xã hội");
                    System.out.print("Nhập: ");
                    int select = Controller.inputInt();
                    switch (select) {
                        case 1:
                            Controller.addNewGiftedStudent();
                            System.out.println("Thêm thành công");
                            break;
                        case 2:
                            Controller.addNewSciencesStudent();
                            System.out.println("Thêm thành công");
                            break;
                        case 3:
                            Controller.addNewSocialStudent();
                            System.out.println("Thêm thành công");
                            break;
                    }
                    break;
                case 3:
                    Controller.showList();
                    System.out.println("---SỬA THÔNG TIN SINH VIÊN---");
                    System.out.println("1. Sửa thông tin sinh viên");
                    System.out.println("2. Sửa điểm sinh viên");
                    System.out.print("Nhập: ");
                    int selected = Controller.inputInt();
                    switch (selected) {
                        case 1:
                            System.out.println("Nhập id sinh viên cần sửa thông tin");
                            Controller.editInfoById();
                            break;
                        case 2:
                            System.out.println("Nhập id sinh viên cần sửa điểm");
                            Controller.editPointById();
                            break;
                    }
                    break;
                case 4:
                    Controller.showList();
                    System.out.println("---XÓA SINH VIÊN KHỎI DANH SÁCH");
                    System.out.println("Nhập vị trí sinh viên cần xóa");
                    Controller.deleteByIndex();
                    System.out.println("Xóa thành công");
                    break;
                case 5:
                    System.out.println("---XEM KẾT QUẢ HỌC TẬP CỦA SINH VIÊN---");
                    System.out.println("1. Xem kết quả học tập của sinh viên năng khiếu");
                    System.out.println("2. Xem kết quả học tập của sinh viên tự nhiên");
                    System.out.println("3. Xem kết quả học tập của sinh viên xã hội");
                    System.out.print("Nhập: ");
                    int selected2 = Controller.inputInt();
                    switch (selected2) {
                        case 1:
                            System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
                            Controller.evaluateGifted();
                            System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
                            break;
                        case 2:
                            System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
                            Controller.evaluateSciences();
                            System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
                            break;
                        case 3:
                            System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
                            Controller.evaluateSocial();
                            System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("---SẮP XẾP SINH VIÊN---");
                    System.out.println("1. Sắp xếp theo id");
                    System.out.println("2. Sắp xếp theo tên");
                    System.out.println("3. Sắp xếp theo tuổi");
                    System.out.print("Nhập: ");
                    int selected3 = Controller.inputInt();
                    switch (selected3) {
                        case 1:
                            StudentManager.sortByID(Controller.studentList);
                            break;
                        case 2:
                            StudentManager.sortByName(Controller.studentList);
                            break;
                        case 3:
                            StudentManager.sortByAge(Controller.studentList);
                            break;
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}