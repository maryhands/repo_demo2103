<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
    List<Map<String,Object>> zipList =
    (List<Map<String,Object>>)request.getAttribute("zipList");
    int size = 0;
    if(zipList !=null){
    	size = zipList.size();
    }
    out.print("백엔드에서 넘어온 값의 크기"+size);
    out.print("백엔드에서 넘어온 값의 크기"+size);
    %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
우편번호 검색기 페이지입니다.
</body>
</html>