package pa04.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import pa04.model.Person;
import pa04.persistence.PersonJsonFileReader;
import pa04.persistence.PersonNativeFileReader;

public class ReadMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = 
                new PersonNativeFileReader(new File("maria.person")).read();
        System.out.println(person.getName() 
                + " nació el " + person.getBirthdate());
        
        Person person1 = 
                new PersonJsonFileReader(new File("maria.json")).read();
        System.out.println(person1.getName() + " fecha nac. " 
                + person1.getBirthdate());
    }
}
