package interfaces;


public class CustomerManager {
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("müsteri eklendi : " +customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("müsteri silindi : " +customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());

	}
}
