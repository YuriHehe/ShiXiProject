<html>
<body>
<h1>Test</h1>
<form action="/pro/request_test?id=1&ii=2" method="post">
<input type = "text" name = "user" value = "hello" id="user_tmp"/>
<script>
function tmp(){
	var xmlhttp;
	xmlhttp = new XMLHttpRequest();
	xmlhttp.open("POST","/pro/request_test?id=1&ii=2&user="+document.getElementById("user_tmp").value,true);
	xmlhttp.send();
}
</script>
<input type = "button" name = "submit_test" value = "submit" onclick='tmp()'>
</form>
</body>
</html>
