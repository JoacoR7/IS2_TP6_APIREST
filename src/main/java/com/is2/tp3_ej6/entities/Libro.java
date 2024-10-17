package com.is2.tp3_ej6.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libro")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Libro extends Base{
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "fecha")
	private int fecha;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "paginas")
	private int paginas;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<Autor> autores;
}
