package com.plateforme.mitux.model;

public class CandidateDto {
	
	private int idcandidate;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String password;
	
	public int getIdcandidate() {
		return idcandidate;
	}

	public void setIdcandidate(int idcandidate) {
		this.idcandidate = idcandidate;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    public String getEmail() {
        return email;
    }

    public void setEamail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
