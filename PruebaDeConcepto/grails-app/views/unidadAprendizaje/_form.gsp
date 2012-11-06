<%@ page import="org.trapo.UnidadAprendizaje" %>



<div class="fieldcontain ${hasErrors(bean: unidadAprendizajeInstance, field: 'clave', 'error')} required">
	<label for="clave">
		<g:message code="unidadAprendizaje.clave.label" default="Clave" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="clave" type="number" value="${unidadAprendizajeInstance.clave}" required=""/>
</div>

