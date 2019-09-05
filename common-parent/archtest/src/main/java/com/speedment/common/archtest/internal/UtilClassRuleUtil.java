/**
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.archtest.internal;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

final class UtilClassRuleUtil {

    private UtilClassRuleUtil() {}

    private static final String UTIL = "Util";
    private static final DescribedPredicate<JavaClass> NONISTANTIABLE_CLASS = JavaClass.Predicates.simpleNameStartingWith(UTIL);

    static void classIsFinal(JavaClasses classes) {
        ArchRuleDefinition.classes()
            .that().haveSimpleNameEndingWith(UTIL)
            .should().haveModifier(JavaModifier.FINAL)
            .check(classes);
    }

    static void classHasPrivateConstructor(JavaClasses classes) {
        ArchRuleDefinition.constructors()
            .that().areDeclaredInClassesThat().haveSimpleNameEndingWith(UTIL)
            .should().haveModifier(JavaModifier.PRIVATE)
            .check(classes);
    }

    static void methodIsStatic(JavaClasses classes) {
        ArchRuleDefinition.methods()
            .that().areDeclaredInClassesThat().haveSimpleNameEndingWith(UTIL)
            .should().haveModifier(JavaModifier.STATIC)
            .check(classes);
    }

}