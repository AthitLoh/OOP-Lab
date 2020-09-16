/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.oop;

/**
 *
 * @author coc
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    } //set the title of book.

    public void setAuthor(String author){
        this.author = author;
    } //set the name of author of book.

    public void setPrice(double price){
        this.price = price;                
    } //set the price of book.

    public String getTitle(){
       
        return this.title;
    } //returns the title of book.

    public String getAuthor(){
        return this.author;
    }//returns the author’s name of book.

    public double getPrice(){
        return this.price;
    }
}
