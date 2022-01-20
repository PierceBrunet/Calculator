<%-- 
    Document   : arithmeticcalculator
    Created on : 17-Jan-2022, 4:53:28 PM
    Author     : Brune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="">First: </label>
            <input type="number" name="firstNumber" id="firstNumber"><br>
            <label for="">Second: </label>
            <input type="number" name="secondNumber" id="secondNumber"><br>
            <button type="submit" name="button" id="addition" value="addition">+</button>
            <button type="submit" name="button" id="subtraction" value="subtraction">-</button>
            <button type="submit" name="button" id="multiplication" value="multiplication">*</button>
            <button type="submit" name="button" id="modulus" value="modulus">%</button>
        </form>
        
        <p>Result: ${message}
        <br>
        <a href="/Calculator/age">Age Calculator</a>
        </p>
        
    </body>
</html>
