<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>商品类别新增表单</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="<%=request.getServletContext().getContextPath()%>/static/shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=request.getServletContext().getContextPath()%>/static/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=request.getServletContext().getContextPath()%>/static/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=request.getServletContext().getContextPath()%>/static/css/animate.min.css" rel="stylesheet">
    <link href="<%=request.getServletContext().getContextPath()%>/static/css/style.min.css?v=4.0.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>商品类别修改表单 <small style="color: green; font-weight: bold">${message }</small></h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="form_basic.html#">选项1</a>
                                </li>
                                <li><a href="form_basic.html#">选项2</a>
                                </li>
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <form method="post" class="form-horizontal" action="<%=request.getServletContext().getContextPath()%>/admin/goods/goodsEditSave">
                    <div class="form-group">
                                <label class="col-sm-2 control-label">商品序号</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="id" required="required" readonly="readonly" value="${goods.id }">
                                </div>
                            </div>
                      
                              <div class="form-group">
                                <label class="col-sm-2 control-label">商品名称</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="name" required="required" value="${goods.name }" >
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">商品进价</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="inprice" required="required" value="${goods.inprice}">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">商品售价</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="saleinprice" required="required"  value="${goods.saleinprice }">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">商品描述</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="discription" required="required" value="${goods.discription }">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">折扣</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="discount" required="required" value="${goods.discount }">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">产地</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="productplace" required="required" value="${goods.productplace }">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">计量单位</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="unit" required="required" value="${goods.unit }">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">规格</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="standard" required="required" value="${goods.standard }">
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label class="col-sm-2 control-label">已销售量</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="salenum" required="required" value="${goods.salenum }">
                                </div>
                            </div>
                            
                                  <div class="form-group">
                                <label class="col-sm-2 control-label">状态</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="status" required="required" value="${goods.status }">
                                </div>
                            </div>
                            
                              <div class="form-group">
                                <label class="col-sm-2 control-label">选择类别</label>

                                <div class="col-sm-10">
                                   <select name="type.id" class="form-control">
                                   <option>请选择</option>
                                    <c:forEach items="${typesList}" var="v">
                                   <c:choose>
                                   <c:when test="${v.id==goods.type.id }">
                                    <option value="${v.id }" selected="selected">${v.typename }</option>
                                   </c:when>
                                   <c:otherwise>
                                   <option value="${v.id }" >${v.typename }</option>
                                   </c:otherwise>
                                   </c:choose>
                                  
                                  
                                   
                                   </c:forEach>
                                   </select>
                                </div>
                            </div>
                         
                           
                            
                                   
                                    
                                </div>
                            </div>
                            <div class="hr-line-dashed"></div>
                            <div class="form-group">
                                <div class="col-sm-4 col-sm-offset-2">
                                    <button class="btn btn-primary" type="submit" >修改</button>
                                    <button class="btn btn-white" type="submit">取消</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

   
    <script src="<%=request.getServletContext().getContextPath()%>/static/js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=request.getServletContext().getContextPath()%>/static/js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=request.getServletContext().getContextPath()%>/static/js/content.min.js?v=1.0.0"></script>
    <script src="<%=request.getServletContext().getContextPath()%>/static/js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function(){$(".i-checks").iCheck({checkboxClass:"icheckbox_square-green",radioClass:"iradio_square-green",})});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>