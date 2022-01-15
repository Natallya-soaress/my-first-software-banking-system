package Model.entities;

import java.util.Date;

public class Movement {

	private String source;
	private String destination;
	private float value;
	private Date date;
	
	public Movement() {
		
	}
	
	public Movement(String source, String destination, float value, Date date) {
		this.source = source;
		this.destination = destination;
		this.value = value;
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
