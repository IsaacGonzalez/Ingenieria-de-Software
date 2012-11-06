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

    	periodoInicial nullable: false, validator : {
    		periodoInicial, obj ->
    		if( periodoInicial < periodoFinal )
    			return true
    	}

    	periodoFinal nullable: false, validator : {
    		periodoFinal, obj ->
    		if( periodoFinal < Date.now() )
    			return false
    	}    	
    }
}
