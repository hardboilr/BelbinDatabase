package belbindatabase;
import java.util.ArrayList;

/**
 * @author Tobias Jacobsen & Christian Lind
 */

public class ControlEngine 
{
    ArrayList<Person> personList; //array containing person objects from Person.class
    
    //----------------------------
    // create a new person object
    // add to array
    // save updated array to file
    // NB: we always save to file when adding a new person to array
    //----------------------------
    public void makeNewPerson(String name, int admin, int analyst, int creator, int finalizer)
    {
    Person pers = new Person(name, admin, finalizer, creator, analyst);
    personList.add(pers);
    save();
    }
    
    //--------------------
    // save array to file
    //--------------------
    public void save()
    {
        FileHandler.saveFile(personList, "persons.txt");
    }
    
    //--------------------
    // load array to file
    //--------------------
    public void load()
    {
        personList = FileHandler.loadFile("persons.txt");
    }
    
    //-----------------------------------------------------------------------
    //this is a nifty little method
    //first we create an int that will store the initial arraysize value
    //then we run through the array the number of times the array is big
    //at runthrough we remove data at index0
    //basically we eat away at the array untill its empty
    //NB: never managed to find a command to just clear the array, but this
    //is more fun anyways...
    //-----------------------------------------------------------------------
    public void clearFile()
    {
        int arraySize = getPersonListSize();
        for (int i = 0; i < arraySize; i++)
        {
            personList.remove(0); 
        }
    }
    
    //------------------
    //return array size
    //------------------
    public int getPersonListSize()
    {
        return personList.size();
    }  
}