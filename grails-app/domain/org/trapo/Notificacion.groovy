package org.trapo

class Notificacion {
	String nombre
	String descripcion
	Date periodoInicial
	Date periodoFinal
	Administrativo planificador	

    static constraints = {
    	nombre blank :false
    	descripcion blank : false
    	planificador nullable: false

    	periodoInicial nullable: false, validator : {
            it >= new Date()
        }
    	periodoFinal validator: { val, obj ->
            val?.after(obj.periodoInicial)
        }
    }
}
