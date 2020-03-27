package model;

import java.time.*;

public class Train
{
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	public final int getNoOfPersons() {
		return noOfPersons;
	}
	public final void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public final String getBerth() {
		return berth;
	}
	public final void setBerth(String berth) {
		this.berth = berth;
	}
	public final int getRates() {
		return rates;
	}
	public final void setRates(int rates) {
		this.rates = rates;
	}
	public final LocalDate getDate() {
		return date;
	}
	public final void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Train(int noOfPersons, int rates, String berth, LocalDate date)
	{
		this.setNoOfPersons(noOfPersons);
		this.setRates(rates);
		this.setBerth(berth);
		this.setDate(date);
	}
}
