package com.techlabs.filehandlings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Full Stack Java\\data.txt");
	      
	      Scanner sc = new Scanner(file);
	      
	      StringBuffer sb = new StringBuffer();
	     
	      while(sc.hasNext()) {
	         sb.append(sc.nextLine()+" ");
	      }
	      System.out.println(sb);
	}

}
