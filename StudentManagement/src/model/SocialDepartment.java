package model;

public class SocialDepartment extends Student {
    public static final int NUMBEROFSUBJECT = 3;
    private double literaturePoint;
    private double historyPoint;
    private double geographyPoint;
    public SocialDepartment() {
    }
    public SocialDepartment(int id, String name, int age, String sex, String major, double literaturePoint, double historyPoint, double geographyPoint) {
        super(id, name, age, sex, major);
        this.literaturePoint = literaturePoint;
        this.historyPoint = historyPoint;
        this.geographyPoint = geographyPoint;
    }
    public double getLiteraturePoint() {
        return literaturePoint;
    }
    public void setLiteraturePoint(double literaturePoint) {
        this.literaturePoint = literaturePoint;
    }
    public double getHistoryPoint() {
        return historyPoint;
    }
    public void setHistoryPoint(double historyPoint) {
        this.historyPoint = historyPoint;
    }
    public double getGeographyPoint() {
        return geographyPoint;
    }
    public void setGeographyPoint(double geographyPoint) {
        this.geographyPoint = geographyPoint;
    }
    @Override
    public double averageOfSubject() {
        double averagePoint;
        averagePoint = this.literaturePoint + this.geographyPoint+this.historyPoint;
        return averagePoint/ NUMBEROFSUBJECT;
    }
    @Override
    public void conduct() {
    }
}
