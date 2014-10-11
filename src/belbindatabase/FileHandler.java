package belbindatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Glorious Teacher
 */

public class FileHandler
{
    //---------------------------------------------------------------------
    // Class provided to us curtosy of teachers
    // Filehandler has to methods
    // one that saves a personArray to file and one that load from file
    // also does some checking whether file is found and if array is empty
    //---------------------------------------------------------------------
    public static ArrayList<Person> loadFile(String filename)
    {
        ArrayList<Person> personArray = new ArrayList<Person>();
        Scanner file_scanner = null;

        try {
            file_scanner = new Scanner(new File(filename));  //Connection to the file using the Scanner object
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find the file to load from! Returning null.");
            ex.printStackTrace();
            return null;  //If something goes wrong the method returns null
        }

        while (file_scanner.hasNextLine()) //File found. Reading one line.         
        {      
            String line = file_scanner.nextLine();
            Scanner sc = new Scanner(line).useDelimiter(",");
            String navn = sc.next();
            int adm = sc.nextInt();
            int ana = sc.nextInt();
            int cre = sc.nextInt();
            int fin = sc.nextInt();
            Person p = new Person(navn, adm, ana, cre, fin);
            personArray.add(p);  //Reading in a single line and saving in the ArrayList
        }

        file_scanner.close();  //Closing the file
        return personArray;    //returning the arraylist
    }

    public static boolean saveFile(ArrayList<Person> personArray, String filename)
    {
        if( personArray == null ) { return false;  }  //Checking parameter for null.
        FileWriter output;  //Creating reference for filewriter.
        
        try {
                output = new FileWriter(new File(filename));  //Opening connection to file.
                for (Person personline : personArray) {   //running through the ArrayList.                    
                    output.write(personline.toString() + "\n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
            return false;  //If something goes wrong false is returned!
        }

        return true;
    }
}