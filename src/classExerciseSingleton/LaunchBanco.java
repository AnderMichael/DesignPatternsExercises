package classExerciseSingleton;

public class LaunchBanco {

	public static void main(String[] args) {
		BancoCentralInternacional bancoQuery = BancoCentralInternacional.getBancoCentralInternacional();

		Banco bancoLocal = new Banco(bancoQuery);
		Librecambista librecambista = new Librecambista(bancoQuery);
		CasaDeCambio casaDeCambio = new CasaDeCambio(bancoQuery);

		System.out.println("Banco: Bs -> $  " + bancoLocal.bolivianosToDollars(70));
		System.out.println("Casa de Cambio: Bs -> $  " + casaDeCambio.bolivianosToDollars(70));
		System.out.println("LibreCambista: Bs -> $  " + librecambista.bolivianosToDollars(70));

		System.out.println();

		System.out.println("Banco: Bs -> $  " + bancoLocal.bolivianosToDollars(70));
		System.out.println("Casa de Cambio: $ -> Bs  " + casaDeCambio.dollarsToBolivianos(10));
		System.out.println("LibreCambista: Euro -> Bs  " + librecambista.eurosToBolivianos(1));

	}

}
