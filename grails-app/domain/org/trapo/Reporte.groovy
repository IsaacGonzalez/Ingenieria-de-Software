package org.trapo

class Reporte extends Formato{
	Date periodoInicial
	Date periodoFinal
	Usuario planificador

    static constraints = {   
        // tiene bugs todavia 	
    	periodoInicial nullable: false, validator : {
            it >= new Date()
        }
        periodoFinal validator: { val, obj ->
            val?.after(obj.periodoInicial)
        }

    	planificador nullable : false
    }
}
