<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<title>Hello World!</title>
</head>
<body>
<h1>占</h1>
<form action = "/uranau" method="GET" modelAttribute="Uranai">
<h2>名前</h2>
<input type = "text" name="name"/>
<h2>誕生日</h2>
<input type="date" name="birth" pattern="yyyy-MM-dd" value="1987-12-25">

<input type = "submit" value="占う" />
</form>
</body>
</html>