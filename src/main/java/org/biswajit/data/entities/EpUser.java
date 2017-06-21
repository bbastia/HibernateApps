package org.biswajit.data.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="ep_user")
@XmlRootElement
public class EpUser {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="liferayUserId")
	private Long liferayUserId;
	
	@Column(name="isActive")
	private Boolean isActive;
	
	@Column(name="userId")
	private String screenName;
	
	@Column(name="autoUserId")
	private String autoScreenName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="contactEmail")
	private String contactEmail;
	
	@Column(name="userrole")
	private String userRole;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="affiliateId")
	private Long affiliateId;
	
	@Column(name="vendorId")
	private Long vendorId;
	
	@Column(name="tenantId")
	private Long tenantId;
	
	@Embedded
    private EstUserLocation userLocation;
	
	@Embedded
	private EstAuditData auditData;
	
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	
	public Long getTenantId() {
		return tenantId;
	}
	
	public String getAutoScreenName() {
		return autoScreenName;
	}

	public void setAutoScreenName(String autoScreenName) {
		this.autoScreenName = autoScreenName;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLiferayUserId() {
		return liferayUserId;
	}

	public void setLiferayUserId(Long liferayUserId) {
		this.liferayUserId = liferayUserId;
	}	

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public Long getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(Long affiliateId) {
		this.affiliateId = affiliateId;
	}

	public EstUserLocation getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(EstUserLocation userLocation) {
		this.userLocation = userLocation;
	}

	public EstAuditData getAuditData() {
		return auditData;
	}

	public void setAuditData(EstAuditData auditData) {
		this.auditData = auditData;
	}

	@Override
	public String toString() {
		return "EpUser [id=" + id + ", liferayUserId=" + liferayUserId
				+ ", isActive=" + isActive + ", screenName=" + screenName
				+ ", autoScreenName=" + autoScreenName + ", password="
				+ password + ", contactEmail=" + contactEmail + ", userRole="
				+ userRole + ", firstName=" + firstName + ", lastName="
				+ lastName + ", affiliateId=" + affiliateId + ", vendorId="
				+ vendorId + ", tenantId=" + tenantId + ", userLocation="
				+ userLocation + ", auditData=" + auditData + "]";
	}	
	
}
