<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
</head>


<body>
	<center>
		<h1 id="title">正则测试</h1>
	</center>
	<form method="post"action="/upload/upload" enctype="multipart/form-data">
		<table>
			<tbody>
			    <tr><td>文本格式</td><td>
			    <select name="charset">
			    	<option selected="selected" value="gbk">gbk</option>
			    	<option  value="utf-8">utf-8</option>
			    </select></td></tr>
				<tr><td>大于时间(ms)</td><td><input type="text" name="time"/></td></tr>
				<tr><td>条数</td><td><input type="text" name="tiao"/></td></tr>
				<tr><td>文件上传</td><td><input type="file" name="file"/></td></tr>
				<tr ><td><input type="submit" value="上传"/></td></tr>
			</tbody>
		</table>
	</form>
	<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
</body>
</html>