package com.njau.service;

import com.njau.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/232:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestService {
    @Autowired
    private accountService accountService;

    @Test
    public void testServiceFindAll(){
        List<Account> accountList = accountService.findAll();
        System.out.println("---------------------size-----------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println(accountList.size());
        for (Account account : accountList) {
            System.out.println(account);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("-----------------------size---------------------------");

    }

    @Test
    public void testServiceInsert(){
        Account account = new Account();
        account.setName("张三");
        account.setMoney(123.0);
       accountService.insert(account);

    }

}
