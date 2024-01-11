package mananger;
import controller.Controller;
import model.GiftedDepartment;
import model.SciencesDepartment;
import model.SocialDepartment;
import model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static final String GIFTED = "gifted";
    public static final String SCIENCES = "sciences";
    public static final String SOCIAL = "social";

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

    public static Student createGiftedStudent() {
        System.out.println("Nhập id");
        String id = inputString();
        System.out.println("Nhập tên");
        String name = inputString();
        System.out.println("Nhập tuổi");
        int age = inputInt();
        System.out.println("Nhập giới tính");
        String sex = inputString();
        String major = GIFTED;
        System.out.println("Nhập điểm hội họa");
        double artPoint = inputDouble();
        System.out.println("Nhập điểm điêu khắc");
        double sculpturePoint = inputDouble();
        System.out.println("Nhập điểm tạo hình");
        double shapingPoint = inputDouble();
        Student giftedStudent = new GiftedDepartment(id, name, age, sex, major, artPoint, sculpturePoint, shapingPoint);
        return giftedStudent;
    }

    public static Student createSciencesStudent() {
        System.out.println("Nhập id");
        String id = inputString();
        System.out.println("Nhập tên");
        String name = inputString();
        System.out.println("Nhập tuổi");
        int age = inputInt();
        System.out.println("Nhập giới tính");
        String sex = inputString();
        String major = SCIENCES;
        System.out.println("Nhập điểm toán");
        double mathPoint = inputDouble();
        System.out.println("Nhập điểm hóa học");
        double chemistryPoint = inputDouble();
        System.out.println("Nhập điểm vật lý");
        double physicsPoint = inputDouble();
        Student sciencesStudent = new SciencesDepartment(id, name, age, sex, major, mathPoint, chemistryPoint, physicsPoint);
        return sciencesStudent;
    }

    public static Student createSocialStudent() {
        System.out.println("Nhập id");
        String id = inputString();
        System.out.println("Nhập tên");
        String name = inputString();
        System.out.println("Nhập tuổi");
        int age = inputInt();
        System.out.println("Nhập giới tính");
        String sex = inputString();
        String major = SOCIAL;
        System.out.println("Nhập điểm môn văn");
        double literaturePoint = inputDouble();
        System.out.println("Nhập điểm môn lịch sử");
        double historyPoint = inputDouble();
        System.out.println("Nhập điểm môn địa lý");
        double geographyPoint = inputDouble();
        Student socialStudent = new SocialDepartment(id, name, age, sex, major, literaturePoint, historyPoint, geographyPoint);
        return socialStudent;
    }

    public static void editUserInfoByID(String id) {
        for (Student i : Controller.studentList) {
            if (i.getId().equals(id)) {
                System.out.println("Chọn thông tin cần sửa");
                System.out.println("1. ID");
                System.out.println("2. Tên");
                System.out.println("3. Tuổi");
                System.out.println("4. Giới tính");
                int select = inputInt();
                switch (select) {
                    case 1:
                        System.out.println("ID");
                        String newID = inputString();
                        i.setId(newID);
                        break;
                    case 2:
                        System.out.println("Tên");
                        String newName = inputString();
                        i.setName(newName);
                        break;
                    case 3:
                        System.out.println("Tuổi");
                        int newAge = inputInt();
                        i.setAge(newAge);
                        break;
                    case 4:
                        System.out.println("Giới tính");
                        String newSex = inputString();
                        i.setSex(newSex);
                        break;
                }
            } else {
                System.out.println("Sinh viên không tồn tại");
            }
        }
    }

    public static void editUserPointByID(String id) {
        for (Student i : Controller.studentList) {
            if (i.getId().equals(id)) {
                if (i.getMajor().equals(GIFTED)) {
                    System.out.println("Nhập điểm cần sửa");
                    System.out.println("1. Điểm hội họa");
                    System.out.println("2. Điểm điêu khắc");
                    System.out.println("3. Điểm tạo hình");
                    System.out.println("4. Thoát");
                    int select = inputInt();
                    switch (select) {
                        case 1:
                            GiftedDepartment g = (GiftedDepartment) i;
                            System.out.println("Nhập điểm hội họa cần sửa");
                            double newPoint1 = inputDouble();
                            g.setArtPoint(newPoint1);
                            break;
                        case 2:
                            GiftedDepartment h = (GiftedDepartment) i;
                            System.out.println("Nhập điểm điêu khắc cần sửa");
                            double newPoint2 = inputDouble();
                            h.setSculpturePoint(newPoint2);
                            break;
                        case 3:
                            GiftedDepartment j = (GiftedDepartment) i;
                            System.out.println("Nhập điểm điêu khắc cần sửa");
                            double newPoint3 = inputDouble();
                            j.setShapingPoint(newPoint3);
                            break;
                    }
                }
            } else if (i.getMajor().equals(SCIENCES)) {
                System.out.println("Nhập điểm cần sửa");
                System.out.println("1. Điểm toán");
                System.out.println("2. Điểm hóa học");
                System.out.println("3. Điểm vật lý");
                System.out.println("4. Thoát");
                int select = inputInt();
                switch (select) {
                    case 1:
                        SciencesDepartment g = (SciencesDepartment) i;
                        System.out.println("Nhập điểm hội họa cần sửa");
                        double newPoint1 = inputDouble();
                        g.setMathPoint(newPoint1);
                        break;
                    case 2:
                        SciencesDepartment h = (SciencesDepartment) i;
                        System.out.println("Nhập điểm hóa học cần sửa");
                        double newPoint2 = inputDouble();
                        h.setChemistryPoint(newPoint2);
                        break;
                    case 3:
                        SciencesDepartment j = (SciencesDepartment) i;
                        System.out.println("Nhập điểm vật lý cần sửa");
                        double newPoint3 = inputDouble();
                        j.setPhysicsPoint(newPoint3);
                        break;
                    case 4:
                        System.exit(0);
                }
            } else if (i.getMajor().equals(SOCIAL)) {
                System.out.println("Nhập điểm cần sửa");
                System.out.println("1. Điểm văn");
                System.out.println("2. Điểm lịch sử");
                System.out.println("3. Điểm địa lý");
                System.out.println("4. Thoát");
                int select = inputInt();
                switch (select) {
                    case 1:
                        SocialDepartment g = (SocialDepartment) i;
                        System.out.println("Nhập điểm văn cần sửa");
                        double newPoint1 = inputDouble();
                        g.setLiteraturePoint(newPoint1);
                        break;
                    case 2:
                        SocialDepartment h = (SocialDepartment) i;
                        System.out.println("Nhập điểm lịch sử cần sửa");
                        double newPoint2 = inputDouble();
                        h.setHistoryPoint(newPoint2);
                        break;
                    case 3:
                        SocialDepartment j = (SocialDepartment) i;
                        System.out.println("Nhập điểm địa lý cần sửa");
                        double newPoint3 = inputDouble();
                        j.setGeographyPoint(newPoint3);
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
    }
    public static void achievementGiftedStudent() {
        for (Student i : Controller.studentList) {
            if (i.getMajor().equals(GIFTED)) {
                if (i instanceof GiftedDepartment) {
                    GiftedDepartment h = (GiftedDepartment) i;
                    if (h.averageOfSubject() >= 8 && h.getArtPoint() >= 8 && h.getSculpturePoint() >= 8 && h.getShapingPoint() >= 8) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Tốt");
                    } else if (h.averageOfSubject() >= 6.5 && h.getArtPoint() >= 6.5 && h.getSculpturePoint() >= 6.5 && h.getShapingPoint() >= 6.5) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Khá");
                    } else if (h.averageOfSubject() >= 5 && h.getArtPoint() >= 5 && h.getSculpturePoint() >= 5 && h.getShapingPoint() >= 5) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Trung bình");
                    } else {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Không đạt");
                    }
                }
            }
        }
    }

    public static void achievementSciencesStudent() {
        for (Student i : Controller.studentList) {
            if (i.getMajor().equals(SCIENCES)) {
                if (i instanceof SciencesDepartment) {
                    SciencesDepartment h = (SciencesDepartment) i;
                    if (h.averageOfSubject() >= 8 && h.getMathPoint() >= 8 && h.getChemistryPoint() >= 8 && h.getPhysicsPoint() >= 8) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Tốt");
                    } else if (h.averageOfSubject() >= 6.5 && h.getMathPoint() >= 6.5 && h.getChemistryPoint() >= 6.5 && h.getPhysicsPoint() >= 6.5) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Khá");
                    } else if (h.averageOfSubject() >= 5 && h.getMathPoint() >= 5 && h.getChemistryPoint() >= 5 && h.getPhysicsPoint() >= 5) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Trung bình");
                    } else {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Không đạt");
                    }
                }
            }
        }
    }
        public static void achienvementSocialStudent () {
            for (Student i : Controller.studentList) {
                if (i.getMajor().equals(SOCIAL)) {
                    if (i instanceof SocialDepartment) {
                    SocialDepartment h = (SocialDepartment) i;
                    if (h.averageOfSubject() >= 8 && h.getLiteraturePoint() >= 8 && h.getHistoryPoint() >= 8 && h.getGeographyPoint() >= 8) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Tốt");
                    } else if (h.averageOfSubject() >= 6.5 && h.getLiteraturePoint() >= 6.5 && h.getHistoryPoint() >= 6.5 && h.getGeographyPoint() >= 6.5) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Khá");
                    } else if (h.averageOfSubject() >= 5 && h.getLiteraturePoint() >= 5 && h.getHistoryPoint() >= 5 && h.getGeographyPoint() >= 5) {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Trung bình");
                    } else {
                        System.out.println("id " + h.getId() + " - Họ tên: " + h.getName() + " -kết quả: Không đạt");
                    }
                }
            }
        }
    }
    public static void sortByAge(List<Student> studentList) {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        Collections.sort(studentList,comparator);
    }
    public static void sortByID(List<Student> studentList) {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        Collections.sort(studentList,comparator);
    }
    public static void sortByName(List<Student> studentList) {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(studentList,comparator);
    }
}
