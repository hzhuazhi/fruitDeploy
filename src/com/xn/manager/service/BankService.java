package com.xn.manager.service;

import com.xn.common.service.BaseService;
import com.xn.manager.model.BankModel;
import com.xn.system.entity.Account;

import java.util.List;
import java.util.Map;

/**
 * @Description:银行卡的Service层
 * @create 2018-09-11 14:40
 **/
public interface BankService<T> extends BaseService<T> {
    public Map<String, Object> isCheckCardsBank(BankModel cardsBankModel, Account account);

    public List<BankModel> queryAllListImport(BankModel bankModel);
}
