package top.wangyq.config;


import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author wangyq
 * @Description 范围分库算法
 * @date 2022年3月14日 23:07:36
 */
@Configuration
public class MyDBRangeShardingAlgorithm implements RangeShardingAlgorithm<Integer> {

    @Override
    public Collection<String> doSharding(Collection<String> databaseNames, RangeShardingValue<Integer> rangeShardingValue) {

        Set<String> result = new LinkedHashSet<>();
        // between and 的起始值
        int lower = rangeShardingValue.getValueRange().lowerEndpoint();
        int upper = rangeShardingValue.getValueRange().upperEndpoint();
        // 循环范围计算分库逻辑
        for (int i = lower; i <= upper; i++) {
            for (String databaseName : databaseNames) {
                if (databaseName.endsWith(i % databaseNames.size() + "")) {
                    result.add(databaseName);
                }
            }
        }
        return result;
    }
}


