package util;

public class CurrencyConverter {
    
	public static double IOF = 0.06;
	
	public static double amount(double totalCurrency, double price) {
		
        double totalValue = price * totalCurrency;
		double valueIOF = price * totalCurrency * IOF;
		
		return totalValue + valueIOF;
	}
}