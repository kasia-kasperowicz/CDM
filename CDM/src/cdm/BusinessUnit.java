/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdm;

// The class is a representation of a business unit with id and name attributes, and it provides methods to get and set these attributes.
public class BusinessUnit {

    // Declaring private string variable for 'id'. 
    private String id;

    // Declaring private string variable for 'name'.
    private String name;

    // Constructor for the BusinessUnit class to initialize objects of the BusinessUnit class.
    public BusinessUnit(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter method for 'id'. 
     public String getId() {
        return id;
    }

    // Setter method for 'id'.
    public void setId(String id) {
        this.id = id;
    }

    // Getter method for 'name'.
    public String getName() {
        return name;
    }

    // Setter method for 'name'.
    public void setName(String name) {
        this.name = name;
    }

    // Overriding the default "toString" method to provide a custom string representation of the BusinessUnit object.
    @Override
    public String toString() {
        // This will return the name of the business unit when the object's toString method is called.
        return name;
    }
}