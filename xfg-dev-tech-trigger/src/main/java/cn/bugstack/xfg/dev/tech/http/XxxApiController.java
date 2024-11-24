package cn.bugstack.xfg.dev.tech.http;

import cn.bugstack.xfg.dev.tech.domain.service.TestService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController()
@CrossOrigin("*")
@RequestMapping("/api/v1/")
public class XxxApiController {

    @Resource
    private TestService service;

    /**
     * curl http://127.0.0.1:8091/api/v1/query_user_info
     */
    @RequestMapping(value = "query_user_info", method = RequestMethod.GET)
    public String queryUserInfo() {
        return service.queryUserInfo("xfg");
    }

}
