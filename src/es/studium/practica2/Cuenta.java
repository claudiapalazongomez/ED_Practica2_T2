package es.studium.practica2;

public class Cuenta
{
	//Atributos
	private int numeroCuenta;
	private int saldo;
	private Cliente cliente;
	
	//Constructor vacío
	public Cuenta() {
		numeroCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	//Constructor por parámetros
	public Cuenta(int numeroCuenta, int saldo, Cliente cliente)
	{
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	//Métodos
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
}
