package com.example.list;

import java.util.ArrayList;

class Boook {
    int id;
    String title;
    String author;
    String publisher;
    int year;
    int pages;
    int price;


    public Boook(int id, String title, String author, String publisher, int year, int pages, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this. publisher = publisher ;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public class task5 {
        public String main(String[] args) {
            ArrayList<Boook> bookArrayList = new ArrayList<>();
            Boook book1 = new Boook(1,"Abai joly",  "M.Auezov", "Almaty", 1959,500,10000);
            Boook book2 = new Boook(2,"Koshpendiler",  "I.Esenberlin", "Taraz", 1999,700,5000);
            Boook book3 = new Boook(3,"Kemel adam",  "K.Zholdybaiuly", "Astana", 2020,300,6000);


            bookArrayList.add(book1);
            bookArrayList.add(book2);
            bookArrayList.add(book3);



            public String toString(){
                return "Book{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", publisher='" + publisher + '\'' +
                        ", year=" + year +
                        ", pages=" + pages +
                        ", price=" + price +
                        '}';
            }

        }
    }
}
