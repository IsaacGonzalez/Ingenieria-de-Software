<%@ page import="org.trapo.Docente" %>



<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'numeroEmpleado', 'error')} required">
	<label for="numeroEmpleado">
		<g:message code="docente.numeroEmpleado.label" default="Numero Empleado" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroEmpleado" type="number" value="${docenteInstance.numeroEmpleado}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'nombre', 'error')} ">
	<label for="nombre">
		<g:message code="docente.nombre.label" default="Nombre" />
		
	</label>
	<g:textField name="nombre" value="${docenteInstance?.nombre}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'apellidos', 'error')} ">
	<label for="apellidos">
		<g:message code="docente.apellidos.label" default="Apellidos" />
		
	</label>
	<g:textField name="apellidos" value="${docenteInstance?.apellidos}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'supervisor', 'error')} ">
	<label for="supervisor">
		<g:message code="docente.supervisor.label" default="Supervisor" />
		
	</label>
	<g:select id="supervisor" name="supervisor.id" from="${org.trapo.Usuario.list()}" optionKey="id" value="${docenteInstance?.supervisor?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'contrasena', 'error')} ">
	<label for="contrasena">
		<g:message code="docente.contrasena.label" default="Contrasena" />
		
	</label>
	<g:field type="password" name="contrasena" value="${docenteInstance?.contrasena}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'listaUnidadesAprendizaje', 'error')} ">
	<label for="listaUnidadesAprendizaje">
		<g:message code="docente.listaUnidadesAprendizaje.label" default="Lista Unidades Aprendizaje" />
		
	</label>
	<g:select name="listaUnidadesAprendizaje" from="${org.trapo.UnidadAprendizaje.list()}" multiple="multiple" optionKey="id" size="5" value="${docenteInstance?.listaUnidadesAprendizaje*.id}" class="many-to-many"/>
</div>

