package com.is2.tp3_ej6.config;

import org.hibernate.envers.RevisionListener;

import com.is2.tp3_ej6.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

	public void newRevision(Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;
	}

}
