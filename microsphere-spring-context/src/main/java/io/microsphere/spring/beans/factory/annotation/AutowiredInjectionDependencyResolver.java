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
package io.microsphere.spring.beans.factory.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;

/**
 * {@link AnnotatedInjectionDependencyResolver} for {@link Autowired}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public class AutowiredInjectionDependencyResolver extends AbstractAnnotatedInjectionDependencyResolver<Autowired> {

    @Override
    public Autowired getAnnotation(Parameter parameter) {
        Autowired autowired = super.getAnnotation(parameter);
        if (autowired == null) {
            // Method or Constructor
            Executable executable = parameter.getDeclaringExecutable();
            autowired = super.getAnnotation(executable);
        }
        return autowired;
    }

}
