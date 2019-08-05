package com.example.feignclient.api;

import com.example.feignclient.infrastructure.remote.RemoteServerSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@RequiredArgsConstructor
public class Controller {
    private final RemoteServerSearch remoteServerSearch;

    @GetMapping
    public String get(@RequestParam String keyword) {
        return remoteServerSearch.get2(keyword);
    }

}
