<html>
<head>
    <Title>Just A Test</Title>
   <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
    <script type="text/javascript">
    var auto_refresh = setInterval(
    function ()
    {
    $('#load_me').load('samp.jsp').fadeIn("slow");
    }, 10000); // autorefresh the content of the div after
               //every 10000 milliseconds(10sec)
    </script>
 </head>
<body>
<div id="load_me"> <%@ include file="messages.jsp" %></div>
</body>
/html>