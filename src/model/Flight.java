package model;

import java.time.LocalDate;

public class Flight
{
	private int noOfPersons;
	private int classType;
	private  int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	
	public final int getNoOfPersons() {
		return noOfPersons;
	}
	public final void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public final int getClassType() {
		return classType;
	}
	public final void setClassType(int classType) {
		this.classType = classType;
	}
	public final int getRates() {
		return rates;
	}
	public final void setRates(int rates) {
		this.rates = rates;
	}
	public final LocalDate getFrom() {
		return from;
	}
	public final void setFrom(LocalDate from) {
		this.from = from;
	}
	public final LocalDate getTo() {
		return to;
	}
	public final void setTo(LocalDate to) {
		this.to = to;
	}
	public final String getTriptype() {
		return triptype;
	}
	public final void setTriptype(String triptype) {
		this.triptype = triptype;
	}
	
	public Flight(int nop, int clsTyp, int rate, LocalDate frm, LocalDate to1,String triptyp )
	{
		noOfPersons = nop;
		classType = clsTyp;
		rates = rate;
		LocalDate from = frm;
		LocalDate to = to1;
		triptype = triptyp;
			
	}
}