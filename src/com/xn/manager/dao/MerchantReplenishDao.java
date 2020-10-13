package com.xn.manager.dao;

import com.xn.common.dao.BaseDao;
import com.xn.manager.model.MerchantReplenishModel;

/**
 * @Description 卡商审核补单申请的Dao层
 * @Author yoko
 * @Date 2020/10/12 18:49
 * @Version 1.0
 */
public interface MerchantReplenishDao<T> extends BaseDao<T> {

    /**
     * @Description: 更新审核信息
     * @param model
     * @return
     * @author yoko
     * @date 2020/10/12 18:53
    */
    public int updateCheck(MerchantReplenishModel model);
}
