package top.wangyq.service;

import top.wangyq.model.Order;

import java.util.List;

/**
 * @author wangyq
 * @date 2022年03月13日 17:12
 * @Description
 */
public interface MyService {
    /**保存数据*/
    boolean save(Order order);

    /**查询数据*/
    List<Order> selectOrderListPage();


    /*
     *
     * 测试分支管理：
     * 第一次测试：2022年6月8日 16:58:51
     */
}
