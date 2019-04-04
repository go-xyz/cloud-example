package com.cloud.example.client;

import com.cloud.example.base.BaseClient;
import com.cloud.example.base.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ; lidongdong
 * @Description
 * @Date 2019/4/2
 */
@Slf4j
@RestController
@RequestMapping(value = "/sso")
public class WebSsoClient extends BaseClient {

    @ResponseBody
    @RequestMapping(value = "/login")
    public ResultResponse login(String param) {

        return ResultResponse.success();
    }

    @ResponseBody
    @RequestMapping(value = "/findDetail")
    public ResultResponse findDetail(String id) {
        log.info(id);
        return ResultResponse.success(id);
    }

}
