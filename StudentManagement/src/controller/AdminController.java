package controller;

import model.GiftedDepartment;
import model.SciencesDepartment;
import model.SocialDepartment;
import model.Student;
import storage.IReadWriteFile;
import storage.ReadWriteFile;

import java.util.List;
import java.util.Scanner;

public class AdminController {
    private static IReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    public static List<Student> studentList = readWriteFile.readFile();
    public static void addNewStudent(Student student){
        studentList.add(student);
        readWriteFile.writeFile(studentList);
    }
    public static void editInfoById(List<Student> studentList) {
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Nhập id sinh viên cần sửa thông tin");
        String idUser = sc5.nextLine();
        editUserInfoByID(idUser, AdminController.studentList);
        readWriteFile.writeFile(studentList);
    }
    public static void editPointById() {
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Nhập id sinh viên cần sửa điểm");
        String idUser = sc7.nextLine();
        editUserPointByID(idUser, studentList);
        readWriteFile.writeFile(studentList);
    }

    public static void deleteByIndex(int index) {
        studentList.remove(index);
        readWriteFile.writeFile(studentList);
    }
    public static Student createGiftedStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = sc.nextLine();
        System.out.println("Nhập tên");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("Nhập giới tính");
        sc.nextLine();
        String sex = sc.nextLine();
        System.out.println("Nhập chuyên ngành");
        String major = sc.nextLine();
        System.out.println("Nhập điểm hội họa");
        double artPoint = sc.nextDouble();
        System.out.println("Nhập điểm điêu khắc");
        double sculpturePoint = sc.nextDouble();
        System.out.println("Nhập điểm tạo hình");
        double shapingPoint = sc.nextDouble();
        Student giftedStudent = new GiftedDepartment(id,name,age,sex,major,artPoint,sculpturePoint,shapingPoint);
        return giftedStudent;
    }
    public static Student createSciencesStudent() {
        Scanner sc2 = new Scanner(System.in);
        String id = sc2.nextLine();
        String name = sc2.nextLine();
        int age = sc2.nextInt();
        String sex = sc2.nextLine();
        String major = sc2.nextLine();
        double mathPoint = sc2.nextDouble();
        double chemistryPoint = sc2.nextDouble();
        double physicsPoint = sc2.nextDouble();
        Student sciencesStudent = new GiftedDepartment(id,name,age,sex,major,mathPoint,chemistryPoint,physicsPoint);
        return sciencesStudent;
    }
    public static Student createSocialStudent() {
        Scanner sc3 = new Scanner(System.in);
        String id = sc3.nextLine();
        String name = sc3.nextLine();
        int age = sc3.nextInt();
        String sex = sc3.nextLine();
        String major = sc3.nextLine();
        double literaturePoint = sc3.nextDouble();
        double historyPoint = sc3.nextDouble();
        double geographyPoint = sc3.nextDouble();
        Student giftedStudent = new GiftedDepartment(id,name,age,sex,major,literaturePoint,historyPoint,geographyPoint);
        return giftedStudent;
    }
    public static void editUserInfoByID(String id, List<Student> studentList) {
        Scanner sc4 = new Scanner(System.in);
        for (Student i : studentList) {
            if (i.getId().equals(id)) {
                int choice = -1;
                while (choice!=0) {
                    System.out.println("Chọn thông tin cần sửa");
                    System.out.println("1. ID");
                    System.out.println("2. Tên");
                    System.out.println("3. Tuổi");
                    System.out.println("4. Giới tính");
                    System.out.println("5. Exit");
                    int select = sc4.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("ID");
                            String newID = sc4.nextLine();
                            i.setId(newID);
                            break;
                        case 2:
                            System.out.println("Tên");
                            String newName = sc4.nextLine();
                            break;
                        case 3:
                            System.out.println("Tuổi");
                            int newAge = sc4.nextInt();
                            break;
                        case 4:
                            System.out.println("Giới tính");
                            String newSex = sc4.nextLine();
                            break;
                        case 5:
                            System.exit(0);
                    }
                }
            } else {
                System.out.println("Sinh viên không tồn tại");
            }
        }
    }
    public static void editUserPointByID(String id, List<Student> studentList) {
        Scanner sc6 = new Scanner(System.in);
        for (Student i : studentList) {
            if (i.getId().equals(id)) {
                if (i.getMajor().equals("Gifted")) {
                    int choice = -1;
                    while (choice != 0) {
                        System.out.println("Nhập điểm cần sửa");
                        System.out.println("1. Điểm hội họa");
                        System.out.println("2. Điểm điêu khắc");
                        System.out.println("3. Điểm tạo hình");
                        System.out.println("4. Thoát");
                        int select = sc6.nextInt();
                        switch (select) {
                            case 1:
                                GiftedDepartment g = (GiftedDepartment) i;
                                System.out.println("Nhập điểm hội họa cần sửa");
                                double newPoint1 = sc6.nextDouble();
                                g.setArtPoint(newPoint1);
                                break;
                            case 2:
                                GiftedDepartment h = (GiftedDepartment) i;
                                System.out.println("Nhập điểm điêu khắc cần sửa");
                                double newPoint2 = sc6.nextDouble();
                                h.setSculpturePoint(newPoint2);
                                break;
                            case 3:
                                GiftedDepartment j = (GiftedDepartment) i;
                                System.out.println("Nhập điểm điêu khắc cần sửa");
                                double newPoint3 = sc6.nextDouble();
                                j.setShapingPoint(newPoint3);
                                break;
                            case 4:
                                System.exit(0);
                        }
                    }
                } else if (i.getMajor().equals("Sciences")) {
                    int choice = -1;
                    while (choice != 0) {
                        System.out.println("Nhập điểm cần sửa");
                        System.out.println("1. Điểm toán");
                        System.out.println("2. Điểm hóa học");
                        System.out.println("3. Điểm vật lý");
                        System.out.println("4. Thoát");
                        int select = sc6.nextInt();
                        switch (select) {
                            case 1:
                                SciencesDepartment g = (SciencesDepartment) i;
                                System.out.println("Nhập điểm hội họa cần sửa");
                                double newPoint1 = sc6.nextDouble();
                                g.setMathPoint(newPoint1);
                                break;
                            case 2:
                                SciencesDepartment h = (SciencesDepartment) i;
                                System.out.println("Nhập điểm hóa học cần sửa");
                                double newPoint2 = sc6.nextDouble();
                                h.setChemistryPoint(newPoint2);
                                break;
                            case 3:
                                SciencesDepartment j = (SciencesDepartment) i;
                                System.out.println("Nhập điểm vật lý cần sửa");
                                double newPoint3 = sc6.nextDouble();
                                j.setPhysicsPoint(newPoint3);
                                break;
                            case 4:
                                System.exit(0);
                        }
                    }
                } else if (i.getMajor().equals("Social")) {
                    int choice = -1;
                    while (choice != 0) {
                        System.out.println("Nhập điểm cần sửa");
                        System.out.println("1. Điểm văn");
                        System.out.println("2. Điểm lịch sử");
                        System.out.println("3. Điểm địa lý");
                        System.out.println("4. Thoát");
                        int select = sc6.nextInt();
                        switch (select) {
                            case 1:
                                SocialDepartment g = (SocialDepartment) i;
                                System.out.println("Nhập điểm văn cần sửa");
                                double newPoint1 = sc6.nextDouble();
                                g.setLiteraturePoint(newPoint1);
                                break;
                            case 2:
                                SocialDepartment h = (SocialDepartment) i;
                                System.out.println("Nhập điểm lịch sử cần sửa");
                                double newPoint2 = sc6.nextDouble();
                                h.setHistoryPoint(newPoint2);
                                break;
                            case 3:
                                SocialDepartment j = (SocialDepartment) i;
                                System.out.println("Nhập điểm địa lý cần sửa");
                                double newPoint3 = sc6.nextDouble();
                                j.setGeographyPoint(newPoint3);
                                break;
                            case 4:
                                System.exit(0);
                        }
                    }
                }
            }
        }
    }
}
