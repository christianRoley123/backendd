package com.evento.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_cablocal_app2")
@Access(AccessType.FIELD)
public class Local extends ParentEntity{
	
	
	private static final long serialVersionUID = 3260280598125257161L;
	
	
	public Local() {
		super();
	}

	public String getId_local() {
		return id_local;
	}
	public void setId_local(String id_local) {
		this.id_local = id_local;
	}
	public String getCorreo_local() {
		return correo_local;
	}
	public void setCorreo_local(String correo_local) {
		this.correo_local = correo_local;
	}
	public String getTelefono_local() {
		return telefono_local;
	}
	public void setTelefono_local(String telefono_local) {
		this.telefono_local = telefono_local;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	
	@Column(name = "id_local" , nullable= false , length = 15)
	private String id_local;
	@Column(name = "correo_local" , nullable= false , length = 50)
	private String correo_local;
	@Column(name = "telefono_local" , nullable= false , length = 15)
	private String telefono_local;
	@Column(name = "direccion" , nullable= false , length = 200)
	private String direccion;
	@Column(name = "distrito" , nullable= false , length =50)
	private String distrito;
	@Column(name = "provincia" , nullable= false , length = 50)
	private String provincia;
	@Column(name = "departamento" , nullable= false , length = 50)
	private String departamento;
	
}
