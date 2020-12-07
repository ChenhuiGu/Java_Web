package pers.guchh.web;
import pers.guchh.pojo.User;
import pers.guchh.service.UserService;
import pers.guchh.service.impl.UserServiceImpl;

import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserService userService = new UserServiceImpl();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        System.out.println(code);
        if("abcde".equalsIgnoreCase(code)){
            //用户名不可用
            if(userService.existUsername(username)){
                //跳转回注册页面
                System.out.printf("用户名%s已存在%n", username);
                //位于工程路径下
                request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
            }else{
                userService.registerUser(new User(null,username,password,email));
                request.getRequestDispatcher("/pages/user/regist_success.jsp").forward(request,response);
            }
        }else{
            System.out.println("验证码错误");
            request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
        }
    }

}
