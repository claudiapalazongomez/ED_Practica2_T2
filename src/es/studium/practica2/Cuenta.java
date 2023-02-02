package es.studium.practica2;
/**
 * Claudia Palaz�n G�mez
 * @author 98cla
 * @version 2023
 */
public class Cuenta
{
	//Definimos los atributos, que son caracter�sticas del objeto
	private int numeroCuenta;
	private int saldo;
	/**
	 * @see Cliente hacemos una llamada a la clase Cliente, 
	 * ya que los datos que necesitamos se encuentran ah� almacenados 
	 */
	private Cliente cliente;
	
	/**
	 *  Declaramos el constructor vac�o en el cual igualamos los atributos
	 *  que hemos declarado con valores nulos, excepto en cliente, ya que 
	 *  ya est�n creados en la clase Cliente 
	 */
	public Cuenta() {
		numeroCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	/**
	 * Declaramos el constructor por par�metros para darle unos
		valores espec�ficos a los atributos de la clase
	 * @param numeroCuenta variable a la que se le da un valor donde se guardar� el n�mero de cuenta
	 * @param saldo variable a la que se le da un valor donde se guardar� el saldo del cliente
	 * @param cliente variable a la que se le da un valor que llama a la clase Cliente
	 */
	public Cuenta(int numeroCuenta, int saldo, Cliente cliente)
	{
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	//M�todos
	/**
	 * 
	 * @return este m�todo devuelve el valor 
	 * asignado al atributo numeroCuenta
	 */
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}
	
	/**
	 * 
	 * @param numeroCuenta con este m�todo le asignamos 
	 * un valor a numeroCuenta
	 */
	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}
	
	/**
	 * 
	 * @return este m�todo devuelve el valor asignado 
	 * al atributo saldo 
	 */

	public int getSaldo()
	{
		return saldo;
	}
	
	/**
	 * 
	 * @param saldo con este m�todo le asignamos un valor a saldo
	 */

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @return este m�todo devuelve el valor que requiramos 
	 * de los atributos asignados al objeto Cliente
	 */
	
	public Cliente getCliente()
	{
		return cliente;
	}
	
	/**
	 * 
	 * @param cliente con este m�todo le asignamos un valor a cliente
	 */
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
}
