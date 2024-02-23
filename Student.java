

public class Student {
    String name;
    int rollno;
    int year;
    String course;


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRollno() {

        return rollno;
    }

    public void setRollno(int rollno) {

        this.rollno = rollno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

public static void main(String[] args){

        Student S= new Student();
        S.setName("Aman");
        S.setRollno(1143);
        S.setYear(3);
        S.setCourse("B.Tech");
        System.out.println("The Name is "+S.getName()+"\n"+"The Roll is "+S.getRollno()+"\n"+"The Year is "+S.getYear()+"rd"+"\n"+"The Course is "+S.getCourse()+"\n");
    }


}
