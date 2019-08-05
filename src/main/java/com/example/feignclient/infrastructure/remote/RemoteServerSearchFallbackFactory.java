package com.example.feignclient.infrastructure.remote;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class RemoteServerSearchFallbackFactory implements FallbackFactory<RemoteServerSearch> {

    @Override
    public RemoteServerSearch create(Throwable cause) {
        return new RemoteServerSearch() {
            @Override
            public String get2(String keyword) {
                return "";
            }
        };
    }
}
