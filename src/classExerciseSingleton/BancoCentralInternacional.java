package classExerciseSingleton;

public class BancoCentralInternacional {

	private static BancoCentralInternacional bancoCentralInternacional;

	private BancoCentralInternacional() {
		System.out.println("Hola! Bienvenido al Banco Central Internacional!");
	}

	public static BancoCentralInternacional getBancoCentralInternacional() {
		if (bancoCentralInternacional == null) {
			bancoCentralInternacional = new BancoCentralInternacional();
		}
		return bancoCentralInternacional;
	}

	public double dollarsToBolivianos(double dollars) {
		double bolivianos = dollars * 7.0;
		return bolivianos;
	}
	
	public double bolivianosToDollars(double bolivianos) {
		double dollars = bolivianos / 7.0;
		return dollars;
	}

	public double eurosToBolivianos(double euros) {
		double bolivianos = euros * 9.0;
		return bolivianos;
	}
	
	public double bolivianosToEuros(double bolivianos) {
		double euros = bolivianos / 9.0;
		return euros;
	}
	
}
