<%
    String id=request.getParameter("id");
    if(id.equals("1")) out.write("Amit Kumar");
    else if(id.equals("2")) out.write("Sumit Kumar");
    else if(id.equals("3")) out.write("Ajay Kumar");
    else if(id.equals("4")) out.write("Ravi Kumar");
    else if(id.equals("5")) out.write("Rakesh Kumar");
    else if(id.equals("6")) out.write("Ankit Kumar");
    else out.write("No Data");
    
%>