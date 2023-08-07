/**
 * 
 */
package com.aashish22bansal.portfolio.developer.projects.practice.springboot.CloudVendourAPI.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aashish22bansal.portfolio.developer.projects.practice.springboot.CloudVendourAPI.model.CloudVendor;

/**
 * @author Aashish Bansal
 * The @RestController Annotation will inform Spring that this is the Controller Class.
 * The @RequestMapping Annotation will provide Spring the context path.
 * 
 * We can create a method to get the values and return the complete object. For this, we
 * can use the model class CloudVendor. This method will obtain the Vendor Details based
 * on the vendorId. For Spring Boot to know that this method contains the specific GET 
 * Mapping, we will use the @GetMapping Annotation and also provide the value that we are
 * expecting to obtain for this method.
 * 
 * 
 * We can create a new method to check for POST Requests. This method would be receiving  
 * a CloudVendor Object in the POST Request as a Request Body for which we will use the 
 * @RequestBody Annotation along with the Parameter. Since this method would be creating 
 * a request, so we will need to use the @PostMapping Annotation for this method.
 * 
 * 
 * We can create a new method to update information with the help of PUT Requests. For 
 * this, we will use the @PutMapping Annotation which is used because PUT in HTTP is used
 * for updating.
 */
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	// Creating a method to GET the values.
	// Check link: http://localhost:8080/cloudvendor/V1 after Implementation
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId){
		cloudVendor = new CloudVendor("V1", "Vendor 1", "Address 1", "Number 1");
		return cloudVendor;
	}
	
	/**
	 * POST Mapping Method - CREATE Vendor Details
	 * @param cloudVendor which creates the Object
	 * @return String indicating a successful message.
	 * JSON Object:
	 * 		{
     *			"vendorId": "V2",
     *			"venforName": "Vendor 2",
     *			"vendorAddress": "Address 2",
     *			"vendorPhoneNumber": "Number 2"
	 *		}
	 * Check link: http://localhost:8080/cloudvendor after Implementation Using Postman
	 * The response should be the provided message along with HTTP 200 OK
	 */
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully!";
	}
	
	/**
	 * POST Mapping Method - CREATE Vendor Details
	 * @param cloudVendor which creates the Object
	 * @return String indicating a successful message.
	 * JSON Object:
	 * 		{
     *			"vendorId": "V1",
     *			"venforName": "Vendor 2",
     *			"vendorAddress": "Address 2",
     *			"vendorPhoneNumber": "Number 3"
	 *		}
	 * Check link: http://localhost:8080/cloudvendor after Implementation Using Postman
	 * The response should be the provided message along with HTTP 200 OK
	 */
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Cloud Vendor Deleted Successfully";
	}
}
