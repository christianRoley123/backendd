package com.evento.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;



@MappedSuperclass//Indicaremos que es una super clase  //Indicaremos que es un acceso de tipo de campo: para que las anotacion que se van a poner iran sobre el campo y no la propiedad
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable {

	
	private static final long serialVersionUID = 6068653462805132786L;
	
	//ATRIBUTO
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //indicamos que la estrategia de incremento sera automatico
	@Column(name = "t_CabLocal_app_ID", unique = true, nullable = false)
	private Integer t_CabLocal_app_ID;

	public Integer getT_CabLocal_app_ID() {
		return t_CabLocal_app_ID;
	}

	public void setT_CabLocal_app_ID(Integer t_CabLocal_app_ID) {
		this.t_CabLocal_app_ID = t_CabLocal_app_ID;
	}
	

	


	



	
	

}
