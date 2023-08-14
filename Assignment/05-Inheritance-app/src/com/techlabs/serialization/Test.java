package com.techlabs.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		Student student=new Student(1,"Dharam","Etawah UP");
		String filename="E:\\Full Stack Java\\data.txt";
		
		serialize(student,filename);
		
		student=null;
		deserialize(student,filename);

	}

	private static void deserialize(Student student, String filename) {
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			
			student=(Student) in.readObject();
			System.out.println("Object is deserialize Successfully");
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAddress());
		}
		catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
		
	}

	private static void serialize(Student student, String filename) {
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file); 
			out.writeObject(student);
			
			System.out.println("Object is Serialized");
			file.close();
			out.close();
		}
		catch (IOException ex)
        {
            System.out.println("IOException is caught");
        }
		
	}

}
