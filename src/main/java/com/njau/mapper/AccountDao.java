package com.njau.mapper;

import com.njau.domain.Account;
import com.njau.domain.AccountExample;
import org.springframework.stereotype.Repository;

/**
 * AccountDao继承基类
 */
@Repository
public interface AccountDao extends MyBatisBaseDao<Account, Integer, AccountExample> {
}