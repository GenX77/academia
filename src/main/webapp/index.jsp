<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Inscripción</title>
</head>
<body>

<h2>Formulario de Inscripción</h2>
<s:form action="register" method="post">
    <s:textfield name="nombre" label="Nombre" />
    <s:textfield name="apellidos" label="Apellidos" />
    <s:textfield name="curso" label="Curso" />
    <s:submit value="Enviar" />
</s:form>

</body>
</html>
