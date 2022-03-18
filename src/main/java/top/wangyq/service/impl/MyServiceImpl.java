package top.wangyq.service.impl;

import org.springframework.stereotype.Service;
import top.wangyq.mapper.MyMapper;
import top.wangyq.model.Order;
import top.wangyq.service.MyService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyq
 * @date 2022年03月13日 17:12
 * @Description
 */
@Service
public class MyServiceImpl implements MyService {

    @Resource
    MyMapper myMapper;

    @Override
    public boolean save(Order order) {
        return myMapper.testInsert(order) > 0;
    }

    @Override
    public List<Order> selectOrderListPage() {
        List<Order> orders = myMapper.selectOrderListPage();
        List<Order> ordersForXml = myMapper.selectOrderListPageByXml();
        System.out.println("测试输出-01:orders = " + orders);
        System.out.println("测试输出-02:ordersForXml = " + ordersForXml);
        return orders;
    }

}
