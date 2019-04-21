<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
 
<body bgcolor="#CCFFCC"></body>
<div>
	<h2>图书管理员信息管理</h2>
	<h3>管理员查询</h3>
	<div>
		<a href="http://127.0.0.1:8080/DBMS/listLibrarian">
    		<button>查询管理员列表</button>
		</a>
	</div>
	<div>
		<form action="searchLibrarian">
    		请输入要查询的管理员ID:<input type="text" name="l_id" value=""><br />
    		<button >查询</button>
		</form>
	</div>
	<div>
		<h3>添加管理员</h3>
		<form action="addLibrarian">
 
    	管理员ID:<input type="text" name="l_id" value=""><br />
    	管理员性别:<input type="text" name="l_sex" value=""><br />
    	管理员名字:<input type="text" name="l_name" value=""><br />
    	
    	<button >添加</button>
		</form>
	</div>
	<div>
		<h3>修改管理员信息</h3>
		<form action="updateLibrarian">
 
    	管理员ID:<input type="text" name="l_id" value=""><br />
    	管理员性别:<input type="text" name="l_sex" value=""><br />
    	管理员名字:<input type="text" name="l_name" value=""><br />
    	
    	<button >修改</button>
		</form>
	</div>
	<div>
		<h3>删除管理员</h3>
		<form action="deleteLibrarian">
    		输入要删除的管理员ID:<input type="text" name="l_id" value=""><br />
    	<button >删除</button>
		</form>
	</div>
</div>

