package com.ps.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "First name is required")
    private String firstname;



    @NotBlank(message = "Last name is required")
    private String lastname;

    @NotBlank(message = "Email is required")
    private String email;

    public Customer() {}

    public Customer(String firstname, String email) {
        this.firstname = firstname;
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
