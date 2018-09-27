package cl.rsalinas.mongolico.models;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Entity(name = "Disco")
@Table(name = "Disco")
public class Disco {
	
	  @Id
	  public ObjectId _id;
	  
	  public String album;
	  public String year;
	  public String calificacion;
	  
	  //Contructor
	  public Disco() {}
	  
	  public Disco(ObjectId _id, String album, String year, String calificacion){
			    	this._id = _id;
			    	this.album = album;
			    	this.year = year;
			    	this.calificacion = calificacion;
	  }

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	  
	  

}
