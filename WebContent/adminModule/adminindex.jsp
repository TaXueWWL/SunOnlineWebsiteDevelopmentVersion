<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>太阳在线管理后台</title>

<link rel="stylesheet" href="css/index.css" type="text/css" media="screen" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/tendina.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>

</head>
<body>
    <!--顶部-->
    <div class="layout_top_header">
            <div style="float: left"><span style="font-size: 20px;line-height: 45px;padding-left: 20px;color:#87CEEB">太阳在线管理后台</h1></span></div>
            <div id="ad_setting" class="ad_setting">
                <a class="ad_setting_a" href="javascript:; ">
                    <i class="icon-user glyph-icon" style="font-size: 20px"></i>
                    <!-- 从session中取出当前登录的管理员名称 -->
                    <span style="color:#FCFCFC">管理员<font color="red"><%=session.getAttribute("admin_name") %></font></span>
                    <i class="icon-chevron-down glyph-icon"></i>
                </a>
                <ul class="dropdown-menu-uu" style="display: none" id="ad_setting_ul">
                    <li class="ad_setting_ul_li"> <a href="javascript:;"><i class="icon-user glyph-icon"></i> 个人中心 </a> </li>
                    <li class="ad_setting_ul_li"> <a href="javascript:;"><i class="icon-cog glyph-icon"></i> 设置 </a> </li>
                    <li class="ad_setting_ul_li"> <a href="adminlogout_pro.jsp"><i class="icon-signout glyph-icon"></i> <span class="font-bold">注销</span> </a> </li>
                </ul>
            </div>
	</div>
    <!--顶部结束-->
    <!--菜单-->
    <div class="layout_left_menu">
        <ul id="menu">
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>首页</a>
                <!--ul>
                    <li><a href="user_add.html" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>用户添加</a></li>
                </ul-->
            </li>
            <li class="childUlLi">
                <a href="user.html"  target="menuFrame"> <i class="glyph-icon icon-reorder"></i>视频类栏目管理</a>
                <ul>
                    <li><a href="#"><i class="glyph-icon icon-chevron-right"></i>Higo大学季</a></li>
                    <li><a href="#"><i class="glyph-icon icon-chevron-right"></i>高校最强音</a></li>
                    <li><a href="#"><i class="glyph-icon icon-chevron-right"></i>影视老司机</a></li>
                </ul>
            </li>
            <li class="childUlLi">
                <a href="role.html" target="menuFrame"> <i class="glyph-icon icon-reorder"></i>图片类栏目管理</a>
                <ul>
                    <li><a href="#"><i class="glyph-icon icon-chevron-right"></i>山西高校图片库</a></li>
                    <li><a href="#"><i class="glyph-icon icon-chevron-right"></i>高校人物风采录</a></li>
                </ul>
            </li>
            <li class="childUlLi">
                <a href="#"> <i class="glyph-icon  icon-location-arrow"></i>菜单管理</a>
                <!--ul>
                    <li><a href="meunbox.html" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>平台菜单</a></li>
                    <li><a href="meunbox_add.html" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>运行商菜单</a></li>
                    <li><a href="#" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>服务站菜单</a></li>
                    <li><a href="#" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>商家菜单</a></li>
                </ul-->
            </li>
        </ul>
    </div>
    <!--菜单-->
    <div id="layout_right_content" class="layout_right_content">
        <div class="route_bg">
            <a href="#">主页</a><i class="glyph-icon icon-chevron-right"></i>
            <a href="#">菜单管理</a>

        </div>
        <div class="mian_content">

            <div id="page_content">
                <iframe id="menuFrame" name="menuFrame" src="http://www.baidu.com" style="overflow:visible;"
                        scrolling="yes" frameborder="no" width="100%" height="100%"></iframe>
            </div>
        </div>
    </div>
    <div class="layout_footer">
        <p>Copyright © 2016 - 太阳在线</p>
    </div>
    
    <script type="text/javascript">
	$(document).ready(function(){
		window.history.forward(1);
	});
	</script>
</body>
</html>
