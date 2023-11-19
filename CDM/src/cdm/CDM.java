/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cdm;

// Java List is extension of Java's Collections Framework.
// It defines the operations that can be performed on a sequence of elements (adding or removing an element).
import java.util.List;

public class CDM {
    public static void main(String[] args) {
        // Declaringg and initialising a String variable named filePath. 
        // The variable holds the path to the Employee_data.csv file which contains raw employee data.
        String filePath = "C:/Users/kkasp/Documents/Kasia/CDM/Employee_data.csv";
        // Method to read the raw data from CSV file and return it as a list of string arrays. 
        // Each array is a row of data from the CSV.
        List<String[]> rawData = CSVDataAccess.readRawDataFromFile(filePath);
        // Transforming the raw string data into a list of 'Employee' objects.
        // Then is assigned to the 'employees' variable.
        List<Employee> employees = EmployeeBusinessLogic.processRawData(rawData);
        
        // For loop that iterates over each 'Employee' object in the 'employees' list.
        for (Employee emp : employees) {
        // Output
            System.out.println(emp);
        }
    }
}
