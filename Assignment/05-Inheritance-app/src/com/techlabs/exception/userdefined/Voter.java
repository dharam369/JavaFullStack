package com.techlabs.exception.userdefined;

public class Voter {
	private int voterid;
	private String name;
	private int age;
	public Voter(int voterid, String name, int age) {
		//super();
		if(age<18)
			throw new AgeNotValid(age);
		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
	public int getVoterid() {
		return voterid;
	}
	public void setVoterid(int voterid) {
		this.voterid = voterid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void detail() {
		System.out.println("Voter [voterid=" + voterid + ", name=" + name + ", age=" + age + "]");
	}
	
}
