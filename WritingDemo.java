/*
 * Deborah Lewis
 * This program is used to test writing to files
 */
package writingdemo;

import java.io.BufferedWriter; //import to create buffered writer
import java.io.File; //import to create file
import java.io.FileWriter; //import for FileWriter
import java.io.IOException;


public class WritingDemo {

    public static void main(String[] args) throws IOException {
        
        Person p = new Person();
        p.setFirstName("Deborah");
        p.setLastName("Lewis");
        p.setAge(25);
        
        File testWriter = new File ("People.txt"); //create file if not already in existence
        BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true)); //open file
        
        out.write(p.getFirstName()); //write to file
        out.write(", ");
        out.write(p.getLastName());
        out.write(", ");
        out.write("" + p.getAge()); //write number not character representation of the number
        out.newLine(); //new line
        out.close(); //save & close file
 
        
    } //end main    
} //end class
