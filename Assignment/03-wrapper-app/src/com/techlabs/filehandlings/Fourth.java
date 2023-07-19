package com.techlabs.filehandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fourth {

	public static void main(String[] args) throws Exception {
		// File Class ***Most Important***
		checkFile("C:\\Users\\dhara\\OneDrive\\Desktop\\screenrecorder\\Apowersoft","");		
	}

	private static void checkFile(String path,String pathfile) throws Exception{
		File file = new File(path+"\\"+pathfile);
		{			
			if(file.isDirectory()==true)
			{
				path=path+"\\"+pathfile;
				//System.out.println(pathfile+"\t");
				String name[]=file.list();
				for(String s:name) {
					checkFile(path,s);
				}				
			}
			else if(file.isFile()==true)
			{
				System.out.println(pathfile);				
			}
		}
		
	}
}
