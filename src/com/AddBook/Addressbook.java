package com.AddBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Addressbook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList();

    public void addPerson() {
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter address");
        String address = sc.next();


        list.add(new Person(name, rollno, address));
        System.out.println(list);
    }

    public void editperson() {
        System.out.println("Enter person name to edit person");
        String editpersonname = sc.next();
        Person person = getPerson(editpersonname);
        System.out.println("Enter What you want to edit 1- name\n 2- rollno\n 3-address");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                editname(person);
                break;
            case 2:
                editrollno(person);
                break;
            case 3:
                editaddress(person);
                break;
            default:
                System.out.println("enter valid price");
        }

    }


    private Person getPerson(String editpersonname) {
        Iterator iterator  = list.iterator();
        if(iterator.hasNext()){
            for(int i = 0; i< list.size(); i++){
                Person person =(Person)iterator.next();
                if(person.name.equalsIgnoreCase(editpersonname)){
                    return person;
                }
            }
        }
        return null;
    }

    public void editname(Person person) {
        System.out.println("Enter Name");
        person.name = sc.next();
    }

    public void editrollno(Person person) {
        System.out.println("Enter rollno");
        person.rollno = sc.nextInt();
    }

    public void editaddress(Person person) {
        System.out.println("Enter address");
        person.address = sc.next();
    }
    public void showperson(){

        System.out.println(list);
    }
    public void deleteperson(){
        System.out.println(" enter name of person to delete this contact ");
        String Personname= sc.next();
        Person person = getPerson( Personname);
        if (person == null){
            System.out.println("no person is found with this name");
        }
        else{
            list.remove(person);

        }

    }
    public void searchperson (){
        int count=0;
        System.out.println("enter first name");
        String name = sc.next();
        for (Person person : list ){
            if (person.name.equalsIgnoreCase(name)){
                System.out.println(person);
                count++;
            }


        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Addressbook AB= new Addressbook();
        int choice=0;
        while(choice!=6){
            System.out.println("please choose from below\n1-add person \n2-show person \n3-edit person \n4-delete person \n5-search person \n6-exit ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    AB.addPerson();
                    break;
                case 2:
                    AB.showperson();
                    break;
                case 3:
                    AB.editperson();
                    break;
                case 4:
                    AB.deleteperson();
                    break;
                case 5:
                    AB.searchperson();
                    break;
                case 6:

                default:
                    System.out.println("invalid choice");
                    break;
            }

        }
    }


}






