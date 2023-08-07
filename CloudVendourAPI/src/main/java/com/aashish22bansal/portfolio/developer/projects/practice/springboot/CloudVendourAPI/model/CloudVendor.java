/**
 * Imaported Packages and Libraries
 */
package com.aashish22bansal.portfolio.developer.projects.practice.springboot.CloudVendourAPI.model;

/**
 * @author Aashish Bansal
 *
 */
public class CloudVendor {
	private String vendorId;
	private String venforName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	/**
	 * 
	 */
	public CloudVendor() {
		super();
	}
	/**
	 * @param vendorId
	 * @param venforName
	 * @param vendorAddress
	 * @param vendorPhoneNumber
	 */
	public CloudVendor(String vendorId, String venforName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.venforName = venforName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	/**
	 * @return the vendorId
	 */
	public String getVendorId() {
		return vendorId;
	}
	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	/**
	 * @return the venforName
	 */
	public String getVenforName() {
		return venforName;
	}
	/**
	 * @param venforName the venforName to set
	 */
	public void setVenforName(String venforName) {
		this.venforName = venforName;
	}
	/**
	 * @return the vendorAddress
	 */
	public String getVendorAddress() {
		return vendorAddress;
	}
	/**
	 * @param vendorAddress the vendorAddress to set
	 */
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	/**
	 * @return the vendorPhoneNumber
	 */
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	/**
	 * @param vendorPhoneNumber the vendorPhoneNumber to set
	 */
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
}
