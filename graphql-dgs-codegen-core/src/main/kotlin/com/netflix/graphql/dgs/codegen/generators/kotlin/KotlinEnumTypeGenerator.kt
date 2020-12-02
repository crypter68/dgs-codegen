/*
 *
 *  Copyright 2020 Netflix, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.netflix.graphql.dgs.codegen.generators.kotlin

import com.netflix.graphql.dgs.codegen.CodeGenConfig
import com.netflix.graphql.dgs.codegen.KotlinCodeGenResult
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import graphql.language.EnumTypeDefinition

class KotlinEnumTypeGenerator(private val config: CodeGenConfig) {
    fun generate(definition: EnumTypeDefinition): KotlinCodeGenResult {
        val kotlinType = TypeSpec.classBuilder(definition.name).addModifiers(KModifier.ENUM)

        definition.enumValueDefinitions.forEach {
            kotlinType.addEnumConstant(it.name)
        }

        val typeSpec = kotlinType.build()
        val fileSpec = FileSpec.builder(getPackageName(), typeSpec.name!!).addType(typeSpec).build()
        return KotlinCodeGenResult(enumTypes = listOf(fileSpec))
    }

    fun getPackageName(): String {
        return config.packageName + ".types"
    }
}