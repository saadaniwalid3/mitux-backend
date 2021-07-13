package com.plateforme.mitux.model;
import javax.persistence.*;

@Entity
@Table(name = "candidate")
public class CandidateDao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcandidate", nullable = false, unique = true)
	private int idcandidate;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="password")
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}