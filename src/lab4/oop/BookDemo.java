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
public class BookDemo {
    public static void main(String[] args){
        Book book1 = new Book("Developing Java Software","Russel Winderand",79.75);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
    }
}
