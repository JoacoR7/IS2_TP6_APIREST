package com.is2.tp3_ej6.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Domicilio extends Base{
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "numero")
	private int numero;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_localidad")
	private Localidad localidad;
}
