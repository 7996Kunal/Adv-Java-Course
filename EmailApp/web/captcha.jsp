<%
    String s=session.getId().substring(5,13);
    response.setContentType("image/png");
    java.io.OutputStream mout=response.getOutputStream();
    p1.Captcha.showImage(s, mout);
%>
