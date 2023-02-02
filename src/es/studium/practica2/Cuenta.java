package es.studium.practica2;
/**
 * Claudia Palazón Gómez
 * @author 98cla
 * @version 2023
 */
public class Cuenta
{
	//Definimos los atributos, que son características del objeto
	private int numeroCuenta;
	private int saldo;
	/**
	 * @see Cliente hacemos una llamada a la clase Cliente, 
	 * ya que los datos que necesitamos se encuentran ahí almacenados 
	 */
	private Cliente cliente;
	
	/**
	 *  Declaramos el constructor vacío en el cual igualamos los atributos
	 *  que hemos declarado con valores nulos, excepto en cliente, ya que 
	 *  ya están creados en la clase Cliente 
	 */
	public Cuenta() {
		numeroCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	/**
	 * Declaramos el constructor por parámetros para darle unos
		valores específicos a los atributos de la clase
	 * @param numeroCuenta variable a la que se le da un valor donde se guardará el número de cuenta
	 * @param saldo variable a la que se le da un valor donde se guardará el saldo del cliente
	 * @param cliente variable a la que se le da un valor que llama a la clase Cliente
	 */
	public Cuenta(int numeroCuenta, int saldo, Cliente cliente)
	{
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	//Métodos
	/**
	 * 
	 * @return este método devuelve el valor 
	 * asignado al atributo numeroCuenta
	 */
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}
	
	/**
	 * 
	 * @param numeroCuenta con este método le asignamos 
	 * un valor a numeroCuenta
	 */
	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}
	
	/**
	 * 
	 * @return este método devuelve el valor asignado 
	 * al atributo saldo 
	 */

	public int getSaldo()
	{
		return saldo;
	}
	
	/**
	 * 
	 * @param saldo con este método le asignamos un valor a saldo
	 */

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @return este método devuelve el valor que requiramos 
	 * de los atributos asignados al objeto Cliente
	 */
	
	public Cliente getCliente()
	{
		return cliente;
	}
	
	/**
	 * 
	 * @param cliente con este método le asignamos un valor a cliente
	 */
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
}
