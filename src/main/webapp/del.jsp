<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>삭제하세요</h1>
<%
	String id = request.getParameter("id");
	String menu = request.getParameter("menu");
%>

  <script>
      var result = confirm("<%=menu %> 삭제 하시겠어요?");
      
      if(result) {
          alert("삭제 실행");
      } else {
    	  alert("취소");
      }
      location.href = document.referrer;
  </script>

</body>
</html>