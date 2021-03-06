package IOStreamExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {

	 public static void main(String[] args) throws IOException {
		 BufferedReader br = null;
	      BufferedReader br2 = null;
	
		   File file= new File("D:\\testing1.txt");
		   boolean filecreated=file.createNewFile();
		   if(filecreated)
		   {
           
	      
	       try
	       {	
	    	   FileReader filer= new FileReader(file);
	           br = new BufferedReader(filer);		

	           //One way of reading the file
		   System.out.println("Reading the file using readLine() method:");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
		      System.out.println(contentLine);
		      contentLine = br.readLine();
		   }

		   br2 = new BufferedReader(new FileReader("D:\\newfile.txt"));

		   //Second way of reading the file
		   System.out.println("Reading the file using read() method:");
		   int num=0;
		   char ch;
		   while((num=br2.read()) != -1)
		   {	
	               ch=(char)num;
		       System.out.print(ch);
		   }

	       } 
	       catch(FileNotFoundException fnfe)
	       {
	    	   System.out.println("File is not founs " +fnfe);
	       }
	       catch (IOException ioe) 
	       {
		   ioe.printStackTrace();
	       } 
	       finally 
	       {
		   try {
		      if (br != null)
			 br.close();
		      if (br2 != null)
			 br2.close();
		   } 
		   catch (IOException ioe) 
	           {
			System.out.println("Error in closing the BufferedReader");
		   }
		}
	   }
	 }
}