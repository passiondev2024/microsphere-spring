/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.microsphere.spring.resilience4j.circuitbreaker.web;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.microsphere.spring.resilience4j.common.Resilience4jModule;
import org.junit.jupiter.api.Test;

import static io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry.ofDefaults;
import static org.junit.Assert.assertEquals;

/**
 * {@link CircuitBreakerHandlerMethodInterceptor} Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public class CircuitBreakerHandlerInterceptorTest {

    private static final CircuitBreakerRegistry registry = ofDefaults();

    private final CircuitBreakerHandlerMethodInterceptor interceptor = new CircuitBreakerHandlerMethodInterceptor(registry);


    @Test
    public void testProperties() {
        assertEquals(registry, interceptor.getRegistry());
        assertEquals(registry.getDefaultConfig(), interceptor.getDefaultConfiguration());
        assertEquals(CircuitBreaker.class, interceptor.getEntryClass());
        assertEquals(CircuitBreakerConfig.class, interceptor.getConfigurationClass());
        assertEquals(Resilience4jModule.CIRCUIT_BREAKER, interceptor.getModule());

    }

    @Test
    public void testPreHandle() {

    }
}
