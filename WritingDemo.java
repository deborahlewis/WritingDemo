/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingdemo;

import java.io.BufferedWriter; //import to create buffered writer
import java.io.File; //import to create file
import java.io.FileWriter; //import for FileWriter
import java.io.IOException;

/**
 *
 * @author Deborah
 */
public class WritingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File testWriter = new File("People.txt");//create file
        BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true));  //open file & write
        
        out.write("What happens now"); //write "Test" to file
        out.newLine();        
        out.close(); //save
    }
    
}
