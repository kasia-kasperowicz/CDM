/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdm;

// Functionalities for reading files.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Functionalities for storing data.
import java.util.ArrayList;
import java.util.List;

// The class provides a utility method to read data from a CSV file, skip its header, and return the data as a list of string arrays. 
// Each string array represents a row from the CSV, and each item within the array represents a value/column from that row.

/**
 *
 * @author kkasp
 */
public class CSVDataAccess {

    // The method takes a single parameter and returns array that represents rows and columns of the CSV.

    /**
     *
     * @param filePath
     * @return
     */
    public static List<String[]> readRawDataFromFile(String filePath) {
    // Array to store the raw data read from the CSV file.
        List<String[]> rawData = new ArrayList<>();
        //Reading the file line by line.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Skiping the header.
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                //Spliting the file based on the comma delimiter.
                String[] values = line.split(",");
                //Adding values to the array.
                rawData.add(values);
            }
        // If there's any error related to input or output operations it prints the error details without terminating the code execution.
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Returnng the list that contains the data read from the CSV file.
        return rawData;
    }
}

