/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.ir.expressions.persistent

import org.jetbrains.kotlin.ir.declarations.IrFactory
import org.jetbrains.kotlin.ir.declarations.persistent.PersistentIrBodyBase
import org.jetbrains.kotlin.ir.declarations.persistent.PersistentIrFactory
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody

internal class PersistentIrExpressionBody private constructor(
    startOffset: Int,
    endOffset: Int,
    private var expressionField: IrExpression? = null,
    initializer: (IrExpressionBody.() -> Unit)? = null
) :
    PersistentIrBodyBase<PersistentIrExpressionBody>(startOffset, endOffset, initializer),
    IrExpressionBody {

    constructor(expression: IrExpression) : this(expression.startOffset, expression.endOffset, expression, null)

    constructor(startOffset: Int, endOffset: Int, expression: IrExpression) : this(startOffset, endOffset, expression, null)

    constructor(startOffset: Int, endOffset: Int, initializer: IrExpressionBody.() -> Unit) :
            this(startOffset, endOffset, null, initializer)

    override var expression: IrExpression
        get() = checkEnabled { expressionField!! }
        set(e) {
            checkEnabled { expressionField = e }
        }

    override val factory: IrFactory
        get() = PersistentIrFactory
}
