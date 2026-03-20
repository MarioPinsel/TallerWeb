package org.mypackage.hello;

import java.time.LocalDate;

public class PersonInfo {

    private String name;
    private String birthDate;
    private int age;

    public PersonInfo() {
        this.name = "";
        this.birthDate = "";
        this.age = 0;
    }

    private int calculateAge() {

        if (birthDate == null || birthDate.isEmpty()) {
            return 0;
        }

        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.parse(birthDate);

        int result = today.getYear() - birth.getYear();

        if (today.getMonthValue() < birth.getMonthValue()) {
            result--;
        } else if (today.getMonthValue() == birth.getMonthValue()) {
            if (today.getDayOfMonth() < birth.getDayOfMonth()) {
                result--;
            }
        }

        age = result;
        return age;
    }

    // 🔹 GETTERS Y SETTERS que tu JSP espera

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return calculateAge();
    }

    public void setAge(int age) {
        this.age = age;
    }
}