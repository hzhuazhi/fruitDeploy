package com.xn.manager.dao;

import com.xn.common.dao.BaseDao;
import com.xn.manager.model.RechargeModel;

/**
 * @Description 卡商充值的Dao层
 * @Author yoko
 * @Date 2020/9/28 18:09
 * @Version 1.0
 */
public interface RechargeDao<T> extends BaseDao<T> {

    /**
     * @Description: 更新充值订单状态
     * <p>
     *     1.更新充值订单状态
     *     2.更新转账截图
     *     3.更新sendStatus的状态（因为下游可能会驳回此订单，所以后续还会有同步数据给下游）
     * </p>
     * @param model
     * @return
     * @author yoko
     * @date 2020/9/27 15:46
     */
    public int updateOrderStatus(RechargeModel model);

    /**
     * @Description: 管理员更新预付款、平台订单的审核信息
     * @param model
     * @return
     * @author yoko
     * @date 2020/10/15 16:27
     */
    public int updateCheck(RechargeModel model);


    /**
     * @Description: 分派卡站点
     * @param model
     * @return
     * @author yoko
     * @date 2020/10/19 10:32
     */
    public int updateCardSite(RechargeModel model);
}
