package belbindatabase;
import java.util.ArrayList;
//import javax.swing.DefaultListModel;

/**
 *
 * @author Tobias Jacobsen & Christian Lind
 */
public class ControlEngine 
{
    ArrayList<Person> personList;
    //DefaultListModel listModel = new DefaultListModel();
    
    public ControlEngine()
    {
    }
    
    public void makeNewPerson(String name, int admin, int analyst, int creator, int finalizer)
    {
    Person pers = new Person(name, admin, finalizer, creator, analyst);
    personList.add(pers);
    
    FileHandler.saveFile(personList, "persons.txt");
    }
    
    public int getPersonListSize()
    {
        return personList.size();
    }  
    
    public void save()
    {
        FileHandler.saveFile(personList, "persons.txt");
    }
    
    public void load()
    {
        personList = FileHandler.loadFile("persons.txt");
    }
    
    public void clearFile()
    {
        int arraySize = personList.size(); //get arraySize
        System.out.println("arraysize is: " + arraySize);
        for (int i = 0; i < arraySize; i++)
        {
            personList.remove(0); //we run through the loop arraySize times and delete the index at position 0. Clever huh!
        }
    }
    
   
}
