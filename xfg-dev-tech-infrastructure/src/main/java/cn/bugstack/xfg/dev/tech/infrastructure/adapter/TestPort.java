package cn.bugstack.xfg.dev.tech.infrastructure.adapter;

import cn.bugstack.xfg.dev.tech.domain.adapter.port.ITestPort;
import cn.bugstack.xfg.dev.tech.infrastructure.gateway.TestApiService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestPort implements ITestPort {

    @Resource
    private TestApiService apiService;

    @Override
    public String queryUserInfo(String userId) {
        return apiService.queryUserInfo(userId);
    }
}
