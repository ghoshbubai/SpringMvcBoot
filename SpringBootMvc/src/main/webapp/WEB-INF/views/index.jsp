<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<f:form action="addStudent" method="post" commandName="student">
	
          Enter Roll:<f:input type="text" path="roll"></f:input><f:errors path="roll"></f:errors><br>
          Enter Marks:<f:input type="text" path="marks"></f:input><f:errors path="marks"></f:errors><br>
          Enter Name:<f:input type="text" path="sname"></f:input><f:errors path="sname"></f:errors><br>
		  <input type="submit">

	</f:form>
</body>
</html>