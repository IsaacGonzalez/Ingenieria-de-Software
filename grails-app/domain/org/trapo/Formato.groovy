package org.trapo

class Formato {
	Usuario solicitante
	Usuario autorizador
	Date fechaCreacion
	boolean estaCompleto
	int estadoAvance // 0 o 1 por lo pronto

    static constraints = {
    	solicitante nullable: false
    	autorizador nullable: false
    	fechaCreacion nullable: false, validator: {fechaCreacion, obj->
    		if(fechaCreacion < Date.now())
    			return false
    	}
    	estaCompleto nullable: false
    	estadoAvance nullable: false
    }
}
