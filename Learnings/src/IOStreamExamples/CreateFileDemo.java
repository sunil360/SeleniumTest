package IOStreamExamples;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main( String[] args )
	   {	
	      try {
	    	  
	    	  File file= new File("D:\\testing.txt");
	    	  
	    	  Boolean fc=file.createNewFile();
	    	  
	    	  if(fc)
	    	  {
	    		  System.out.println("File" + file.getName() + " is created");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("File is already available there");
	    	  }
	      }
	      catch(IOException ex)
	      {
	    	  System.out.println("Error Occured");
	    	  
	      }
		     
	   }
	}