package com.xn.manager.service.impl;

import com.xn.common.dao.BaseDao;
import com.xn.common.service.impl.BaseServiceImpl;
import com.xn.manager.dao.BankDao;
import com.xn.manager.dao.BankStrategyDao;
import com.xn.manager.model.BankModel;
import com.xn.manager.model.BankStrategyModel;
import com.xn.manager.service.BankService;
import com.xn.manager.service.BankStrategyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:银行卡放量策略的Service层的实现层
 * @create 2018-09-11 14:41
 **/
@Service("bankStrategyService")
public class BankStrategyServiceImpl<T> extends BaseServiceImpl<T> implements BankStrategyService<T> {
    private static Logger log=Logger.getLogger(BankStrategyServiceImpl.class);

    @Autowired
    private BankStrategyDao bankStrategyDao;

    @Autowired
    private BankDao bankDao;
    @Override
    public BaseDao<T> getDao() {
        // TODO Auto-generated method stub
        return bankStrategyDao;
    }

    @Override
    public void importBankStrategy() {
        List<BankStrategyModel> list = bankStrategyDao.queryAllList();
        BankStrategyModel bankStrategyModelMax=bankStrategyDao.queryMaxupdateTime();
        BankModel  bankModel = new BankModel();
        List<Long> bankStrategybList  = new ArrayList<>();
        if (list.size()!=0 && list!=null){
            for(BankStrategyModel bankStrategyModel:list){
                bankStrategybList.add(bankStrategyModel.getBankId());
            }
            bankModel.setBankStrategyList(bankStrategybList);
        }

        List<BankModel>  addList   = bankDao.queryAllListImport(bankModel);

        if(bankStrategyModelMax==null){
            for(BankModel bankModel1: addList){
                BankStrategyModel  bankStrategyModel  = new BankStrategyModel();
                bankStrategyModel.setBankId(bankModel1.getId());
                bankStrategyModel.setAlias(bankModel1.getAlias());
                bankStrategyModel.setPriority(10);
//                bankStrategyModel.setOpenTimeSlot(0);
                bankStrategyModel.setZfbInDayMoney("0");
                bankStrategyModel.setZfbInMonthMoney("0");
                bankStrategyModel.setZfbInDayNum(0);
                bankStrategyModel.setCardInDayMoney("0");
                bankStrategyModel.setCardInMonthMoney("0");
                bankStrategyModel.setCardInDayNum(0);
                bankStrategyDao.add(bankStrategyModel);
            }
        }else{
            for(BankModel bankModel1: addList){
                BankStrategyModel  bankStrategyModel  = new BankStrategyModel();
                bankStrategyModel.setBankId(bankModel1.getId());
                bankStrategyModel.setAlias(bankModel1.getAlias());
                bankStrategyModel.setPriority(10);
                bankStrategyModel.setOpenTimeSlot(bankStrategyModelMax.getOpenTimeSlot());
                bankStrategyModel.setZfbInDayMoney(bankStrategyModelMax.getZfbInDayMoney());
                bankStrategyModel.setZfbInMonthMoney(bankStrategyModelMax.getZfbInMonthMoney());
                bankStrategyModel.setZfbInDayNum(bankStrategyModelMax.getZfbInDayNum());
                bankStrategyModel.setCardInDayMoney(bankStrategyModelMax.getCardInDayMoney());
                bankStrategyModel.setCardInMonthMoney(bankStrategyModelMax.getCardInMonthMoney());
                bankStrategyModel.setCardInDayNum(bankStrategyModelMax.getCardInDayNum());
                bankStrategyDao.add(bankStrategyModel);
            }
        }
    }

    @Override
    public BankStrategyModel queryMaxupdateTime() {
        return bankStrategyDao.queryMaxupdateTime();
    }
}
