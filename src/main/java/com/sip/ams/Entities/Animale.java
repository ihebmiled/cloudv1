package com.sip.ams.Entities;



public class Animale {
	
private String nom;
private int age;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Animale(String nom, int age) {
	super();
	this.nom = nom;
	this.age = age;
}



}
