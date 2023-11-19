/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdm;

// Import the ArrayList class to be used for creating a list of Employee objects.
import java.util.ArrayList;

// Import the List interface for declaring list-type variables and methods.
import java.util.List;

// The class provides functionality to process raw data (a list of string arrays) and convert it into a list of structured 'Employee' objects.
// It makes use of related objects: 'BusinessUnit', 'Department', 'JobTitle', and 'Location'.

/**
 *
 * @author kkasp
 */
public class EmployeeBusinessLogic {

    // Declaring a public static method named "processRawData". 
    // It returns a List of Employee objects.
    
    /**
     * Employee object
     * @param rawData list of raw data
     * @return List of Employee object
     */
    public static List<Employee> processRawData(List<String[]> rawData) {
        // Initialising an empty ArrayList of 'Employee' objects.
        List<Employee> employees = new ArrayList<>();
        
        // For-each loop to iterate over each String array (values) in the rawData list.
        for (String[] values : rawData) {
            // Extracting individual data from the String array and storing in the local variables.
            String id = values[0];
            String fullName = values[1];
            String jobTitleName = values[2];
            String departmentName = values[3];
            String businessUnitName = values[4];
            String gender = values[5];
            String ethnicity = values[6];
            int age = Integer.parseInt(values[7]); // Converting the string value at index 7 to an integer.
            int annualSalary = Integer.parseInt(values[9]); // Converting the string value at index 9 to an integer.
            String country = values[10];
            String city = values[11];

            // Creating an instance of the 'BusinessUnit' class using the extracted id and businessUnitName.
            BusinessUnit businessUnit = new BusinessUnit(id, businessUnitName);

            // Creating an instance of the 'Department' class using the extracted id and departmentName.
            Department department = new Department(id, departmentName);

            // Creating an instance of the 'JobTitle' class using the extracted id and jobTitleName.
            JobTitle jobTitle = new JobTitle(id, jobTitleName);

            // Creating an instance of the 'Location' class using the extracted country and city.
            Location location = new Location(country, city);

            // Creatinge an instance of the 'Employee' class using the extracted data.
            Employee employee = new Employee(id, fullName, jobTitle, department, businessUnit, 
                                             gender, ethnicity, age, annualSalary, location);
            
            // Adding the created 'Employee' object to the employees ArrayList.
            employees.add(employee);
        }

        // Returning the list of Employee objects after processing all the raw data.
        return employees;
    }
}
