package dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private long mobile;
	private LocalDate dob;
	private int age;
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setAge(int age2) {
		// TODO Auto-generated method stub
		
	}
	public void setDob(LocalDate dob2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}
	public void setGender(String gender2) {
		// TODO Auto-generated method stub
		
	}
	public void setMobile(long mobile2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String encrypt) {
		// TODO Auto-generated method stub
		
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
