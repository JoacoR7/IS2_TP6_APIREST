package com.is2.tp3_ej6.audit;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionTimestamp;

import com.is2.tp3_ej6.config.CustomRevisionListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.hibernate.envers.RevisionNumber;

@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
	@SequenceGenerator(
			name = "revision_seq",
			sequenceName = "rbac.seq_revision_id"
	)
        @RevisionNumber
	private int id;
	
	@Column(name = "REVISION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@RevisionTimestamp
	private Date date;
}
