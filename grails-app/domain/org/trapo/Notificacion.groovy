package org.trapo

class Notificacion {
	String nombre
	String descripcion
	Date periodoInicial
	Date periodoFinal
	Administrativo planificador	

    static constraints = {
    	nombre nullable: false
    	descripcion nullable: false
    	planificador nullable: false

    	periodoInicial nullable: false, validator : {return ( it > new Date() )}
    	periodoFinal nullable: false
    }
}
