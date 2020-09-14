package com.xn.manager.dao;

import com.xn.common.dao.BaseDao;
import com.xn.manager.model.BankStrategyModel;

/**
 * @Description:银行卡放量策略
 * @create 2018-09-11 14:42
 **/
public interface BankStrategyDao<T> extends BaseDao<T> {
    public BankStrategyModel queryMaxupdateTime();
}
