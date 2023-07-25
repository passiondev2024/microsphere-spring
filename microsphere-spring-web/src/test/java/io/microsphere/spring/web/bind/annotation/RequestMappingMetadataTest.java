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
package io.microsphere.spring.web.bind.annotation;

import io.microsphere.spring.web.rule.GenericMediaTypeExpression;
import io.microsphere.spring.web.rule.StringNameValueExpression;
import io.microsphere.util.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * {@link RequestMappingMetadata} Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public class RequestMappingMetadataTest {

    private RequestMappingMetadata metadata;

    @BeforeEach
    public void init() {
        metadata = new RequestMappingMetadata(
                ArrayUtils.of("/echo/{a}/{b}", "/{a}/{b}"),
                ArrayUtils.of(RequestMethod.GET, RequestMethod.POST),
                ArrayUtils.of(StringNameValueExpression.of("p1"), StringNameValueExpression.of("p2=1")),
                ArrayUtils.of(StringNameValueExpression.of("h1=1"), StringNameValueExpression.of("h2!=1")),
                ArrayUtils.of(GenericMediaTypeExpression.of("application/json")),
                ArrayUtils.of(GenericMediaTypeExpression.of("text/html"))
        );
    }

    @Test
    public void test() {
        System.out.println(metadata.toString());
    }
}