/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author CERVANTESPC11
 */

public class Class {

Class(){


}
private String name;
private int age;
private String address;
private long phonenumber;

public void setname(String name){
  this.name=name;
}
public String getname(){
  return this.name;
}
public void setage(int age){
  this.age=age;
}
public int getage(){
  return this.age;
}
public void setaddress(String address){
  this.address=address;
}
public String getaddress(){
  return this.address;
}
public void setphonenumber(long phonenumber){
  this.phonenumber=phonenumber;
}
public long getphonenumber(){
  return this.phonenumber;
}

  public static void main(String[] args) {
   Class s = new Class();
   s.setname("Aries");
   System.out.println(s.getname());
   s.setage(22);
   System.out.println(s.getage());
   s.setaddress("Tarlac");
   System.out.println(s.getaddress());
   s.setphonenumber(45718181392828L);
   System.out.println(s.getphonenumber());
   
  }
}

