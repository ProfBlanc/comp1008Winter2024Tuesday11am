package wk11;

import java.util.ArrayList;

/*
CollegeCourse
    startDate
    endDate
    Syllabus
    instructor
    assignments
    exams
 */
public interface CollegeCourse {
    //constant
    int MIN_START_DATE = 100, MAX_START_DATE = 200;

    int getStartDate();
    int getEndDate();
    String getSyllabus();
    String getInstructor();
    ArrayList<String> getAssignments();
    ArrayList<String> getExams();

}
