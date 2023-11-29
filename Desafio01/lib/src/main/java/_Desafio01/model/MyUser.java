package _Desafio01.model;

import java.util.Objects;

public class MyUser {
	long id_user;
	String name;
	String email;
	String password;
	boolean isAdmin;
	
	
	public MyUser() {
	}
	
	public MyUser(long id_user, String name, String email, String password, boolean isAdmin) {
		this.id_user = id_user;
		this.name = name;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	

	public long getId_user() {
		return id_user;
	}
	public void setId_user(long id_user) {
		this.id_user = id_user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id_user, isAdmin, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyUser other = (MyUser) obj;
		return Objects.equals(email, other.email) && Objects.equals(id_user, other.id_user)
				&& Objects.equals(isAdmin, other.isAdmin) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	
	

}
