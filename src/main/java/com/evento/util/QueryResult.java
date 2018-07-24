package com.evento.util;

import java.util.List;

public class QueryResult { //PARA GUARDAR EL NUMERO DE REGISTROS DE LAS LISTAS
	private int totalRecords;
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	private List<Object> list;
	
	

}
