<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<img src="banner.jpg" width="100%"/><hr>
<table width='100%'>
    <tr>
        <td>Welcome <c:out value="${name}" /></td>
        <td><img src='getPhoto.jsp?tbl=mem&id=<c:out value="${email}" />' height='50px'></td>
        <td><a href='members.jsp'>Home</a></td>
        <td><a href='profile.jsp'>My Profile</a></td>
        <td><a href='password.jsp'>Change Password</a></td>
        <td><a href='profilephoto.jsp'>Profile Photo</a></td>
        <td><a href='myfriends.jsp'>My Friends</a></td>
        <td><a href='search.jsp'>Search</a></td>
        <td><a href='logout.jsp'>Logout</a></td>
    </tr>
</table><hr>