/**
 * Copyright 2010-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mybatis.spring.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Namespace handler for the MyBatis namespace.
 *
 * @author Lishu Luo
 *
 * @see MapperScannerBeanDefinitionParser
 * @since 1.2.0
 */
//自定义XML标签解析，spring读取约定配置文件META-INF/spring.handlers  org.springframework.beans.factory.xml.DefaultNamespaceHandlerResolver
public class NamespaceHandler extends NamespaceHandlerSupport {

  /**
   * {@inheritDoc}
   */
  @Override
  public void init() {
    //解析scan节点 <mybatis:scan base-package="org.mybatis.spring.mapper" annotation="org.springframework.stereotype.Component"/>
    registerBeanDefinitionParser("scan", new MapperScannerBeanDefinitionParser());
  }

}
