<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>后台 - 登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="<%=request.getServletContext().getContextPath() %>favicon.ico"> 
    <link href="<%=request.getServletContext().getContextPath() %>/static/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=request.getServletContext().getContextPath() %>/static/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link href="<%=request.getServletContext().getContextPath() %>/static/css/animate.min.css" rel="stylesheet">
    <link href="<%=request.getServletContext().getContextPath() %>/static/css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
    <style>
    	body{
    		background-image: url("<%=request.getServletContext().getContextPath() %>/static/background.jpg");
    		
    	}
    </style>
</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name" style="color: green;">XD</h1>

            </div>
            <h3>欢迎使用 购物天堂</h3>
			<p class="text-muted text-center"> 
                	<a style="color: red;"><small>${error }</small></a>
            </p>
            <form class="m-t" role="form" action="<%=request.getServletContext().getContextPath() %>/admin/login" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" name="username" placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" placeholder="密码" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>
				
                <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
                </p>
                
            </form>
        </div>
    </div>
    <script src="<%=request.getServletContext().getContextPath() %>/static/js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=request.getServletContext().getContextPath() %>/static/js/bootstrap.min.js?v=3.3.5"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>