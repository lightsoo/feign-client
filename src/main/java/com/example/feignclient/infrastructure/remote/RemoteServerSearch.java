package com.example.feignclient.infrastructure.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "${constants.host.remote-server}", url = "${constants.host.remote-server}", fallbackFactory = RemoteServerSearchFallbackFactory.class)
public interface RemoteServerSearch {

//    @RequestMapping(value = "/api/v1", method = RequestMethod.GET)
//    String get(@RequestParam String keyword);

    @RequestMapping(value = "/l7/checkL7", method = RequestMethod.GET)
    String get2(@RequestParam(value = "keyword") String keyword);

}
