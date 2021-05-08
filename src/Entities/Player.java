package Entities;

import java.util.Calendar;

import Abstracts.IEntity;

public class Player implements IEntity {

	private int id;
	private String idTCNo;
	private String name;
	private String surname;
	private Calendar birthDate;

	public void Users() {

	}

	public Player(int id, String idTCNo, String name, String surname, Calendar birthCalendar) {
		super();
		this.id = id;
		this.idTCNo = idTCNo;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdTCNo() {
		return idTCNo;
	}

	public void setIdTCNo(String idTCNo) {
		this.idTCNo = idTCNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthCalendar(Calendar birthDate) {
		this.birthDate = birthDate;
	}

}
