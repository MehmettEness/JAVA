package day26lambda;

public class Course {

    /*
    icinde
    1)private variabler
    2)Parametreli ve parametresiz constructorlar
    3)getterlar ve setterlar
    4)toString() methodu
    barındıran methodlr POJO class denir.
    POJO  == Plain Old Java Object
     */

    public String season;
    public String courseName;
    public int avarageScore;
    public int numberOfStudents;


    //1----sag tıkla generate constructor secc...
    public Course(String season, String courseName, int avarageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }

    //2---- sag tıkla generate select none
    public Course() {
    }

    //3----- sag tık generate getter ve setter sec
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //4----sag tıkla generate toString
    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
