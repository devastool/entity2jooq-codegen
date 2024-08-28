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

package io.github.devastool.entity2jooq.codegen.generate.code.operator;

import io.github.devastool.entity2jooq.codegen.generate.code.BufferedCodeTarget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests of {@link VarCodeGenerator}.
 *
 * @author Sergey_Konovalov
 */
class VarCodeGeneratorTest {
  private static final String VARIABLE_NAME = "myVariable";

  @Test
  void generate() {

    var operator = new VarCodeGenerator(VARIABLE_NAME);

    BufferedCodeTarget target = new BufferedCodeTarget();
    operator.generate(target);

    Assertions.assertEquals(VARIABLE_NAME, target.getBuffer());
  }
}