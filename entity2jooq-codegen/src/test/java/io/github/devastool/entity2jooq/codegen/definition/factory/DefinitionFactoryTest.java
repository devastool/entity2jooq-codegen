/*
 *    Copyright 2024 All entity2jooq contributors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.devastool.entity2jooq.codegen.definition.factory;

import io.github.devastool.entity2jooq.codegen.properties.CodegenProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests of {@link DefinitionFactory}.
 *
 * @author Andrey_Yurzanov
 */
class DefinitionFactoryTest extends CommonFactoryTest {
  @Test
  void canBuildTest() {
    DefinitionFactory<Object, Object> factory = new DefinitionFactory<>(null) {
      @Override
      public Object build(Object data, CodegenProperties properties) {
        return null;
      }
    };
    Assertions.assertTrue(factory.canBuild(null));
  }

  @Test
  void getContextTest() {
    DefinitionFactory<Object, Object> factory = new DefinitionFactory<>(new FactoryContext()) {
      @Override
      public Object build(Object data, CodegenProperties properties) {
        return null;
      }
    };
    Assertions.assertTrue(factory.canBuild(null));
  }
}