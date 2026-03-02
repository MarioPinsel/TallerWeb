package org.mypackage.hello;

import java.time.LocalDate;

public class PersonInfo {

    private String fullName;
    private String dateOfBirth; // formato esperado: yyyy-MM-dd
    private int years;

    public PersonInfo() {
        this.fullName = "";
        this.dateOfBirth = "";
        this.years = 0;
    }

    private int calculateYears() {

        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.parse(dateOfBirth);

        int result = today.getYear() - birth.getYear();

        if (today.getMonthValue() < birth.getMonthValue()) {
            result--;
        } else if (today.getMonthValue() == birth.getMonthValue()) {
            if (today.getDayOfMonth() < birth.getDayOfMonth()) {
                result--;
            }
        }

        years = result;
        return years;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYears() {
        return calculateYears();
    }

    public void setYears(int years) {
        this.years = years;
    }
}