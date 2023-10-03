package tema6;

import curs7.Tester;

public class Qualification extends Teacher {

    public Qualification(String course, int experienceYears, String schedule){
        super.course = course;
        super.experienceYears = experienceYears;
        super.schedule = schedule;
    }

    public boolean verify(){
        if ((experienceYears>3) && course.toUpperCase().equals("JAVA") && schedule.toUpperCase().equals("AFTERNOON")){
            return true;
        }
        return false;
    }

    public void printVerify(){
        if (verify()){
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }
}
