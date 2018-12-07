<%
    String id=request.getParameter("id");
    if(id==null)
        out.write("No Data");
    else if(id.equals("1"))
        out.write("Rajesh Kumar Sharma");
    else if(id.equals("2"))
        out.write("Abhay Sharma");
    else if(id.equals("3"))
        out.write("Amit Kumar");
    else if(id.equals("4"))
        out.write("Atul Gupta");
    else if(id.equals("5"))
        out.write("Sachin Sharma");
    else
        out.write("No Record");
%>