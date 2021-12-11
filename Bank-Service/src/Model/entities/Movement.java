package Model.entities;

import java.util.Date;

public class Movement {

	private int source;   //movimento de uma conta para a sua de destino
	private int destination;
	private double value;
	private Date date;
	
	public Movement() {
		
	}
	
	public Movement(int source, int destination, double value, Date date) {
		this.source = source;
		this.destination = destination;
		this.value = value;
		this.date = date;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
