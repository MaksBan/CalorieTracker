package com.plcoding.core.domain.useCase

class FilterOutDigits {
    operator fun invoke(text: String): String {
        return text.filter { it.isDigit() }
    }
}