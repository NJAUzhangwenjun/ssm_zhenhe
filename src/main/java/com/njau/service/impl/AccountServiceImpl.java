package com.njau.service.impl;

import com.njau.domain.Account;
import com.njau.domain.AccountExample;
import com.njau.mapper.AccountDao;
import com.njau.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/232:13
 */
@Service()
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.createCriteria();
        List<Account> accounts = accountDao.selectByExample(accountExample);
        return accounts;
    }

    @Override
    public void insert(Account account) {
        int insert = accountDao.insert(account);
    }
}
