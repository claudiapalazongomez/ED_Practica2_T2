package es.studium.practica2;

public class Cliente
{
	//Atributos
	private String dni;
	private String nombre;
	private String domicilio;
	
	//Constructor vacío
	public Cliente(){
		dni = "";
		nombre = "";
		domicilio = "";
	}

	//Constructor por parámetros
	public Cliente(String dni, String nombre, String domicilio)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	//Métodos
	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}
	
}
