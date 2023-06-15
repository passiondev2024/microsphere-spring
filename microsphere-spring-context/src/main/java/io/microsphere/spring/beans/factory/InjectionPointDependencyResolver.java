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
package io.microsphere.spring.beans.factory;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Set;

/**
 * Spring Injection Point Dependency Resolver
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public interface InjectionPointDependencyResolver {

    /**
     * Resolve the bean names as the dependencies from the specified {@link Field field}
     *
     * @param field              the {@link Field field} may be an injection point
     * @param beanFactory        {@link ConfigurableListableBeanFactory}
     * @param dependentBeanNames the dependent bean names to be manipulated
     */
    void resolve(Field field, ConfigurableListableBeanFactory beanFactory, Set<String> dependentBeanNames);

    /**
     * Resolve the bean names as the dependencies from the specified {@link Method method}
     *
     * @param method             the {@link Method method} may be an injection point
     * @param beanFactory        {@link ConfigurableListableBeanFactory}
     * @param dependentBeanNames the dependent bean names to be manipulated
     */
    void resolve(Method method, ConfigurableListableBeanFactory beanFactory, Set<String> dependentBeanNames);

    /**
     * Resolve the bean names as the dependencies from the specified {@link Constructor constructor}
     *
     * @param constructor        the {@link Constructor constructor} may be an injection point
     * @param beanFactory        {@link ConfigurableListableBeanFactory}
     * @param dependentBeanNames the dependent bean names to be manipulated
     */
    void resolve(Constructor constructor, ConfigurableListableBeanFactory beanFactory, Set<String> dependentBeanNames);

    /**
     * Resolve the bean names as the dependencies from the specified {@link Parameter parameter}
     *
     * @param parameter          the specified {@link Parameter parameter} of a method or constructor
     *                           was annotated by the annotation
     * @param beanFactory        {@link ConfigurableListableBeanFactory}
     * @param dependentBeanNames the dependent bean names to be manipulated
     * @return non-null read-only {@link List}
     */
    void resolve(Parameter parameter, ConfigurableListableBeanFactory beanFactory, Set<String> dependentBeanNames);
}
