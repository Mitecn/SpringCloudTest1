package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.pojo.User;

public interface OrderService {
	/** 获取订单信息 */
	Order getOrder(String orderId);
	/** 添加订单 */
	void addOrder(Order order);
	
	

}
