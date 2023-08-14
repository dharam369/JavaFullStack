package com.techlabs.builder;

public class UserImmutable {
	private int id;
	private String name;
	private String email;
	
	
	public UserImmutable(UserBuilder user) {
		this.id = user.id;
		this.name = user.name;
		this.email = user.email;
	}

	@Override
	public String toString() {
		return "UserImmutable [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public static class UserBuilder{
		private int id;
		private String name;
		private String email;
		
		public UserBuilder() {
			super();
		}
		
		public UserBuilder setId(int id) {
			this.id=id;
			return this;
		}
		public UserBuilder setName(String name) {
			this.name=name;
			return this;
		}
		public UserBuilder setEmail(String email) {
			this.email=email;
			return this;
		}
		public UserImmutable build() {
			UserImmutable user=new UserImmutable(this);
			return user;
		}
	}
	
}
