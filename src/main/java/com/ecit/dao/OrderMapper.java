package com.ecit.dao;

import com.ecit.bean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    Order selectBySelective(Order record);


    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByUserIdAndOrderNo(@Param("userId")Integer userId, @Param("orderNo")Long orderNo);


    Order selectByOrderNo(Long orderNo);



    List<Order> selectByUserId(Integer userId);

    List<Order> selectByUserIdAndStatus(@Param("userId")Integer userId,@Param("orderStatus")String orderStatus);

    List<Order> selectAllOrder();

    List<Order> selectAllOrderByBusiness(@Param("userId")Integer userId);

}