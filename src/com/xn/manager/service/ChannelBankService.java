package com.xn.manager.service;

import com.xn.common.service.BaseService;

/**
 * @Description:商户与银行卡的绑定关系Service层
 * @create 2018-09-11 14:40
 **/
public interface ChannelBankService<T> extends BaseService<T> {
    /***
     * 根据id 查询该id 下对应的银行卡，并且组成一个String 出来
     * @param id
     * @return
     */
    public String   byIdQueryBankCard(Long id);
}
