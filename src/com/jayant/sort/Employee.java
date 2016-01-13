package com.jayant.sort;

/**
 * Created by jayant on 1/13/2016.
 */
public class Employee {

    int employeeNumber;
    String firstName;
    String lastName;
    String emailId;

    Employee(int employeeNumber, String firstName, String lastName, String emailId)  {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public int compare(Employee emp)   {
        if(this.employeeNumber > emp.employeeNumber)    {
            return 1;
        } else if(this.employeeNumber < emp.employeeNumber)     {
            return -1;
        } else
            return 0;
    }

}
