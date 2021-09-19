package com.demo.history.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.demo.history.config.listener.AuditRevisionListener;

import lombok.Getter;
import lombok.Setter;

@Entity
@RevisionEntity(AuditRevisionListener.class)
@Table(name = "revinfo")
/*@AttributeOverrides({
       @AttributeOverride(name = "timestamp", column = @Column(name = "revtstmp")),
        @AttributeOverride(name = "id", column = @Column(name = "rev"))})*/
@Getter
@Setter
public class AuditRevisionEntity /*extends DefaultRevisionEntity*/ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@RevisionNumber
	@Column(name = "rev")
	private Long id;

    @Column(name = "username", nullable = false)
    private String username;
    
    //@AttributeOverrides({@AttributeOverride(name = "timestamp", column = @Column(name = "revtstmp")) })
    @Column(name = "revtstmp")
    @RevisionTimestamp
    @CreatedDate
    private Date revtstmp;
}
