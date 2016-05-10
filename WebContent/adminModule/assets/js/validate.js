$(function(){
				var userflag=false;   /*用户账号标志位  */
				var passflag=false;   /*用户密码标志位*/
				/* 当焦点集中时，清空输入框中的信息*/
				$("input[name='username']").focus(function(){
					$(this).val("");
					$("#nametip").html("");
				});
				$("input[name='password']").focus(function(){
						$(this).val("");
						$("#passtip").html("");
				});
				/*
				 inpType：输入框的类型，具体对象
				 tipbox：提示消息的容器
				 * */
				function vilidta(inpType,tipbox){
					var value= inpType.val();
					var tip= inpType.attr("name")=="username"?"账号":"密码";
					var reg=/^[A-Za-z0-9]{6,12}$/;
					//错误提示标志位
					var error_flag = false;
					var message;
					if(value==""){
						message=tip+"不能为空！";
					}else if(value.length<6){
						message=tip+"长度不能少于6位！";
					}else if(!value.match(reg)){
						message=tip+"长度不能少于6位！";
					}else{
						if(inpType.attr("name")=="username"){
							userflag=true;
						}else{
							passflag=true;
						}
						//验证通过设置错误提示标志位为true
						error_flag = true;
						//判断输入正确后拿掉错误图片
						$('.page-container form').find('.error').fadeOut('fast', function(){
							
			            });
					}
					$(tipbox).html(message);
					
					//根据错误提示标志位error_flag以及tip的值来判断错误图片的显示位置
					if(error_flag == false && tip == "账号"){
						//账号验证未通过，在账号输入框后面显示错误图片
						$('.page-container form').find('.error').fadeIn('fast', function(){
							$(this).css("top","27px");
			            });
					}else if(error_flag == false && tip == "密码"){
						//密码验证未通过，在密码输入框后面显示错误图片
						$('.page-container form').find('.error').fadeIn('fast', function(){
							$(this).css("top","96px");
			            });
					}
				}
				
				/* 账号和密码验证*/
				$("input[name='username']").blur(function(){
					vilidta($(this),$("#nametip"));
				});
				$("input[name='password']").blur(function(){
					vilidta($(this),$("#passtip"));
				});
				/*提交表单 */
				$("form").submit(function(){
					if(userflag==true&&passflag==true){
						return true;
					}else{
						return false;
					}
				});
				
			});