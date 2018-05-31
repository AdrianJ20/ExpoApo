package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Persona")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;

	@Column(name = "namePersona", length = 50, nullable = false)
	private String namePersona;
	
	@Column(name = "dniPersona", length = 8, nullable = false)
	private String dniPersona;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthDatePersona")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDatePersona;
	
	@Column(name = "emailPersona", length = 40, nullable = false)
	private String emailPersona;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNamePersona() {
		return namePersona;
	}

	public void setNamePersona(String namePersona) {
		this.namePersona = namePersona;
	}

	public String getDniPersona() {
		return dniPersona;
	}

	public void setDniPersona(String dniPersona) {
		this.dniPersona = dniPersona;
	}

	public Date getBirthDatePersona() {
		return birthDatePersona;
	}

	public void setBirthDatePersona(Date birthDatePersona) {
		this.birthDatePersona = birthDatePersona;
	}

	public String getEmailPersona() {
		return emailPersona;
	}

	public void setEmailPersona(String emailPersona) {
		this.emailPersona = emailPersona;
	}
	
}
