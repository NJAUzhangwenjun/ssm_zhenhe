package com.njau.controller;

import com.njau.domain.Account;
import com.njau.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/233:08
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("success")
    public String success() {
        return "success";
    }

    @RequestMapping("toInsert")
    public String toInsert() {
        return "addAccount";
    }


    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Account> all = accountService.findAll();
        model.addAttribute("accounts", all);
        return "account";
    }


 @RequestMapping("insert")
    public String insert(Account account) {
        accountService.insert(account);
        return "success";
    }


}
