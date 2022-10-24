package com.example.list;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class  Student {
    int id;
    String name;
    String surname;

    int date;
    int month;
    int year;
    String address;

    String phone;
    String faculty;
    int course;
    String group;


    public Student(int id, String name, String surname, int date, int month, int year, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.month = month;
        this.year = year;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public class task1 {
        public void main(String[] args) {
            ArrayList<Student> studentArrayList = new ArrayList<>();
            Student student1 = new Student(1, "Khusni Khorlan", "Zhambylkyzy", 14, 8, 2002, "Asa 33", "87766457474", "IT", 4, "E");
            Student student2 = new Student(2, "Tamila", "Alzhan", 17, 5, 2005, "Kirova 6", "87762358486", "Translator", 3, "B1");
            Student student3 = new Student(3, "Kudaibergen", "Yernar", 29, 5, 1995, "Voinskaya 2A 22", "87773849669", "Economist", 3, "C2");
            Student student4 = new Student(4, "Bakhytzhan", "Myktybaev", 18, 8, 1990, "Pushkin 154", "87471199701", "IT", 2, "E");
            Student student5 = new Student(5, "Dias", "Orisbek", 24, 9, 2004, "Zhansaya 29", "87472004249", "Design", 1, "F");


            studentArrayList.add(student1);
            studentArrayList.add(student2);
            studentArrayList.add(student3);
            studentArrayList.add(student4);
            studentArrayList.add(student5);



            for (Student s : studentArrayList) {
                if (s.getFaculty().equals("IT")) {
                    System.out.println("IT faculty students: " + s);
                }
            }


            for (Student s : studentArrayList) {
                if (s.getFaculty().equals("IT")) {
                    System.out.println("IT faculty students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getFaculty().equals("Math")) {
                    System.out.println("Math faculty students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getFaculty().equals("Management")) {
                    System.out.println("Management faculty students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getFaculty().equals("Translator")) {
                    System.out.println("Translator faculty students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getFaculty().equals("Economics")) {
                    System.out.println("Economics faculty students: " + s);
                }
            }



            for (Student s : studentArrayList) {
                if (s.getCourse() == 1) {
                    System.out.println("1 course students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getCourse() == 2) {
                    System.out.println("2 course students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getCourse() == 3) {
                    System.out.println("3 course students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getCourse() == 4) {
                    System.out.println("4 course students: " + s);
                }
            }

            for (Student s : studentArrayList) {
                if (s.getYear() > 2004) {
                    System.out.println("students born after 2004 : " + s);
                }
            }

            for (Student s : studentArrayList) {
                System.out.println(s);
            }
        }
    }
}



