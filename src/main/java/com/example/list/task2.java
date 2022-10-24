package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer {
    int id;
    String surname;
    String name;
    int creditCard;
    String adress;
    String bankAccNum;

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



    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public Customer(int id, String surname, String name, int creditCard, String adress, String bankAccNum) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.creditCard = creditCard;
        this.adress = adress;
        this.bankAccNum = bankAccNum;


    }

}



    public class task2 {
        public void main(String[] args) {
            ArrayList<Customer> customerArrayList = new ArrayList<>();
            Customer customer1 = new Customer(1, "Khusni Khorlan", "Zhambylkyzy", 14, "Asa 33", "87766457474");
            Customer customer2 = new Customer(2, "Tamila", "Alzhan", 17, "Kirova 6", "87762358486");
            Customer customer3 = new Customer(3, "Kudaibergen", "Yernar", 29, "Voinskaya 2A 22", "87773849669");
            Customer customer4 = new Customer(4, "Bakhytzhan", "Myktybaev", 18, "Pushkin 154", "87471199701");
            Customer customer5 = new Customer(5, "Dias", "Orisbek", 24, "Zhansaya 29", "87472004249");


            customerArrayList.add(customer1);
            customerArrayList.add(customer2);
            customerArrayList.add(customer3);
            customerArrayList.add(customer4);
            customerArrayList.add(customer5);

                Collections.sort(customerArrayList, new SortByName());
            for (Customer s : customerArrayList){
                System.out.println(s);
            }

            //Interval creditcard
            for (Customer s : customerArrayList){
                if (s.getCreditCard() > 1500000 && s.getCreditCard() < 2500000){
                    System.out.println(s.getName() + " " + s.getSurname() + " " + s.getCreditCard());
                }
            }
        }
    }

class SortByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


