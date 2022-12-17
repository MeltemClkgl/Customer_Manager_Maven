package Entities;

import Abstract.IEntity;

import java.time.LocalDate;


public class Customer extends IEntity {
    public Customer( String firstName, String lastName, LocalDate dateOfBirth,int id) {

        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        Id = id;


    }
    public Customer(int id) {
        Id = id;
    }

    public int Id;
    public String FirstName;
    public String LastName;
    public LocalDate DateOfBirth;
    public String NationalityId;


}