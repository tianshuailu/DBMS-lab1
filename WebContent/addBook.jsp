<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
 
<body bgcolor="#FFFFCC"></body>
<div>
	<h2>书籍信息管理</h2>
	<h3>书籍查询</h3>
	<div>
		<a href="http://127.0.0.1:8080/DBMS/listBook">
    		<button>查询书籍列表</button>
		</a>
	</div>
	<div>
		<form action="searchBook">
    		请输入要查询的书籍ID:<input type="text" name="b_id" value=""><br />
    		<button >查询</button>
		</form>
	</div>
	<div>
		<h3>添加书籍</h3>
		<form action="addBook">

    	书籍ID:<input type="text" name="b_id" value=""><br />
    	书名:<input type="text" name="b_name" value=""><br />
    	出版社:<input type="text" name="b_publisher" value=""><br />
    	数量:<input type="text" name="b_amount" value=""><br />
    	书籍位置:<input type="text" name="b_location" value=""><br />
    	管理员ID:<input type="text" name="l_id" value=""><br />

    	<button >添加</button>
		</form>
	</div>
	<div>
		<h3>添加书籍作者信息</h3>
		<form action="addAuthor">

    	书籍ID:<input type="text" name="b_id" value=""><br />
    	作者:<input type="text" name="author" value=""><br />

    	<button >添加</button>
		</form>
	</div>
	<div>
		<h3>查询书籍作者信息</h3>
		<form action="searchAuthor">

    	书籍ID:<input type="text" name="b_id" value=""><br />
    	
    	<button >查询</button>
		</form>
	</div>
	<div>
		<h3>修改书籍信息</h3>
		<form action="updateBook">
 
    	书籍ID:<input type="text" name="b_id" value=""><br />
    	书名:<input type="text" name="b_name" value=""><br />
    	出版社:<input type="text" name="b_publisher" value=""><br />
    	数量:<input type="text" name="b_amount" value=""><br />
    	书籍位置:<input type="text" name="b_location" value=""><br />
    	管理员ID:<input type="text" name="l_id" value=""><br />
 
    	<button >修改</button>
		</form>
	</div>
	<div>
		<h3>删除书籍作者信息</h3>
		<p>输入要删除的书籍ID和作者名</p>
		<form action="deleteAuthor">
    		书籍ID:<input type="text" name="b_id" value=""><br />
    		作者名:<input type="text" name="author" value=""><br />
    	<button >删除</button>
		</form>
	</div>
</div>

