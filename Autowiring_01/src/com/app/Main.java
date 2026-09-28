package com.app;

import com.app.Employee;
import com.app.Test;

public class Main {
    public static void main(String[] args) {

    	Employee e1 = new Employee();
        Employee e = new Employee(1,"sai");
        System.out.println(e);
        System.out.println(e.getId()+"  "+e.getName());

        Test t = new Test(e);
        System.out.println(t);
        
    }
}