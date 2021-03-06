package com.learnings.test;

import java.io.BufferedReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.*;

public class FileExample 
{

	public static void main(String [] args) {

        // The name of the file to open.
		File file=new File("testnewfile.txt");
        String fileName = file.getName();
        //final Path path = FileSystems.getDefault().getPath("testnewfile.txt"); 
        //System.out.println(path);
       //final Path path1 = FileSystems.getDefault().getPath("testnewfile.txt"); 
        
      
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}