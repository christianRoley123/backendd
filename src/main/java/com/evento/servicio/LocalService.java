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

 
	
}
