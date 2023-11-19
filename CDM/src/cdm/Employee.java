/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdm;

public class Employee {
    // Declaring private string variables.
    private String id;
    private String fullName;
    
    // Declaring custom type variales.
    private JobTitle jobTitle;
    private Department department;
    private BusinessUnit businessUnit;
    
    // Declaring private string variables.
    private String gender;
    private String ethnicity;
    
    // Declaring private integer variable s.
    private int age;
    private int annualSalary;
    
    // Declaring custom type variale.
    private Location location;

    // Constructor for the Employee class. 
    // Initialising  the object.
    public Employee(String id, String fullName, JobTitle jobTitle, Department department, 
                    BusinessUnit businessUnit, String gender, String ethnicity, int age, 
                    int annualSalary, Location location) {
    // Refering to the current object instance. 
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.businessUnit = businessUnit;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.age = age;
        this.annualSalary = annualSalary;
        this.location = location;
    }

    // Getter method to return the value of the id variable.
    public String getId() {
        return id;
    }

    // Getter method to return the value of the fullName variable.
    public String getFullName() {
        return fullName;
    }

    // Getter method to return the value of the jobTitle variable.
    public JobTitle getJobTitle() {
        return jobTitle;
    }

    // Getter method to return the value of the department variable.
    public Department getDepartment() {
        return department;
    }

    // Getter method to return the value of the businessUnit variable.
    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    // Getter method to return the value of the gender variable.
    public String getGender() {
        return gender;
    }

    // Setter method to update the value of the gender variable.
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter method to return the value of the ethnicity variable.
    public String getEthnicity() {
        return ethnicity;
    }

    // Setter method to update the value of the ethnicity variable.
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    // Getter method to return the value of the age variable.
    public int getAge() {
        return age;
    }

    // Getter method to return the value of the annualSalary variable.
    public int getAnnualSalary() {
        return annualSalary;
    }

    // Getter method to return the value of the location variable.
    public Location getLocation() {
        return location;
    }

    // Overriding the default "toString" method to provide a custom string of the Employee object.
    @Override
    public String toString() {
        return "Employee [id=" + id + ", fullName=" + fullName + ", jobTitle=" + jobTitle + ", department=" + department
                + ", businessUnit=" + businessUnit + ", gender=" + gender + ", ethnicity=" + ethnicity + ", age=" + age
                + ", annualSalary=" + annualSalary + ", location=" + location + "]";
    }
}
