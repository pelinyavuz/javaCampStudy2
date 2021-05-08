package Entities;

import Abstracts.IEntity;

public class Game implements IEntity{

	private int id;
	private String gameName;
	private double amount;

	public Game() {

	}

	public Game(int id, String gameName, double amount) {
		this.id = id;
		this.gameName = gameName;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
