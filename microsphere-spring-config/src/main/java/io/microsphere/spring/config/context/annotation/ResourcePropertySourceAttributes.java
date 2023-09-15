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
package io.microsphere.spring.config.context.annotation;

import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.lang.annotation.Annotation;
import java.util.Comparator;
import java.util.Map;

/**
 * The annotation attributes for {@link ResourcePropertySource}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see ResourcePropertySource
 * @see PropertySourceExtensionAttributes
 * @since 1.0.0
 */
public class ResourcePropertySourceAttributes<A extends Annotation> extends PropertySourceExtensionAttributes<A> {

    public ResourcePropertySourceAttributes(Map<String, Object> another, Class<A> annotationType, PropertyResolver propertyResolver) {
        super(another, annotationType, propertyResolver);
    }

    public final String[] getValue() {
        return getStringArray("value");
    }

    public final Class<? extends Comparator<Resource>> getResourceComparatorClass() {
        return getClass("resourceComparator");
    }

    public final boolean isIgnoreResourceNotFound() {
        return getBoolean("ignoreResourceNotFound");
    }

    public final String getEncoding() {
        return getString("encoding");
    }

    public final Class<? extends PropertySourceFactory> getPropertySourceFactoryClass() {
        return getClass("factory");
    }
}
