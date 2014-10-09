package belbindatabase;

import java.util.ArrayList;

/**
 *
 * @author Tobias Jacobsen & Christian Lind
 */
public class ControlEngine 
{
    ArrayList<Person> personList;
    
    public ControlEngine()
    {
        personList = FileHandler.loadFile("persons.txt");
        System.out.println("after load   "+ personList.toString() );
    }
    
    public void makeNewPerson(String name, int admin, int analyst, int creator, int finalizer)
    {
    Person pers = new Person(name, admin, finalizer, creator, analyst);
    personList.add(pers);
    
    FileHandler.saveFile(personList, "persons.txt");
    }
    
}
