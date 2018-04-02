/**
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.developers.msa.ola;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.AuditAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointWebMvcManagementContextConfiguration;
import org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.ManagementServerPropertiesAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricFilterAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricRepositoryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.TraceRepositoryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Tips from https://alexecollins.com/spring-boot-performance/
//@SpringBootApplication
@Configuration
@EnableSwagger2
@Import({
    AuditAutoConfiguration.class,
    DispatcherServletAutoConfiguration.class,
    EmbeddedServletContainerAutoConfiguration.class,
    EndpointAutoConfiguration.class,
    EndpointMBeanExportAutoConfiguration.class,
    EndpointWebMvcAutoConfiguration.class,
    EndpointWebMvcManagementContextConfiguration.class,
    ErrorMvcAutoConfiguration.class,
    //GenericCacheConfiguration.class,
    GsonAutoConfiguration.class,
    //GsonHttpMessageConvertersConfiguration.class,
    HealthIndicatorAutoConfiguration.class,
    HttpEncodingAutoConfiguration.class,
    HttpMessageConvertersAutoConfiguration.class,
    InfoContributorAutoConfiguration.class,
    JacksonAutoConfiguration.class,
    //JacksonHttpMessageConvertersConfiguration.class,
    JmxAutoConfiguration.class,
    KeycloakSpringBootConfiguration.class,
    ManagementServerPropertiesAutoConfiguration.class,
    MetricExportAutoConfiguration.class,
    MetricFilterAutoConfiguration.class,
    MetricRepositoryAutoConfiguration.class,
    MultipartAutoConfiguration.class,
    PublicMetricsAutoConfiguration.class,
    //RedisCacheConfiguration.class,
    ServerPropertiesAutoConfiguration.class,
    //ServerTracingAutoConfiguration.class,
    //SimpleCacheConfiguration.class,
    TraceRepositoryAutoConfiguration.class,
    TraceWebFilterAutoConfiguration.class,
    WebClientAutoConfiguration.class,
    WebMvcAutoConfiguration.class,
    WebSocketAutoConfiguration.class,
    OlaController.class,
    HystrixServletConfiguration.class,
    KeycloakCORSConfiguration.class,
    SwaggerConfiguration.class,
    TracingConfiguration.class
})
public class OlaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OlaApplication.class, args);
    }

}
