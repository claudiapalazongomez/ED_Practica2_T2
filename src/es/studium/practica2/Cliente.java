package es.studium.practica2;
/**
 * Claudia Palazón Gómez
 * @author 98cla
 * @version 2023
 */

public class Cliente
{
	//Definimos los atributos, que son características del objeto
	private String dni;
	private String nombre;
	private String domicilio;
	
	/**
	 *  Declaramos el constructor vacío en el cual igualamos los atributos
	 *  que hemos declarado con valores nulos, excepto en cliente, ya que 
	 *  ya están creados en la clase Cliente 
	 */
	public Cliente(){
		dni = "";
		nombre = "";
		domicilio = "";
	}

	/**
	 * Declaramos el constructor por parámetros para darle unos
		valores específicos a los atributos de la clase
	 * @param dni variable a la que se le da un valor donde se guardará el dni del cliente
	 * @param nombre variable a la que se le da un valor donde se guardará el nombre del cliente
	 * @param domicilio variable a la que se le da un valor donde se guardará el domicilio del cliente
	 */
	public Cliente(String dni, String nombre, String domicilio)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	//Métodos
	/**
	 * 
	 * @return este método devuelve el valor 
	 * asignado al atributo dni
	 */
	public String getDni()
	{
		return dni;
	}

	/**
	 * 
	 * @param dni con este método le asignamos 
	 * un valor a dni
	 */
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	/**
	 * 
	 * @return este método devuelve el valor 
	 * asignado al atributo nombre
	 */
	public String getNombre()
	{
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre con este método le asignamos 
	 * un valor a nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return este método devuelve el valor 
	 * asignado al atributo domicilio
	 */
	public String getDomicilio()
	{
		return domicilio;
	}
	
	/**
	 * 
	 * @param domicilio con este método le asignamos 
	 * un valor a domicilio
	 */
	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}
	
}
