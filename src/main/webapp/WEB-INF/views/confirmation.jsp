<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Registro Exitoso</title>
</head>
<body>
    <h1>¡Registro Exitoso!</h1>
    <p>Gracias, hemos recibido su información.</p>

    <h2>Datos Ingresados:</h2>
    <table>
        <tr>
            <th>Nombre</th>
            <th>Apellidos</th>
            <th>Curso</th>
        </tr>
        <tr>
            <td><s:property value="nombre" /></td>
            <td><s:property value="apellidos" /></td>
            <td><s:property value="curso" /></td>
        </tr>
    </table>
</body>
</html>