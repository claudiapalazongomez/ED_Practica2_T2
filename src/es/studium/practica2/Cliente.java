package es.studium.practica2;
/**
 * Claudia Palaz�n G�mez
 * @author 98cla
 * @version 2023
 */

public class Cliente
{
	//Definimos los atributos, que son caracter�sticas del objeto
	private String dni;
	private String nombre;
	private String domicilio;
	
	/**
	 *  Declaramos el constructor vac�o en el cual igualamos los atributos
	 *  que hemos declarado con valores nulos, excepto en cliente, ya que 
	 *  ya est�n creados en la clase Cliente 
	 */
	public Cliente(){
		dni = "";
		nombre = "";
		domicilio = "";
	}

	/**
	 * Declaramos el constructor por par�metros para darle unos
		valores espec�ficos a los atributos de la clase
	 * @param dni variable a la que se le da un valor donde se guardar� el dni del cliente
	 * @param nombre variable a la que se le da un valor donde se guardar� el nombre del cliente
	 * @param domicilio variable a la que se le da un valor donde se guardar� el domicilio del cliente
	 */
	public Cliente(String dni, String nombre, String domicilio)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	//M�todos
	/**
	 * 
	 * @return este m�todo devuelve el valor 
	 * asignado al atributo dni
	 */
	public String getDni()
	{
		return dni;
	}

	/**
	 * 
	 * @param dni con este m�todo le asignamos 
	 * un valor a dni
	 */
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	/**
	 * 
	 * @return este m�todo devuelve el valor 
	 * asignado al atributo nombre
	 */
	public String getNombre()
	{
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre con este m�todo le asignamos 
	 * un valor a nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return este m�todo devuelve el valor 
	 * asignado al atributo domicilio
	 */
	public String getDomicilio()
	{
		return domicilio;
	}
	
	/**
	 * 
	 * @param domicilio con este m�todo le asignamos 
	 * un valor a domicilio
	 */
	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}
	
}
