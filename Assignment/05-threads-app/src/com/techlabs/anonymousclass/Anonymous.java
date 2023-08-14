package com.techlabs.anonymousclass;

abstract class Person{  
	abstract void eat();  
	
}  
class Anonymous{  
	public static void main(String args[]){  
	Person p=new Person(){  
	void eat(){System.out.println("nice fruits");}
};  
	p.eat(); 
	p.sleep();
	Person p1=new Person(){  
		void eat(){System.out.println("nicgvjh fruits");}  
	};
	p1.eat();
}  
	
} 