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
    
    public Book(String t,String a,double p){
        title = t;
        author = a;
        price = p;
    }
    public void setTitle(String t){
        title = t;
    } //set the title of book.

    public void setAuthor(String a){
        author = a;
    } //set the name of author of book.

    public void setPrice(double p){
        price = p ;                
    } //set the price of book.

    public String getTitle(){
       
        return title;
    } //returns the title of book.

    public String getAuthor(){
        return author;
    }//returns the author’s name of book.
}
