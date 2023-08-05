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
package io.microsphere.spring.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;

/**
 * {@link ApplicationEvent} Interceptor
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see ApplicationEvent
 * @since 1.0.0
 */
public interface ApplicationEventInterceptor {

    /**
     * Intercept the specified {@link ApplicationEvent} with {@link ResolvableType type}
     *
     * @param event     {@link ApplicationEvent}
     * @param eventType {@link ResolvableType} to present the type of {@link ApplicationEvent}
     * @param chain     {@link ApplicationEventInterceptorChain}
     */
    void intercept(ApplicationEvent event, ResolvableType eventType, ApplicationEventInterceptorChain chain);
}
