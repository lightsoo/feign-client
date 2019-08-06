# feign-client
## Feign-client 타임아웃 설정
```yaml
feign:
  httpclient:
    enabled: false
  okhttp:
    enabled: true
  hystrix:
    enabled: true
  client:
    config:
      default:
        connectTimeout: 2000
        readTimeout: 2000
```

## Hystrix와 함께 사용하는 경우
- FeignClient의 connect, read 타임아웃을 설정하더라고 1000ms 이상으로 하는 경우 Hystrix의 기본 타임아웃인 1000ms으로 인해 의도한대로 타임아웃 설정이 안된다.

```yaml
hystrix:
  command:
    default:
      execution.isolation.thread.timeoutInMilliseconds: 2000
```
