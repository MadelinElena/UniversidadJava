package com.universidad.model;

public class PartTimeTeacher extends Teacher {
    private int hoursPerWeek;

    public PartTimeTeacher(String name, double baseSalary, int hoursPerWeek) {
        super(name, baseSalary);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursPerWeek;
    }

    @Override
    public String toString() {
        return "[Part Time] " + super.toString() + ", Horas/semana: " + hoursPerWeek;
    }
}
