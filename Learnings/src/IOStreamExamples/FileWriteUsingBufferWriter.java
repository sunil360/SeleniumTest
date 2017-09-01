package IOStreamExamples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingBufferWriter {
	
	public static void main(String[] args)
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		  {
			String content = "This is my content which would be appended " +
		        	"at the end of the specified file";
		
		    File file= new File("D://myfile.txt");
		
		    if(!file.exists())
		      {
			    file.createNewFile();
		      }
		    
		    fw= new FileWriter(file, true);
		    bw= new BufferedWriter(fw);
		    bw.write(content);
		    System.out.println("data is successfully append to file");
		
	      }
		catch(IOException ioe)
		{
			System.out.println("File not found" + ioe);
		}
		finally
		{
			try
			{
				if(bw !=null)
				{
					bw.close();
				}
			}
				catch(Exception ex)
				{
					System.out.println("Error in closing the BufferedWriter " +ex);
				}
			}
			
		}
	}


