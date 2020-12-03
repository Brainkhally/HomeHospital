package com.company;

public class Patient  implements Comparable<Patient>{

    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    Patient(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Пациент " +
                "имя='" + name + '\'' +
                ", пол='" + gender + '\'';
    }

    @Override
    public int compareTo(Patient o) {
        return this.name.compareTo(o.name);
    }
}
