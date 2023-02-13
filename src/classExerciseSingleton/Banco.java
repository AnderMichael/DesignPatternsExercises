package classExerciseSingleton;

public class Banco {
	private BancoCentralInternacional bancoQuery;

	public Banco(BancoCentralInternacional bancoQuery) {
		this.bancoQuery = bancoQuery;
	}

	public double dollarsToBolivianos(double dollars) {
		double bolivianos = bancoQuery.dollarsToBolivianos(dollars);
		return bolivianos;
	}
	
	public double bolivianosToDollars(double bolivianos) {
		double dollars = bancoQuery.bolivianosToDollars(bolivianos);
		return dollars;
	}

	public double eurosToBolivianos(double euros) {
		double bolivianos = bancoQuery.eurosToBolivianos(euros);
		return bolivianos;
	}
	
	public double bolivianosToEuros(double bolivianos) {
		double euros = bancoQuery.bolivianosToEuros(bolivianos);
		return euros;
	}
	
}
