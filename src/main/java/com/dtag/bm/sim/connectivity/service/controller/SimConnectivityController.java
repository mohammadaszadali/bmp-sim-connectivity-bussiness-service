package com.dtag.bm.sim.connectivity.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bm.sim.connectivity.service.model.ServiceOrder;
import com.dtag.bm.sim.connectivity.service.service.SimConnectivityServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/simConnectivity/v1")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class SimConnectivityController {
	private static Logger logger = LoggerFactory.getLogger(SimConnectivityController.class);
	@Autowired
	private SimConnectivityServiceImpl simConnectivityService;
	
	
	@Autowired
	private MongoTemplate mongoTemplate;
	private final String className = this.getClass().getSimpleName();

	/**
	 * This will create simConnctivity request
	 * 
	 * @return
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "create new simConnectivity", notes = "create new simConnctivity")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Created new simConnctivity"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PostMapping("/simConnectivityRequest")
	public ResponseEntity<?> simConnectivityRequest(@RequestBody ServiceOrder simConnctivityRequest) throws Exception {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			ServiceOrder request = simConnectivityService.createsimConnctivity(simConnctivityRequest);

			responseEntity = new ResponseEntity<>(request, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}
	
	
	
	
	
	/**
	 * This will fetch simConnctivityByExternalId
	 * 
	 * @return
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "fetch  simConnctivityByExternalId", notes = "fetch  simConnctivityByExternalId")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetch  simConnctivityByExternalId"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping("/simConnectivity/getByExternalId/{ExternalId}")
	public ResponseEntity<?> getsimConnectivityRequestByExternalId(@PathVariable(value = "ExternalId") String ExternalId)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			
			ServiceOrder request = simConnectivityService.getsimConnctivityRequestServiceByExternalId(ExternalId);
			if(request != null)
			{
			
			responseEntity = new ResponseEntity<>(request, HttpStatus.OK);
			}
			else
			{
				responseEntity = new ResponseEntity<>("SIM Connctivity request not found", HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}

	
	
	/**
	 * This will fetch simConnctivityById
	 * 
	 * @return
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "fetch  simConnctivityById", notes = "fetch  simConnctivityById")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetch  simConnctivityById"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping("/simConnectivity/{Id}")
	public ResponseEntity<?> getsimConnectivityRequestById(@PathVariable(value = "Id") String Id)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			ServiceOrder request = simConnectivityService.getsimConnctivityRequestServiceById(Id);
			if(request != null)
			{
				responseEntity = new ResponseEntity<>(request, HttpStatus.OK);
			}
			else
			{
				responseEntity = new ResponseEntity<>("SIM Connctivity request not found", HttpStatus.OK);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}
	
	
	/**
	 * This will delete simConnctivityByExternalIdId
	 * 
	 * @return
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */

	@ApiOperation(value = "delete  simConnctivityByExternalIdId", notes = "delete  simConnctivityById")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Deleted simConnctivityById"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@DeleteMapping("/simConnectivity/{ExternalId}")
	public ResponseEntity<?> deletsimConnectivityRequestById(@PathVariable(value = "ExternalId") String ExternalId)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			
			ServiceOrder request = simConnectivityService.getsimConnctivityRequestServiceByExternalId(ExternalId);
			if(request != null)
			{
				simConnectivityService.deletesimConnctivityRequestServiceByExternalId(ExternalId);
				
				responseEntity = new ResponseEntity<>("SIM Connctivity request deleted Successfully", HttpStatus.OK);
			}
			else
			{
				responseEntity = new ResponseEntity<>("SIM Connctivity request not found", HttpStatus.OK);
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}
}
