import org.trapo.Docente
import org.trapo.CoordinadorCarrera
import org.trapo.Administrativo
import org.trapo.PlanEducativo

import org.security.SecRole
import org.security.SecUser
import org.security.SecUserSecRole

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

        def administrativo = new Administrativo(
            numeroEmpleado: 3,
            supervisor : null,
            nombre : "admin",
            apellidos : "istrativo",
            contrasena : "123456",
            puesto : "default"
        )

        administrativo.save()

        def planNuevo = new PlanEducativo(
            nombre : "plan nuevo",
            planEstudios : "2009-2",
            coordinador : aglay
        )       

        planNuevo.save()

        /*
        * Aquí se crean los roles para los distintos niveles de acceso a la aplicacion        
        */
        def userRole = SecRole.findByAuthority('ROLE_USER') ?: new SecRole(authority: 'ROLE_USER').save(failOnError: true)
        def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?: new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true)
        /*
        * Por ejemplo si el director puede acceder a ciertas secciones de la pagina se
        * definira este rol para el
        */
        def rolDirector = SecRole.findByAuthority('ROL_DIRECTOR') ?: new SecRole(authority: 'ROL_DIRECTOR').save(failOnError: true)

        def springSecurityService

        // creamos el usuario
        def adminUser = SecUser.findByUsername('admin') ?: new SecUser(
                username: 'admin',
                password: '123456',
                enabled: true).save(failOnError: true)
        // le ponemos el rol de admin
        if (!adminUser.authorities.contains(adminRole)) {
            SecUserSecRole.create adminUser, adminRole
        }

        // creamos otro usuario
        def otroUsuario = SecUser.findByUsername('isaac') ?: new SecUser(
                username: 'isaac',
                password: '123456',
                enabled: true).save(failOnError: true)
        // le ponemos el rol de admin
        if (!otroUsuario.authorities.contains(adminRole)) {
            SecUserSecRole.create otroUsuario, adminRole
        }

    }

    def destroy = {
    }
}
