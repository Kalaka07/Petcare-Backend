package petcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import petcare.entities.Cuenta;
import petcare.service.CuentaServices;

@RestController
public class CuentasController {
	
	@Autowired
	CuentaServices services;
	
	@PostMapping(value = "registroCuenta", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	boolean registerCuenta(@RequestBody Cuenta cuenta) {
		return services.addCuenta(cuenta);
	}
	
	@PostMapping(value = "loginCuenta", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	Cuenta loginCuenta(@RequestBody Cuenta cuenta) {
		return services.retrieveCuenta(cuenta.getEmail(), cuenta.getPasswd());
	}
		
	@DeleteMapping(value = "deleteCuenta", produces = MediaType.APPLICATION_JSON_VALUE)
	boolean deleteCuenta(@RequestBody Cuenta cuenta) {
		return services.deleteCuenta(cuenta);
	}
	
	@DeleteMapping(value = "deleteCuentaId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	boolean deleteCuenta(@RequestBody int id) {
		return services.deleteCuenta(id);
	}
	
	@PutMapping(value = "updateCuenta", consumes = MediaType.APPLICATION_JSON_VALUE)
	boolean updateCuenta(@RequestBody Cuenta cuenta) {
		return services.updateCuenta(cuenta);
	}
	
}
