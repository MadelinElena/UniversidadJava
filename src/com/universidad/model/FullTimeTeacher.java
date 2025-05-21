package com.universidad.model;

public class FullTimeTeacher extends Teacher {
    private int yearsExperience;

    public FullTimeTeacher(String name, double baseSalary, int yearsExperience) {
        super(name, baseSalary);
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * (1 + 0.1 * yearsExperience);
    }

    @Override
    public String toString() {
        return "[Full Time] " + super.toString() + ", Años de experiencia: " + yearsExperience;
    }
}
