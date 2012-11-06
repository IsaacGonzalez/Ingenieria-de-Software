package org.trapo

class Usuario {

	int numeroEmpleado
	Usuario supervisor
	String nombre
	String apellidos
	String contrasena
	// Array de formatos ???


    static constraints = {
    	numeroEmpleado unique: true, nullable: false
    	nombre nullable: false
    	apellidos nullable: false
    	supervisor nullable: true
    	contrasena password: true // falta AES
    }

    String toString(){
    	this.nombre + " " + this.apellidos
    }
}
