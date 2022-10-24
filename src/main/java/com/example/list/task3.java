package com.example.list;

import java.util.ArrayList;


class Patient {
    int id;
    String surname;
    String name;
    String adress;
    int medCard;
    String diagnosis;

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

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String surname, String name, String adress, int medCard, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.adress = adress;
        this.medCard = medCard;
        this.diagnosis = diagnosis;


    }

    public class task2 {
        public void main(String[] args) {
            ArrayList<Patient> patientArrayList = new ArrayList<>();
            Patient patient1 = new Patient(1, "Khusni Khorlan", "Zhambylkyzy", "Asa 33", 1500, "Bronha");
            Patient patient2 = new Patient(2, "Tamila", "Alzhan", "Kirova 6", 6050, "Rak");
            Patient patient3 = new Patient(3, "Kudaibergen", "Yernar", "Voinskaya 2A 22", 9080, "TothAche");
            Patient patient4 = new Patient(4, "Bakhytzhan", "Myktybaev", "Pushkin 154", 2123, "headache");
            Patient patient5 = new Patient(5, "Dias", "Orisbek", "Zhansaya 29", 3040, "stomachache");


            patientArrayList.add(patient1);
            patientArrayList.add(patient2);
            patientArrayList.add(patient3);
            patientArrayList.add(patient4);
            patientArrayList.add(patient5);

            for (Patient s : patientArrayList){
                if(s.getDiagnosis().equals("stomachache")){
                    System.out.println("patient with stomachache: " + s);
                }
            }


            for (Patient s : patientArrayList){
                if (s.getMedCard() > 1500000 && s.getMedCard() < 2500000){
                    System.out.println(s.getName() + " " + s.getSurname() + ", medCard: " + s.getMedCard());
                }
            }
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", adress='" + adress + '\'' +
                    ", medCard=" + medCard +
                    ", diagnosis='" + diagnosis + '\'' +
                    '}';
        }
    }
}
