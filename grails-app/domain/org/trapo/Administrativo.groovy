package org.trapo

class Administrativo extends Usuario{
	String puesto

    static constraints = {
    	puesto nullable: false
    }
}
