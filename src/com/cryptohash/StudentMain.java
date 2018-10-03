package com.cryptohash;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Nil",23);
        Student student2= new Student("jain",24);
        student1.display();
        student2.display();
    }

}

class Student{
    String name;
    int age;
    static String college="CryptoHash";
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(name +" "+age+" "+college);
    }
}