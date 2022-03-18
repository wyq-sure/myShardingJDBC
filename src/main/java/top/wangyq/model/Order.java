package top.wangyq.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wangyongqiang
 */
@Data
public class Order {

    private Long orderId;

    private String orderNo;

    private String createName;

    private BigDecimal price;
}