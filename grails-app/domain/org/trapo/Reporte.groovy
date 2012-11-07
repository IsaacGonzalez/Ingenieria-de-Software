package org.trapo

class Reporte extends Formato{
	Date periodoInicio
	Date periodoFinal
	Usuario planificador

    static constraints = {
    	// los validators no sirven
    	periodoInicio nullable: false, validator: {
    		fecha, obj ->
    		if(fecha < Date.now())
    			return false
    	}

    	periodoFinal nullable: false, validator: {
    		fecha, obj ->
    		if(fecha < Date.now() || fecha < periodoInicio)
    			return false
    	}

    	planificador nullable : false
    }
}
