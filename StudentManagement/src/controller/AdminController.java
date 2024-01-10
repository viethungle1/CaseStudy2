package controller;

import model.GiftedDepartment;
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
    public static void editById() {
        readWriteFile.writeFile(studentList);
    }
    public static void deleteByIndex(int index) {
        studentList.remove(index);
        readWriteFile.writeFile(studentList);
    }
    public static Student createGiftedStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = sc.nextInt();
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
        int id = sc2.nextInt();
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
        int id = sc3.nextInt();
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

}
