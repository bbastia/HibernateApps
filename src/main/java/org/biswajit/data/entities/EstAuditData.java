package org.biswajit.data.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EstAuditData {

	@Column(name="createdByUserId")
	private Long  createdByUserId;
	
	@Column(name="createdDate")
	private Date  createdDate;
	
	@Column(name="lastModifiedDate")
	private Date  lastModifiedDate;
	
	@Column(name="lastModifiedByUserId")
	private Long lastModifiedByUserId;
	
	public Long getCreatedByUserId() {
		return createdByUserId;
	}
	public void setCreatedByUserId(Long createdByUserId) {
		this.createdByUserId = createdByUserId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Long getLastModifiedByUserId() {
		return lastModifiedByUserId;
	}
	public void setLastModifiedByUserId(Long lastModifiedByUserId) {
		this.lastModifiedByUserId = lastModifiedByUserId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstAuditData [createdByUserId=")
				.append(createdByUserId).append(", createdDate=")
				.append(createdDate).append(", lastModifiedDate=")
				.append(lastModifiedDate).append(", lastModifiedByUserId=")
				.append(lastModifiedByUserId).append("]");
		return builder.toString();
	}
	
	
}
