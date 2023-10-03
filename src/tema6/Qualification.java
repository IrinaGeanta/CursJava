package tema6;

import curs7.Tester;

public class Qualification extends Teacher {

    public Qualification(String course, int experienceYears, String schedule){
        super.course = course;
        super.experienceYears = experienceYears;
        super.schedule = schedule;
    }

    public boolean verify(Qualification qualification){
        if ((qualification.experienceYears>3) && qualification.course.toUpperCase().equals("JAVA") && qualification.schedule.toUpperCase().equals("AFTERNOON")){
            return true;
        }
        return false;
    }

    public void printVerify(Qualification qualification){
        if (verify(qualification)){
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }
}
