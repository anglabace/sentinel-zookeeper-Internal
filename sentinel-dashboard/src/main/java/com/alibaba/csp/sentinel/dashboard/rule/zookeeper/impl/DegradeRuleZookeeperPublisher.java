package com.alibaba.csp.sentinel.dashboard.rule.zookeeper.impl;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.zookeeper.AbstractZookeeperRulePublisher;
import org.springframework.stereotype.Service;

/**
 * @Description Zookeeper规则发布类
 * @author: cc
 * @Date: 2019-03-04
 */
@Service("degradeRuleZookeeperPublisher")
public class DegradeRuleZookeeperPublisher extends AbstractZookeeperRulePublisher<DegradeRuleEntity> {

}