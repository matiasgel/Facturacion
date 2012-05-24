<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio ejemplo</title>
  </head>
  <body>
    <h1>Listado de clientes con limite de credito mayor a 50000:</h1>
    <table>
      <thead>
        <tr>
          <th>Nombre</th>     
          <th>Dirección</th>
          <th>Descuento</th>
          <th>Limite de credito</th>          
        </tr>
      </thead>
      <g:each var="cliente"  in="${clientes}">
        <tr>
          <td>${cliente.nombre}</td>          
          <td>${cliente.lineaDireccion1}, ${cliente.lineaDireccion2}</td>          
          <td style="text-align: right">${cliente.codigoDescuento.porcentaje}%</td>
          <td style="text-align: right">
            <!-- Utilización del tag para formateo de numeros-->
            <g:formatNumber number="${cliente.limiteCredito}" type="currency" currencyCode="ARS" />
          </td>
        </tr>        
      </g:each>
      <tr>
        
      </tr>
    </table>
  </body>
</html>
