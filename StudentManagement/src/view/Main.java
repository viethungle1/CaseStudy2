package view;

import controller.Controller;

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
            System.out.println("0. Exit");
            System.out.print("=> Enter a number: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Controller.showList();
                    break;
                case 2:
                    System.out.println("Chọn khoa của sinh viên cần thêm mới");
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
                    System.out.println("Lựa chọn thông tin cần sửa");
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
                    System.out.println("Nhập vị trí cần xóa");
                    Controller.deleteByIndex();
                    break;
                case 5:
                    System.out.println("Xếp hạng sinh viên");
                    Controller.evaluate();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}