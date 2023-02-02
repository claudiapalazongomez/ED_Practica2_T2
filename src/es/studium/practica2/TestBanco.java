package es.studium.practica2;

public class TestBanco
{
	/*Extracción de constantes*/
	private static final String CUENTA = "La cuenta de ";
	private static final String TIENE = " tiene ";
	private static final String EUROS = " euros.";

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
	int saldo_Antonio = cuentaAntonio.getSaldo();
	String nombre_Beatriz = cuentaBeatriz.getCliente().getNombre();
	int saldo_Beatriz = cuentaBeatriz.getSaldo();
	
	/* Antonio y Beatriz consultan el saldo */
	System.out.println(CUENTA + nombre_Antonio + TIENE + saldo_Antonio + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + saldo_Beatriz + EUROS);
	/* Beatriz transfiere 50€ a Antonio */
	cuentaBeatriz.setSaldo(saldo_Beatriz - 50);
	cuentaAntonio.setSaldo(saldo_Antonio + 50);
	/* Antonio y Beatriz vuelven a consultar su saldo para comprobar
	que todo ha ido bien */ 
	System.out.println(CUENTA + nombre_Antonio + TIENE + saldo_Antonio + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + saldo_Beatriz + EUROS);
	/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
	cuentaAntonio.setSaldo(saldo_Antonio + 100);
	/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
	cuentaBeatriz.setSaldo(saldo_Beatriz - 30);
	/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
	System.out.println(CUENTA + nombre_Antonio + TIENE + saldo_Antonio + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + saldo_Beatriz + EUROS);
	/* Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta */
	cuentaAntonio.setSaldo(saldo_Antonio - 50);
	cuentaBeatriz.setSaldo(saldo_Beatriz + 50);
	System.out.println(CUENTA + nombre_Antonio + TIENE + saldo_Antonio + EUROS);
	System.out.println(CUENTA + nombre_Beatriz + TIENE + saldo_Beatriz + EUROS);
	}

	private static Cuenta cuenta_Beatriz(Cliente beatriz)
	{
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		return cuentaBeatriz;
	}

	private static Cuenta cuenta_Antonio(Cliente antonio)
	{
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		return cuentaAntonio;
	}

	private static Cliente beatriz()
	{
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez","Calle Sol, 4");
		return beatriz;
	}

	private static Cliente antonio()
	{
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av.Pueblo Saharaui, s/n");
		return antonio;
	} 
}
