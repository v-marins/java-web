package model;

public class Usuario implements java.io.Serializable {
	
	private int id;
	private String username;
	private String fullName;
	private String email;
	
	public Usuario(int id, String username, String fullName, String email) {
		super();
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.email = email;
	}
	
	
	public Usuario() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
