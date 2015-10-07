<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  	<head>
	    <meta charset="utf-8">
	    <title>Success member</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="">
	    <meta name="author" content="">
            
            <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
            <link type="text/css" href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet"/>
        </head>  
            <body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<fieldset>
				<legend>Employee Details</legend>
				    <table class="table table-striped">
					    <tr>
					    	<td>First Name</td>
					    	<td>Last Name</td>
                                                <td>User Name</td>
					    	<td>Email</td>
					    </tr>
					    <tr>
				    	<td>${member.firstName}</td>
				    	<td>${member.lastName}</td>
                                        <td>${member.userName}</td>
				    	<td>${member.email}</td>
                                      
				    </tr>    		
    				</table>
				</fieldset>
			</div>
		</div>
	</div>
                                        
             <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
             <script src="/js/jquery-1.11.1.min.js"></script>
             <script src="/js/bootstrap.min.js"></script>
             <script src="/js/bootstrap.js"></script>
             <script src="/js/npm/js"></script>
</body>
</html>
