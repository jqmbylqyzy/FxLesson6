//package com.example.list;

// Copy Paste



//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

//class  Book{
//    String name;
//    String genre;
//    String author;
//    int pages;
//
//    public  Book(String name, String genre, String author, int pages){
//        this.name = name;
//        this.genre = genre;
//        this.author = author;
//        this.pages = pages;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//    public  String toString(){
//        return "Book{" +
//                "name='" + name +
//                ", genre=" + genre +
//                ", author=" + author +
//                ", pages=" + pages +
//                '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
////      Book book = new Book("Abai joly",  "roman", "M.Auezov", 500);
////      System.out.println(book.getName());
////
////      System.out.println("Old info: "+book);
////
////      book.setName("Mahabbat kyzyk mol jyldar");
////      book.setGenre("drama");
////      book.setAuthor("A.Nurshaiykov");
////      book.setPages(350);
//    }
//}
//
//
// class Dina {
//    public static void main(String[] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//
//        Book book = new Book("Abai joly",  "roman", "M.Auezov", 500);
//        Book book2 = new Book("Koshpendiler",  "history", "I.Esenberlin", 700);
//        Book book3 = new Book("Kemel adam",  "psychology", "K.Zholdybaiuly", 200);
//
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        System.out.println(bookArrayList);
//
//        for(Book b: bookArrayList){
//            System.out.println(b);
//        }
//    }
//}
//
//class Dina2{
//    public static void main(String[] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//
//        Book book = new Book("Abai joly",  "roman", "M.Auezov", 500);
//        Book book2 = new Book("Koshpendiler",  "history", "I.Esenberlin", 700);
//        Book book3 = new Book("Kemel adam",  "psychology", "K.Zholdybaiuly", 200);
//
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        System.out.println("Old list: "+ bookArrayList);
//
//        System.out.println(bookArrayList.get(0));
//        Collections.sort(bookArrayList, new SortByGenre());
//        System.out.println("Sorted by genre: "+bookArrayList);
//
//    }
//}
//
//class SortByGenre implements Comparator<Book>{
//    public int compare(Book b1, Book b2){
//        if(b1.getGenre() == b2.getGenre())  //equal
//            return 0;
//        if(b1.getGenre() > b2.getGenre())
//            return 1;
//        else
//            return -1;
//
//        return b1.getName().compareTo(b2.getName());
//    }
//}
//
//
//
//class Dina3{
//    public static void main(String[] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//
//        Book book = new Book("Abai joly",  "roman", "M.Auezov", 500);
//        Book book2 = new Book("Koshpendiler",  "history", "I.Esenberlin", 700);
//        Book book3 = new Book("Kemel adam",  "psychology", "K.Zholdybaiuly", 200);
//
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//
//        Book b  = getBookByGenre(bookArrayList, "history");
//        System.out.println(b);
//    }
//
//    public static Book getBookByGenre(ArrayList<Book> list, String genre){
//        Book res = null;
//        for(Book b:list){
//            if (b.getGenre() == genre){
//                res = b;
//            }
//        }
//        return res;
//    }
//}