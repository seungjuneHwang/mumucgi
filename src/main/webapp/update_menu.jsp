<%@page import="dto.Menu"%>
<%@page import="dao.MenuDao"%>
<%@page import="dao.MenuDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정할 데이터들이 넘어오고 그 데이터를 받아서 업데이트<br>
<%
	String id = request.getParameter("id");
	String menu = request.getParameter("menu");
	String price = request.getParameter("price");
%>
업데이트 쿼리 생성<br>
UPDATE `tb_menu` SET `menu`='<%=menu %>', `price`='<%=price %>' WHERE  `id`=<%=id %>
<%
	// 데이터 셋팅
	Menu dto = new Menu();
	dto.setMenu(menu);
	dto.setPrice(Integer.parseInt(price) );
	dto.setId(Integer.parseInt(id));
	
	// 디비 엑세스 해서 처리
	MenuDaoImpl dao = new MenuDaoImpl();
	dao.update(dto);
%>

<script>
	location.href = document.referrer;
</script>
</body>
</html>