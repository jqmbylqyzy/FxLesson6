package com.example.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Phone{
    int id;
    String surname;
    String name;
    String adress;
    String creditCardNum;
    int debet;
    int credit;
    int timeInCity;
    int timeAmongCities;

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

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTimeInCity() {
        return timeInCity;
    }

    public void setTimeInCity(int timeInCity) {
        this.timeInCity = timeInCity;
    }

    public Phone(int id, String surname, String name, String adress, String creditCardNum, int debet, int credit, int timeInCity,int timeAmongCities){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.adress = adress;
        this.creditCardNum = creditCardNum;
        this.debet = debet;
        this.credit = credit;
        this.timeInCity = timeInCity;
        this.timeAmongCities = timeAmongCities;
    }




public class task7 {
    public static void main(String[] args) {
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone phone1 = new Phone(1, "Khusni Khorlan", "Zhambylkyzy", "Asa 33", "87766457474", 1282004, 15000, 50000000,52);
        Phone phone2 = new Phone(2, "Tamila", "Alzhan", "Karatau 37A", "87762358486", 2572003, 27000, 20,71852);
        Phone phone3 = new Phone(3, "Kudaibergen", "Yernar", "Voinskaya 2A 22", "87773849669", 1632004, 83000, 15,45612);
        Phone phone4 = new Phone(4, "Bakhytzhan", "Myktybaev", "Pushkin 154", "87471199701", 18102005, 9000, 7,462);
        Phone phone5 = new Phone(5, "Dias", "Orisbek", "Zhansaya 29", "87472004249", 2532005, 51400, , 15,753
        );

        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        phoneArrayList.add(phone4);
        phoneArrayList.add(phone5);


        for (Phone s : phoneArrayList){
            if (s.timeAmongCities > 0){
                System.out.println(s.getId() + " has minutes among city calls: " + s.timeAmongCities);
            }
        }


        for (Phone s : phoneArrayList){
            if (s.timeInCity > 15){
                System.out.println(s.getId() + " has more minutes than 15 in city: " + s.timeInCity);
            }
        }


        for (Phone s : phoneArrayList){
            System.out.println("original list: " + '\n' + s);
        }

        Collections.sort(phoneArrayList, new sortByName());
        for (Phone s : phoneArrayList){
            System.out.println("sorted list: " + '\n' + s);
        }
    }
}

        public String toString() {
            return "Phone{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", adress='" + adress + '\'' +
                    ", creditCardNum='" + creditCardNum + '\'' +
                    ", debet=" + debet +
                    ", credit=" + credit +
                    ", timeInCity=" + timeInCity +
                    '}';

            class SortAtymen implements Comparator<Phone> {
                @Override
                public int compare(Phone o1, Phone o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        }
    }
}
}
