package logic;

import java.util.Objects;

public class Student {
    String name;
    String surName;
    String groupNumber;
    double chemistryRating;
    double physicsRating;
    double englishRating;
    double overallRating;

    public Student(String name, String surName, String groupNumber,
                   double chemistryRating, double physicsRating, double englishRating) {
        this.name = name;
        this.surName = surName;
        this.groupNumber = groupNumber;
        this.chemistryRating = chemistryRating;
        this.physicsRating = physicsRating;
        this.englishRating = englishRating;
    }

    public Student(String name, String surName, String groupNumber,
                   double chemistryRating, double physicsRating, double englishRating, double overallRating) {
        this.name = name;
        this.surName = surName;
        this.groupNumber = groupNumber;
        this.chemistryRating = chemistryRating;
        this.physicsRating = physicsRating;
        this.englishRating = englishRating;
        this.overallRating = overallRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getChemistryRating() {
        return chemistryRating;
    }

    public void setChemistryRating(double chemistryRating) {
        this.chemistryRating = chemistryRating;
    }

    public double getPhysicsRating() {
        return physicsRating;
    }

    public void setPhysicsRating(double physicsRating) {
        this.physicsRating = physicsRating;
    }

    public double getEnglishRating() {
        return englishRating;
    }

    public void setEnglishRating(double englishRating) {
        this.englishRating = englishRating;
    }

    public double getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(double overallRating) {
        this.overallRating = overallRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", chemistryRating=" + chemistryRating +
                ", physicsRating=" + physicsRating +
                ", englishRating=" + englishRating +
                ", overallRating=" + overallRating +
                '}';
    }
}
