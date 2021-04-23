package com.loneoaktech.apps.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class SamplePrimitives(
    val boolean: Boolean,
    val int: Int,
    val long: Long,
    val string: String,
    val float: Float,
    val double: Double
)
