package com.anahuac.mayab.modulo1.sesion3;

public class Perro 
{
	private String raza;
	private String tamano;
	private double peso;
	private String nombre;
	private String nombreDueno;
	private int edad;
	
	public Perro(String raza, String tamano, double peso, String nombre, String nombreDueno, int edad) 
	{
		super();
		this.raza = raza;
		this.tamano = tamano;
		this.peso = peso;
		this.nombre = nombre;
		this.nombreDueno = nombreDueno;
		this.edad = edad;
	}
	
	
	/*
	 * public Perro() {

  

 }

 

 public Perro(String raza, String tamanio, double peso, String nombre, String nombreDuenio, int edad) {

  super();

  this.raza = raza;

  this.tamanio = tamanio;

  this.peso = peso;

  this.nombre = nombre;

  this.nombreDuenio = nombreDuenio;

  this.edad = edad;

 }

 

 public Perro(String raza, String nombre, int edad, String nombreDuenio) {

  this.raza = raza;

  this.nombre = nombre;

  this.nombreDuenio = nombreDuenio;

  this.edad = edad;

 }

 

 public Perro(String raza, String nombre, double peso, String nombreDuenio) {

  this.raza = raza;

  this.nombre = nombre;

  this.nombreDuenio = nombreDuenio;

  this.peso = peso;

 }

 

 public Perro(String raza, String nombre, String nombreDuenio) {

  this.raza = raza;

  this.nombre = nombre;

  this.nombreDuenio = nombreDuenio;

 

 }
 */
	 */
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreDueno() {
		return nombreDueno;
	}
	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void ladrar() {
		System.out.println("guau, guau, guau");
	}
}
