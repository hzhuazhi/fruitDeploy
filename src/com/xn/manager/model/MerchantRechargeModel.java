package com.xn.manager.model;

import com.xn.common.page.BasePage;

import java.util.Date;

public class MerchantRechargeModel extends BasePage {
    /**
     * 自增主键ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 归属的账号ID：对应表tb_hz_sys_account的主键ID，并且角色类型是卡商
     *
     * @mbggenerated
     */
    private Long accountId;

    /**
     * 订单号
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * 订单金额
     *
     * @mbggenerated
     */
    private String orderMoney;

    /**
     * 订单状态：1初始化，2超时/失败，3成功
     *
     * @mbggenerated
     */
    private Integer orderStatus;

    /**
     * 支付类型：1卡商支付，2我方支付
     *
     * @mbggenerated
     */
    private Integer payType;

    /**
     * 我方银行卡信息备注:假如我方卡进行支付，则填写我方银行卡信息
     *
     * @mbggenerated
     */
    private String myBankInfo;

    /**
     * 银行名称/归属开户行
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * 银行卡账号/银行卡号
     *
     * @mbggenerated
     */
    private String bankCard;

    /**
     * 开户名
     *
     * @mbggenerated
     */
    private String accountName;

    /**
     * 充值记录银行卡转账图片凭证
     *
     * @mbggenerated
     */
    private String pictureAds;

    /**
     * 数据说明：做解说用的
     *
     * @mbggenerated
     */
    private String dataExplain;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 创建日期：存的日期格式20160530
     *
     * @mbggenerated
     */
    private Integer curday;

    /**
     * 创建所属小时：24小时制
     *
     * @mbggenerated
     */
    private Integer curhour;

    /**
     * 创建所属分钟：60分钟制
     *
     * @mbggenerated
     */
    private Integer curminute;

    /**
     * 运行计算次数
     *
     * @mbggenerated
     */
    private Integer runNum;

    /**
     * 运行计算状态：：0初始化，1锁定，2计算失败，3计算成功
     *
     * @mbggenerated
     */
    private Integer runStatus;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * TS时间
     *
     * @mbggenerated
     */
    private Date tsTime;

    /**
     * 是否有效：0有效，1无效/删除
     *
     * @mbggenerated
     */
    private Integer yn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney;
    }



    public String getMyBankInfo() {
        return myBankInfo;
    }

    public void setMyBankInfo(String myBankInfo) {
        this.myBankInfo = myBankInfo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPictureAds() {
        return pictureAds;
    }

    public void setPictureAds(String pictureAds) {
        this.pictureAds = pictureAds;
    }

    public String getDataExplain() {
        return dataExplain;
    }

    public void setDataExplain(String dataExplain) {
        this.dataExplain = dataExplain;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCurday() {
        return curday;
    }

    public void setCurday(Integer curday) {
        this.curday = curday;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getTsTime() {
        return tsTime;
    }

    public void setTsTime(Date tsTime) {
        this.tsTime = tsTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getCurhour() {
        return curhour;
    }

    public void setCurhour(Integer curhour) {
        this.curhour = curhour;
    }

    public Integer getCurminute() {
        return curminute;
    }

    public void setCurminute(Integer curminute) {
        this.curminute = curminute;
    }

    public Integer getRunNum() {
        return runNum;
    }

    public void setRunNum(Integer runNum) {
        this.runNum = runNum;
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}