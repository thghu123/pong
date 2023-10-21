package com.chu.pong.meta.common.domain;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class DeleteOptionEntity {

	@Column(nullable = false)
	protected Boolean deleted = false;

	public Boolean getDeleted() {
		return deleted;
	}
}
