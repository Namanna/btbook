/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package book;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getbookAuthor() {
        return bookAuthor;
    }

    public void setbookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getproducer() {
        return producer;
    }

    public void setproducer(String producer) {
        this.producer = producer;
    }

    public int getyearPublishing() {
        return yearPublishing;
    }

    public void setyearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
 public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Book name? ");
        bookName  = sc.nextLine();
        System.out.print("Who's author? ");
        bookAuthor = sc.nextLine();
        System.out.print("Where's from? ");
        producer = sc.nextLine();
        System.out.print("When's published? ");
        yearPublishing = sc.nextInt();
        System.out.print("How much? ");
        price = sc.nextFloat();
    }
    public void Hienthi()
    {
        System.out.println("Name: " + bookName + ", Author : " + bookAuthor + ", Producer : " + producer + ", release date: " + yearPublishing + ", Price: " + price + "Btc");
    } 
}
