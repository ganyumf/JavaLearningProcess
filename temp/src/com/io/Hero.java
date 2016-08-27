package com.io;

import java.io.Serializable;

public class Hero implements Serializable//序列化接口
{
	private String name;
	private int life;
	private int attack;
			
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	public Hero(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}
