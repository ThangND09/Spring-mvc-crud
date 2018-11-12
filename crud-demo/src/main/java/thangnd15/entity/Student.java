package thangnd15.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="school_id", nullable = true)
	private Integer schoolId;
	
	public Student() {
	}
	
	public Student(String first_name, String last_name, int age) {
		this.firstName = first_name;
		this.lastName = last_name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return firstName;
	}
	public void setFirst_name(String first_name) {
		this.firstName = first_name;
	}
	public String getLast_name() {
		return lastName;
	}
	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getSchool_id() {
		return schoolId;
	}
	public void setSchool_id(Integer school_id) {
		this.schoolId = school_id;
	}
	
}
