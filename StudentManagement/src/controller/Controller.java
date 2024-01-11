package controller;
import mananger.StudentManager;
import model.Student;
import storage.IReadWriteFile;
import storage.ReadWriteFile;
import java.util.List;
import java.util.Scanner;
public class Controller {

    private static IReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    public static List<Student> studentList = readWriteFile.readFile();
    public static void addNewGiftedStudent(){
        studentList.add(StudentManager.createGiftedStudent());
        readWriteFile.writeFile(studentList);
    }
    public static void addNewSciencesStudent(){
        studentList.add(StudentManager.createSciencesStudent());
        readWriteFile.writeFile(studentList);
    }
    public static void addNewSocialStudent(){
        studentList.add(StudentManager.createSocialStudent());
        readWriteFile.writeFile(studentList);
    }

    public static void editInfoById() {
        String idUser = inputString();
        StudentManager.editUserInfoByID(idUser);
        readWriteFile.writeFile(studentList);
    }
    public static void editPointById() {
        String idUser = inputString();
        StudentManager.editUserPointByID(idUser);
        readWriteFile.writeFile(studentList);
    }

    public static void deleteByIndex() {
        int index = inputInt();
        studentList.remove(index-1);
        readWriteFile.writeFile(studentList);
    }
    public static void showList() {
        for (Student i : studentList) {
            System.out.println(i);
        }
    }
    public static void evaluate() {
        StudentManager.achievementGiftedStudent();
        StudentManager.achievementSciencesStudent();
        StudentManager.achienvementSocialStudent();
    }
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
