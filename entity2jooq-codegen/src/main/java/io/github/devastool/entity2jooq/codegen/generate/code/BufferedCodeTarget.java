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

package io.github.devastool.entity2jooq.codegen.generate.code;

/**
 * Implementation of {@link CodeTarget} for source code writing to buffer.
 *
 * @author Andrey_Yurzanov
 * @since 1.0.0
 */
public class BufferedCodeTarget implements CodeTarget {
  private final StringBuilder buffer = new StringBuilder();

  /**
   * Returns buffer data.
   *
   * @return buffer data
   */
  public String getBuffer() {
    return buffer.toString();
  }

  @Override
  public CodeTarget rawWrite(String value) {
    buffer.append(value);
    return this;
  }

  @Override
  public CodeTarget write(String value) {
    return rawWrite(value);
  }

  @Override
  public CodeTarget writeln(String value) {
    write(value);
    write(System.lineSeparator());
    return this;
  }
}
