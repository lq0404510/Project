package com.abcedu.ssm.user.view;

import com.abcedu.ssm.user.service.UserService;
import com.abcedu.ssm.user.service.bo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @program: Test01
 * @description:
 * @author: Every
 * @create: 2019-11-16 15:03
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger log4j2 = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/add")
    public String add(User user) {
        userServiceImpl.insert(user);
        return "redirect:/user/list";
    }

    @RequestMapping("update")
    public String update(User user) {
        userServiceImpl.update(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String delete(int id) {
        int num = userServiceImpl.delete(id);
        if (num == 1) {
            return "1";
        } else {
            return "0";
        }

    }

    @RequestMapping("/find")
    public String find(int id, Model model) {
        User user = userServiceImpl.get(id);

        model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        List<User> list = userServiceImpl.list();
        map.put("list", list);
        return "list";
    }
}
