package com.ista.web.app.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {

    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id_codigo")
	    private Integer id_codigo;

	     
	     @Column(name="descripcion")
	     private String descripcion;
	     
	     @Column(name="precio")
	     private Double precio;
	     
	    
	          
	     @Column(name="cantidad")
	     private Integer cantidad;



		public Integer getId_codigo() {
			return id_codigo;
		}



		public void setId_codigo(Integer id_codigo) {
			this.id_codigo = id_codigo;
		}



		public String getDescripcion() {
			return descripcion;
		}



		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}



		



		public Double getPrecio() {
			return precio;
		}



		public void setPrecio(Double precio) {
			this.precio = precio;
		}



		public Integer getCantidad() {
			return cantidad;
		}



		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}
	     
	     
	     
	   
}
