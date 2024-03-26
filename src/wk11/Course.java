package wk11;

import java.util.ArrayList;

public class Course implements CollegeCourse{

    private String instructor;

    public ArrayList<String> assignments = new ArrayList<>();
    private ArrayList<String> exams = new ArrayList<>();
    @Override
    public int getStartDate() {
        return 110;
    }

    @Override
    public int getEndDate() {
        return 190;
    }

    @Override
    public String getSyllabus() {
        return "Welcome to your course";
    }

    @Override
    public String getInstructor() {
        return instructor;
    }

    @Override
    public ArrayList<String> getAssignments() {
        return assignments;
    }

    @Override
    public ArrayList<String> getExams() {
        return exams;
    }
}
