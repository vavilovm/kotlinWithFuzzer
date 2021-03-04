/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package  org.jetbrains.kotlin.fir

import org.jetbrains.kotlin.fir.declarations.FirCallableDeclaration
import org.jetbrains.kotlin.fir.declarations.FirDeclarationDataKey
import org.jetbrains.kotlin.fir.declarations.FirDeclarationDataRegistry

private object IsFunctionTypeValueParameter : FirDeclarationDataKey()
var FirCallableDeclaration<*>.isFunctionTypeValueParameter: Boolean? by FirDeclarationDataRegistry.data(IsFunctionTypeValueParameter)