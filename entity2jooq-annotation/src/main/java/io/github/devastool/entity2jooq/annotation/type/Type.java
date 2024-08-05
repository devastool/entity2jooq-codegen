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

package io.github.devastool.entity2jooq.annotation.type;

import io.github.devastool.entity2jooq.annotation.type.Type.Types;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Type of the column.
 *
 * @author Andrey_Yurzanov
 * @since 1.0.0
 */
@Documented
@Repeatable(Types.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Type {
  /**
   * Name of SQL type.
   */
  String value() default "";

  //  TODO. release-2.0.0
  //  /**
  //   * Mapping between SQL and Java types.
  //   */
  //  Class<? extends TypeMapper> mapper() default TypeMapper.class;

  /**
   * Container of {@link Type} annotations.
   *
   * @author Andrey_Yurzanov
   * @since 1.0.0
   */
  @Documented
  @Target(ElementType.FIELD)
  @Retention(RetentionPolicy.RUNTIME)
  @interface Types {
    /**
     * Set of {@link Type} annotations.
     */
    Type[] value();
  }
}
