package top.wangyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.wangyq.model.Order;
import top.wangyq.service.MyService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyongqiang
 */
@Controller
@RequestMapping
public class MyController<TestSelect> {

    @Resource
    MyService myService;

    @GetMapping(value = "/selectOrderListPage")
    @ResponseBody
    public List<Order> selectOrderListPage() {
        // http://localhost:18080/selectOrderListPage
        return myService.selectOrderListPage();
    }

    @GetMapping("/insert")
    @ResponseBody
    public boolean insert(Order order) {
        // http://localhost:18080/insert?orderId=9&orderNo=22&createName=2022-03-13&price=21
        return myService.save(order);
    }
}
