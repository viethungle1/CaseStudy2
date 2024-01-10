package model;

public class GiftedDepartment extends Student {
    public static final int NUMBEROFSUBJECT = 3;
    private double artPoint;
    private double sculpturePoint;
    private double shapingPoint;
    public GiftedDepartment() {
    }
    public GiftedDepartment(String id, String name, int age, String sex, String major, double artPoint, double sculpturePoint, double shapingPoint) {
        super(id, name, age, sex, major);
        this.artPoint = artPoint;
        this.sculpturePoint = sculpturePoint;
        this.shapingPoint = shapingPoint;
    }
    public double getArtPoint() {
        return artPoint;
    }
    public void setArtPoint(double artPoint) {
        this.artPoint = artPoint;
    }
    public double getSculpturePoint() {
        return sculpturePoint;
    }
    public void setSculpturePoint(double sculpturePoint) {
        this.sculpturePoint = sculpturePoint;
    }
    public double getShapingPoint() {
        return shapingPoint;
    }
    public void setShapingPoint(double shapingPoint) {
        this.shapingPoint = shapingPoint;
    }

    @Override
    public String toString() {
        return "GiftedStudent { " +super.toString()+
                ", artPoint=" + artPoint +
                ", sculpturePoint=" + sculpturePoint +
                ", shapingPoint=" + shapingPoint +
                '}';
    }

    @Override
    public double averageOfSubject(){
        double averagePoint;
        averagePoint = this.artPoint + this.sculpturePoint + this.shapingPoint;
        return averagePoint/ NUMBEROFSUBJECT;
    }
    @Override
    public void conduct() {
    }

}
