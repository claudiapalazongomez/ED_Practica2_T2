package es.studium.practica2;
/**
 * Claudia Palazon Gomez
 * @author 98cla
 * @version 2023
 */

public class TestBanco
{
	/*Extracción de constantes*/
	/**
	 *  Dada una cadena de caracteres que se repite varias veces, este modelo lo convierte 
	 *  en una constante, y cualquier referencia es sustituida por la constante
	 */
	private static final String CUENTA = "La cuenta de ";
	/**
	 *  Repetimos el proceso anterior
	 */
	private static final String TIENE = " tiene ";
	/**
	 *  Repetimos el proceso anterior
	 */
	private static final String EUROS = " euros.";

	/**
	 * 
	 * @param args en el main vamos a ir calculando
	 * paso a paso las transacciones que se van realizando
	 * en las cuentas de nuestros dos clientes
	 */
	public static void main(String[] args)
	{
	/* Extracción métodos*/
	/* Antonio y Beatriz se hacen clientes del banco */
	Cliente antonio = antonio();
	Cliente beatriz = beatriz();
	/* Por defecto, todas las cuentas nuevas tienen 100€ */
	Cuenta cuentaAntonio = cuenta_Antonio(antonio);
	Cuenta cuentaBeatriz = cuenta_Beatriz(beatriz);
	
	/*Extracción de variables locales*/
	String nombre_Antonio = cuentaAntonio.getCliente().getNombre();
	String nombre_Beatriz = cuentaBeatriz.getCliente().getNombre();
	
	
	/* Antonio y Beatriz consultan el saldo */
	System.out.println(CUENTA + nombre_Antonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
	/* Beatriz transfiere 50€ a Antonio */
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
	cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);
	/* Antonio y Beatriz vuelven a consultar su saldo para comprobar
	que todo ha ido bien */ 
	System.out.println(CUENTA + nombre_Antonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
	/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
	cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
	/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
	/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
	System.out.println(CUENTA + nombre_Antonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
	/* Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta */
	cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	System.out.println(CUENTA + nombre_Antonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
	}
	
	/**
	 * 
	 * @param beatriz guarda los datos de la cuenta de Beatriz
	 * @return devuelve el numCuenta y el saldo de Beatriz, junto con los datos
	 * ya almacenados en Cliente Beatriz
	 */
	private static Cuenta cuenta_Beatriz(Cliente beatriz)
	{
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		return cuentaBeatriz;
	}

	/**
	 * 
	 * @param antonio guarda los datos de la cuenta de Antonio
	 * @return devuelve el numCuenta y el saldo de Antonio, junto con los datos
	 * ya almacenados en Cliente Antonio
	 */
	private static Cuenta cuenta_Antonio(Cliente antonio)
	{
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		return cuentaAntonio;
	}

	/**
	 * 
	 * @return devuelve el dni, el nombre y el domicilio de la cliente Beatriz
	 */
	private static Cliente beatriz()
	{
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez","Calle Sol, 4");
		return beatriz;
	}

	/**
	 * 
	 * @return devuelve el dni, el nombre y el domicilio del cliente Antonio
	 */
	private static Cliente antonio()
	{
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av.Pueblo Saharaui, s/n");
		return antonio;
	} 
}
