package top.wangyq.mapper;

import org.apache.ibatis.annotations.*;
import top.wangyq.model.Order;

import java.util.List;

/**
 * @author wangyongqiang
 */
@Mapper
public interface MyMapper {
    /**
     * @author wangyq
     * @date 2022/3/13 19:59
     * @Description 使用注解的方式测试查询，并对返回值进行映射
     */
    @Results({
            @Result(property = "orderId",column = "order_id"),
            @Result(property = "orderNo",column = "order_no"),
            @Result(property = "createName",column = "create_name")
    })
    @Select("SELECT * FROM t_order order by order_id desc")
    List<Order> selectOrderListPage();

    /**
     * @author wangyq
     * @date 2022/3/13 19:59
     * @Description 使用xml的方式测试查询，并对返回值进行映射
     */
    List<Order> selectOrderListPageByXml();

    /**
     * @author wangyq
     * @date 2022/3/12 16:22
     * @Description 测试插入
     */
    @Insert("insert `t_order`(order_id,order_no,create_name,price) values(#{orderId},#{orderNo},#{createName},#{price})")
    int testInsert(Order order);
}
