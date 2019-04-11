<%--
  Created by IntelliJ IDEA.
  User: admin1
  Date: 11/04/2019
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
  </head>
  <style type="text/css">
    .calculator{
      height: 350px;width: 300px;
      margin: 0;
      padding: 10px;
      border: 1px #CCCCCC solid;
    }
    .calculator input{
      padding: 5px; margin: 5px;
    }
  </style>
  <body>
  <form method="post" action="./calculate">
    <div class="calculator">
      <h1>Simple Calculator</h1>
      <label>
        First Operand:
        <br/>
        <input type="number" name="FirstOperand" placeholder="0"/>
        <br/>
        Operator:
        <br/>
        <select name="Operator">
          <option value="ADDITION">ADDITION</option>
          <option value="SUBTRACTION">SUBTRACTION</option>
          <option value="MULTIPLICATION">MULTIPLICATION</option>
          <option value="DIVISION">DIVISION</option>
        </select>
        <br/>
        Second Operand:
        <br/>
        <input type="number" name="SecondOperand" placeholder="0"/>
        <br/>
        <input type="submit" value="Calculate"/>
      </label>
    </div>
  </form>
  </body>
</html>
