<html>
<html>
<head>
    <title>Convert Temperature</title>
</head>
<body>

<h1>Convert Temperature</h1>

<g:form name="convertTemp" url="[controller:'country', action:'result']">
    <g:textField name="temp" value="${temp}" />
    <g:radioGroup values="['C','F']" name="myTemps" value="C">
        <p><g:message code="${it.label}" />: ${it.radio}</p>
    </g:radioGroup>
    <g:submitButton name="submitButton" value="Convert" />
</g:form>

<table>
<thead>
<th>asdf</th>
</thead>
<tbody>
<tr>
    <td>asdf</td>
</tr>
</tbody>

</table>

</body>
</html>