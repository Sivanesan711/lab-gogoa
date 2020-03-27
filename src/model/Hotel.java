package model;

import java.time.LocalDate;

public class Hotel
{
	private int noOfPersons;
	private String roomType;
	private int rates;
	private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
	public final int getNoOfPersons() {
		return noOfPersons;
	}
	public final void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public final String getRoomType() {
		return roomType;
	}
	public final void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public final int getRates() {
		return rates;
	}
	public final void setRates(int rates) {
		this.rates = rates;
	}
	public final String getOccupancy() {
		return occupancy;
	}
	public final void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public final LocalDate getFromdate() {
		return fromdate;
	}
	public final void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}
	public final LocalDate getTodate() {
		return todate;
	}
	public final void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	
	public Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate)
	{
		this.setNoOfPersons(noOfPersons);
		this.setRoomType(roomType);
		this.setRates(rates);
		this.setOccupancy(occupancy);
		this.setFromdate(fromdate);
		this.setTodate(todate);
	}
}