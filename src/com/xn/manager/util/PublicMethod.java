package com.xn.manager.util;


import org.apache.log4j.Logger;

import java.util.UUID;

/**
 * @author df
 * @Description: TODO(公共方法类)
 * @create 10:12 2018/9/12
 **/
public class PublicMethod{
    private static Logger log = Logger.getLogger(PublicMethod.class);




    /**
     * @Description: TODO(生成UUID)
     * @author df
     * @create 16:56 2018/9/18
     **/
    public static String assembleUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }





    public static void main(String[] args) throws Exception {
//        List<Long> idList = list.stream().map(ChannelModel::getId).collect(Collectors.toList());// 获取某集合的某属性的集合
    }
}
