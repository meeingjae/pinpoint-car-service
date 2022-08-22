# Pinpoint - Car Service

-- --

PinPoint 도입 테스트를 위한 Springboot Web Service

### VM Option

```
-javaagent:"/{PINPOINT_PATH}/pinpoint-agent-{PINPOINT_VERSION}/pinpoint-bootstrap.jar"
-Dpinpoint.agentId={AGENT_NAME}
-Dpinpoint.applicationName={APPLICATION_NAME}
```

### PinPoint Install

https://pinpoint-apm.gitbook.io/pinpoint/getting-started/installation

### JDK 8 Compatibility

* **Hbase**
    * [1.4.2](https://archive.apache.org/dist/hbase/1.4.2/)
* **PinPoint**
    * [2.3.3](https://github.com/pinpoint-apm/pinpoint/releases/tag/v2.3.3)
* **Flink**
    * 1.7.x