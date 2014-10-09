package belbindatabase;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tobias Jacobsen & Christian Lind
 */
public class ControlEngine 
{
    ArrayList<Person> personList;
    DefaultListModel listModel = new DefaultListModel();
    
    public ControlEngine()
    {
        //personList = FileHandler.loadFile("persons.txt");
    }
    
    public void makeNewPerson(String name, int admin, int analyst, int creator, int finalizer)
    {
    Person pers = new Person(name, admin, finalizer, creator, analyst);
    personList.add(pers);
    
    FileHandler.saveFile(personList, "persons.txt");
    }
    
}
