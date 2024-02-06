package wk5;

import java.util.ArrayList;

public class College {
    String name, address;
    private int numberOfStudents = 1000;

    private double tuitionAmount = 2000;

    private double revenue;
    private ArrayList<String> availablePrograms;
    private String selectedProgram;

    public College(){}

    public int getNumberOfStudents() {

        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        if(numberOfStudents >= 1000)
            this.numberOfStudents = numberOfStudents;
    }

    public double getTuitionAmount() {
        return tuitionAmount;
    }

    public void setTuitionAmount(double tuitionAmount) {
        if(tuitionAmount >= 2000)
            this.tuitionAmount = tuitionAmount;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue() {
        revenue = numberOfStudents * tuitionAmount;
    }

    public String getSelectedProgram() {
        return selectedProgram;
    }

    public void setSelectedProgram(String selectedProgram) {

        availablePrograms.add("Computer Studies");
        availablePrograms.add("business");
        availablePrograms.add("Design");
        if(availablePrograms.contains(selectedProgram))
            this.selectedProgram = selectedProgram;
        else
            this.selectedProgram = availablePrograms.get(0);

    }
    public boolean manyStudentsEnrolled(){
        return numberOfStudents >= 5000;
    }

    public College(String name, String address, int numberOfStudents, String selectedProgram) {
        this.name = name;
        this.address = address;
        setNumberOfStudents(numberOfStudents);
        setSelectedProgram(selectedProgram);
    }
}
