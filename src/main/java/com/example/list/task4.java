package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Applicant{
    int id;
    String surname;
    String name;
    String adress;
    String phoneNum;
    int grade;

    public Applicant(int id, String surname, String name,  String adress, String phoneNum, int grade) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.grade = grade;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public class task4 {
        public void main(String[] args) {
            ArrayList<Applicant> applicantArrayList = new ArrayList<>();
            Applicant applicant1 = new Applicant(1, "Khusni Khorlan", "Zhambylkyzy", "Asa 33", "87766457474", 5);
            Applicant applicant2 = new Applicant(2, "Tamila", "Alzhan", "Kirova 6", "87766037484", 3);
            Applicant applicant3 = new Applicant(3, "Kudaibergen", "Yernar", "Voinskaya 2A 22", "87766644744", 4);
            Applicant applicant4 = new Applicant(4, "Bakhytzhan", "Myktybaev", "Pushkin 154", "87766467466", 2);
            Applicant applicant5 = new Applicant(5, "Dias", "Orisbek", "Zhansaya 29", "87753339595", 0);


            applicantArrayList.add(applicant1);
            applicantArrayList.add(applicant2);
            applicantArrayList.add(applicant3);
            applicantArrayList.add(applicant4);
            applicantArrayList.add(applicant5);

            for (Applicant s : applicantArrayList){
                if (s.getGrade() < 70){
                    System.out.println(s.getName() + " " + s.surname + " doesn't have enough grades to 70: " + s.getGrade());
                }
            }

            //passed
            for (Applicant s : applicantArrayList){
                if (s.getGrade() >= 70){
                    System.out.println(s.getName() + " " + s.surname + " has more grades than 70: " + s.getGrade());
                }
            }

            //TOP 3 highest grades
            Collections.sort(applicantArrayList, new SortByGrade());
            System.out.println("students with TOP 3 highest scores: ");
            for ( int i = 0; i < 3; i++){
                System.out.println(applicantArrayList.get(i));
            }
        }
    }


        @Override
        public String toString() {
            return "Abiturent{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", adress='" + adress + '\'' +
                    ", phoneNum='" + phoneNum + '\'' +
                    ", grade=" + grade +
                    '}';
        }


    }
class SortByGrade implements Comparator<Applicant> {
    @Override
    public int compare(Applicant o1, Applicant o2) {
        if (o1.getGrade() == o2.getGrade())
            return 0;
        if (o1.getGrade() > o2.getGrade())
            return -1;
        else
            return 1;
    }
}

