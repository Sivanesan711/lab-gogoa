package model;

import java.time.*;

public class Bus
{
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;
	public final int getNoOfPersons() {
		return noOfPersons;
	}
	public final void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public final String getBusType() {
		return busType;
	}
	public final void setBusType(String busType) {
		this.busType = busType;
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
	
	public Bus(int noOfPersons, int rates, String busType, LocalDate date)
	{
		this.setNoOfPersons(noOfPersons);
		this.setRates(rates);
		this.setBusType(busType);
		this.setDate(date);
	}
}
