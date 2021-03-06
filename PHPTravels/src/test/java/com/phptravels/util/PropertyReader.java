package com.phptravels.util;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader
{	
	String path =  getPath();  	
    public String readApplicationFile(String key){ 
    	String value = "";
        try{         	  
	          //Properties prop = new Properties();
	         File file = new File(path + "\\src\\test\\java\\com\\phptravels\\config\\application.properties");
	         if(file.exists()){
	        	  
	        	  FileInputStream fileInput = new FileInputStream(file);
	  		      Properties properties = new Properties();
	  		      properties.load(fileInput);
		        	          
		          value = properties.getProperty(key); 		                 
          	}
	          System.out.println(value);
	   }
        catch(Exception e){  
           System.out.println("Failed to read from application.properties file.");  
        }
        return value;
     } 
    
	public String getPath()
	{
		String path ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return path;
	}
 
}