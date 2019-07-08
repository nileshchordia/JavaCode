package com.cryptohash;

public class InstanceVariable4 {
    String name;
    int age;
    String dept;

    InstanceVariable4(String name,int age,String dept){
        this.name=name;
        this.age=age;
        this.dept=dept;
    }
    public void display(){
        System.out.println(name+" "+age+" "+dept);
    }



}

class InstanceVariable5 {
    public static void main(String[] args) {
        InstanceVariable4 iv = new InstanceVariable4("Nilesh",25,"CSE");
        iv.display();
    }
}
