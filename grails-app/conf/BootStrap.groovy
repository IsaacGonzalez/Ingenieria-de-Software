import org.trapo.Docente
import org.trapo.CoordinadorCarrera

class BootStrap {

    def init = { servletContext ->

    	def leopoldo = new Docente( 
			numeroEmpleado: 0,
			supervisor : null,
    		nombre : "leopoldo",
    		apellidos : "dominguez",
    		contrasena : "123456"
    	 )

    	leopoldo.save()

    	def ruelas = new Docente( 
			numeroEmpleado: 1,
			supervisor : leopoldo,
    		nombre : "adolfo",
    		apellidos : "ruelas",
    		contrasena : "123456"
    	 )

    	ruelas.save()

    	def aglay = new CoordinadorCarrera( 
			numeroEmpleado: 2,
			supervisor : null,
    		nombre : "aglay",
    		apellidos : "gonzalez",
    		contrasena : "123456"
    	 )
    	
    	aglay.save()

    }

    def destroy = {
    }
}
