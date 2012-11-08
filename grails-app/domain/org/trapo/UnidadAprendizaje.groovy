package org.trapo

// es la materia
class UnidadAprendizaje {

	int clave
	String nombre
	PlanEducativo planEducativo	

    static constraints = {
    	clave nullable: false
        nombre blank : false    	
    	planEducativo nullable: false
    }

    String toString(){
    	this.clave + " " + this.nombre
    }
}
