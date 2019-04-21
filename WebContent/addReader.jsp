<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>

<body bgcolor="#CCCCFF"></body>
<div >
	<h2>读者信息管理</h2>
	<h3>读者信息查询</h3>
	<div>
		<a href="http://127.0.0.1:8080/DBMS/listReader">
    		<button>查询读者信息列表</button>
		</a>
	</div>
	<div>
		<form action="searchReader">
    		请输入要查询的读者ID:<input type="text" name="r_id" value=""><br />
    		<button >查询</button>
		</form>
	</div>
	<div>
		<h3>添加读者</h3>
		<form action="addReader">
 
    	读者ID:<input type="text" name="r_id" value=""><br />
    	读者性别:<input type="text" name="r_sex" value=""><br />
    	读者名字:<input type="text" name="r_name" value=""><br />
    	读者电话:<input type="text" name="r_tel" value=""><br />
    	
    	<button >添加</button>
		</form>
	</div>
	<div>
		<h3>修改读者信息</h3>
		<form action="updateReader">
 
    	读者ID:<input type="text" name="r_id" value=""><br />
    	读者性别:<input type="text" name="r_sex" value=""><br />
    	读者名字:<input type="text" name="r_name" value=""><br />
    	读者电话:<input type="text" name="r_tel" value=""><br />
    	
    	<button >修改</button>
		</form>
	</div>
	<div>
		<h3>删除读者</h3>
		<form action="deleteReader">
    		输入要删除的读者ID:<input type="text" name="r_id" value=""><br />
    	<button >删除</button>
		</form>
	</div>
</div>

