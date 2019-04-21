<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
 
<body bgcolor="#CC99FF"></body>
<div>
	<h2>借书信息管理</h2>
	<h3>借书信息查询</h3>
	<div>
		<a href="http://127.0.0.1:8080/DBMS/listBorrow">
    		<button>查询所有借书信息列表</button>
		</a>
	</div>
	<div>
	<p>请输入读者ID或书籍ID以查询借阅信息</p>
		<form action="searchBorrow">
    		书籍ID:<input type="text" name="b_id" value=""><br />
    		读者ID:<input type="text" name="r_id" value=""><br />
    		<button >查询</button>
		</form>
	</div>
	<div>
		<h3>添加借书信息</h3>
		<form action="addBorrow">
 
    	读者ID:<input type="text" name="r_id" value=""><br />
    	书籍ID:<input type="text" name="b_id" value=""><br />
    	借书日期:<input type="text" name="borrow_date" value=""><br />
    	应还日期:<input type="text" name="return_date" value=""><br />
    	
    	<button >添加</button>
		</form>
	</div>
	<div>
		<h3>修改借书信息</h3>
		<form action="updateBorrow">
 
    	读者ID:<input type="text" name="r_id" value=""><br />
    	书籍ID:<input type="text" name="b_id" value=""><br />
    	借书日期:<input type="text" name="borrow_date" value=""><br />
    	应还日期:<input type="text" name="return_date" value=""><br />
    	
    	<button >修改</button>
		</form>
	</div>
	<div>
		<h3>删除借书信息</h3>
		<p>请输入读者ID或书籍ID以删除借阅信息</p>
		<form action="deleteBorrow">
    		书籍ID:<input type="text" name="b_id" value=""><br />
    		读者ID:<input type="text" name="r_id" value=""><br />
    	<button >删除</button>
		</form>
	</div>
</div>