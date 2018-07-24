package com.evento.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evento.model.Local;
import com.evento.servicio.LocalService;

import com.evento.util.RestResponse;

import com.fasterxml.jackson.core.JsonParseException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping(value="/local")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalController {
	
	@Autowired
	protected LocalService localService;
	protected ObjectMapper mapper;//recibir el objeto json por parte del usaurio y convertirlo a un objeto de tipo local	
	
	@RequestMapping(value="/guardar", method = RequestMethod.POST)//GUARDARA EN CASO EL ID LLEGUE NULO Y ACTUALIZA CUANDO LLEGA UN ID
	public RestResponse saveOrUpdate(@RequestBody String localJson) throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper(); //DEBEMOS INICIALIZAR EL MAPPER PARA QUE FUNCIONE, SINO NOS SALTARA LA EXCEPCION LLAMADA NullPointerException		
		Local objLocal = this.mapper.readValue(localJson, Local.class);
		//Local objLocal = this.mapper.reader().forType(Local.class).readValue(localJson);		
		if(!this.validaLocal(objLocal)) { //recibir la validacion : !this.validae => indica si retorna false			
			//retornamos un error                      como es un entero, indicamos value()
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Los campos obligatorios no estan diligenciados");			
		}		
		this.localService.save(objLocal); //si es exitoso, llamamos al servicio		
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa"); //CLASE COM.EVENTO.UTIL
		}
	
	
		@RequestMapping(value="/eliminarLocal" , method = RequestMethod.POST)
	public void deleteLocal(@RequestBody String localJson ) throws Exception {
		
		this.mapper = new ObjectMapper();
		Local objlocal = this.mapper.readValue(localJson, Local.class);
			if(objlocal.getT_CabLocal_app_ID() == null) {
				throw new Exception("El Id esta vacio");
			}
		this.localService.deleteLocal(objlocal.getT_CabLocal_app_ID());
		
	}

	
	private boolean validaLocal(Local local) { //VALIDAREMOS LOS CAMPOS DECLARADOS NO NULL EN LA BASE DE DATOS DE LA TABLA LOCAL
		boolean isValid = true;
		
		if(StringUtils.trimToNull( local.getCorreo_local()) == null) {//stringUtils es para que no se envien "" campo (espacio-vacio)
			isValid = false;
		}
		if(StringUtils.trimToNull(local.getDepartamento())== null) {
			isValid = false;
		}
		if(StringUtils.trimToNull(local.getDireccion()) == null ) {
			isValid = false;
		}
		if(StringUtils.trimToNull(local.getDistrito()) == null) {
			isValid = false;
		}
		if(StringUtils.trimToNull(local.getProvincia()) == null) {
			isValid = false;
		}
		if(local.getTelefono_local() == "" || local.getTelefono_local() == null) { //es igual a lo que hace STRINGUTILS.TRIMtoNULL
			isValid = false;
		}
		
		
		return isValid;
	}
	
	@RequestMapping(value = "/listarLocales" , method = RequestMethod.GET)
	public List<Local> obtenerLocales() {
		
		return this.localService.findAll();
	}
	
	
}
