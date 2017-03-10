package at.wertal.spring.demo2;

import java.util.Date;

public class Ticket {
	
	int id;
	int numner ;
	String Descripton;
	Date created;
	Date modified;
	Date resolved;
	int belongsTo;
	
	
	public Ticket(int id, int numner, String descripton, Date created, Date modified, Date resolved, int belongsTo) {
		super();
		this.id = id;
		this.numner = numner;
		Descripton = descripton;
		this.created = created;
		this.modified = modified;
		this.resolved = resolved;
		this.belongsTo = belongsTo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumner() {
		return numner;
	}


	public void setNumner(int numner) {
		this.numner = numner;
	}


	public String getDescripton() {
		return Descripton;
	}


	public void setDescripton(String descripton) {
		Descripton = descripton;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Date getModified() {
		return modified;
	}


	public void setModified(Date modified) {
		this.modified = modified;
	}


	public Date getResolved() {
		System.out.println("neuer Branch cretae Tickets");
		return resolved;
	}


	public void setResolved(Date resolved) {
		this.resolved = resolved;
	}


	public int getBelongsTo() {
		return belongsTo;
	}


	public void setBelongsTo(int belongsTo) {
		this.belongsTo = belongsTo;
	}
	
	
	
	

}
