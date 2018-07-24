package com.evento.servicio;



import java.util.List;

import com.evento.model.Local;

public interface LocalService {
 /**
  * Guarda un usuario
  * 
  * @param local
  * @return Un usuario guardado
  */
 Local save(Local local); //retorna local

 /**
  * Recupera la lista de los locales
  * 
  * @return lista de Locales
  */
List<Local> findAll();
	
	/**
	 * Cambia el estado a deshabilitado con el ID recibido
	 * 
	 * @param t_CabLocal_app_ID
	 */
	void deleteLocal(Integer t_CabLocal_app_ID);


	
}
