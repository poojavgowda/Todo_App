package dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String description;
	LocalDateTime createdTime;
	boolean status;
	
	@ManyToOne
	Customer customer;
	
	 public int getId(int id) {
	        return id;
	    }

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String description2) {
		// TODO Auto-generated method stub
		
	}

	public void setCreatedTime(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	public void setCustomer(Customer customer2) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setId(int id2) {
		// TODO Auto-generated method stub
		
	}
}
