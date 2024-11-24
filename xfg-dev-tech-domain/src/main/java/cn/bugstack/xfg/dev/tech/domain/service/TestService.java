package cn.bugstack.xfg.dev.tech.domain.service;

import cn.bugstack.xfg.dev.tech.domain.adapter.port.ITestPort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    private ITestPort port;

    public String queryUserInfo(String userId) {
        return port.queryUserInfo(userId);
    }

}
