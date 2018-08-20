package com.kevin.action;

import com.kevin.entity.User;
import com.kevin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by kinthon on 17-6-25.
 */

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    @Resource(name = "userService")
    private UserService userService;

    private User user = new User();

    private List<User> list;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getModel() {
        return null;
    }


    public String addUser(){
        userService.addUser(user);
        return "add_success";
    }

    public String login() {
        User existUser = userService.login(user);
        if (existUser == null){
            //登陆失败
            this.addActionError("用户名或密码错误!");
            return ERROR;
        }else {
            //登陆成功
            ActionContext.getContext().getSession().put("existUser",existUser);
            return SUCCESS;
        }
    }

    public String getUserById(){
        user = userService.getUserById(user.getId());
        return "query_success";
    }

    public String getAll(){
        list = userService.getAll();
        ActionContext.getContext().put("list",list);
        return "findAll";
    }

    public String update(){
        userService.update(user);
        return "find";
    }
}
