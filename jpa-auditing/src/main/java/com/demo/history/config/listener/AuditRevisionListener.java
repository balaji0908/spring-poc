package com.demo.history.config.listener;

import org.hibernate.envers.RevisionListener;

import com.demo.history.entity.AuditRevisionEntity;

public class AuditRevisionListener implements RevisionListener  {
	
	  @Override
	    public void newRevision(Object revisionEntity) {
	        AuditRevisionEntity audit = (AuditRevisionEntity) revisionEntity;
	        audit.setUsername("admin");
	    }
}
