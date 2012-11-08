package org.trapo

class Reporte extends Formato{
	Date periodoInicio
	Date periodoFinal
	Usuario planificador

    static constraints = {   
        // tiene bugs todavia 	
    	periodoInicio nullable: false, validator : {
            it >= new Date()
        }
        periodoFinal validator: { val, obj ->
            val?.after(obj.periodoInicial)
        }

    	planificador nullable : false
    }
}
