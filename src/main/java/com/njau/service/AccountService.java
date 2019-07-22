package com.njau.service;

import com.njau.domain.Account;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/232:13
 */
public interface AccountService {

    List<Account> findAll();


    void insert(Account account);
}
