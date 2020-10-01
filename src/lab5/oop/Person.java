/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.oop;

/**
 *
 * @author coc
 */
public class Person {
   protected String lastname;
   protected String firstname;
   
   public void setLastName(String lastname){
       this.lastname = lastname;
   }
   
   public String getLastName(){
       return this.lastname;
   }
   
   public void setFirstName(String firstname){
       this.firstname = firstname;
   }
   
   public String getFirstName(){
       return this.firstname;
   }   
}
