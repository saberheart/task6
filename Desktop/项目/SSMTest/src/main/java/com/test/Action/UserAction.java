package com.test.Action;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  

import com.test.domain.User;
import com.test.service.UserService;
  
  
  
@Controller  
@RequestMapping("/user")  
public class UserAction {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/show")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.selectByPrimaryKey(userId);  
        model.addAttribute("user", user);  
        return "show";  
    }  
}  
