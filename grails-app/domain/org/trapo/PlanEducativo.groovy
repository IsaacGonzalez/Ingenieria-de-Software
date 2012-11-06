package org.trapo

class PlanEducativo {

	String nombre
	String planEstudios
	CoordinadorCarrera coordinador


	static hasMany = [
			listaUnidadesAprendizaje: UnidadAprendizaje,
			docentes: Docente
		]

    static constraints = {
    	nombre nullable: false
    	planEstudios nullable: false
    	coordinador nullable: false
    }
}
