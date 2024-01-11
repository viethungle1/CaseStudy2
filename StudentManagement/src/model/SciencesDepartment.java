package model;

public class SciencesDepartment extends Student {
    public static final int NUMBEROFSUBJECT = 3;
    private double mathPoint;
    private double chemistryPoint;
    private double physicsPoint;

    public SciencesDepartment() {
    }

    public SciencesDepartment(String id, String name, int age, String sex, String major, double mathPoint, double chemistryPoint, double physicsPoint) {
        super(id, name, age, sex, major);
        this.mathPoint = mathPoint;
        this.chemistryPoint = chemistryPoint;
        this.physicsPoint = physicsPoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public double getPhysicsPoint() {
        return physicsPoint;
    }

    public void setPhysicsPoint(double physicsPoint) {
        this.physicsPoint = physicsPoint;
    }
    @Override
    public String toString() {
        return "SciencesStudent { " +super.toString()+
                ", mathPoint=" + mathPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", physicsPoint=" + physicsPoint +
                '}';
    }

    @Override
    public double averageOfSubject() {
        double averagePoint;
        averagePoint = this.mathPoint+this.chemistryPoint+this.physicsPoint;
        return averagePoint/ NUMBEROFSUBJECT;

    }
}
