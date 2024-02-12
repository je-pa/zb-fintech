package com.zerobase.kafka.dto

/**
 * loanRequestMain에 필요한 값들 repository에 직접 접근해서 find 하지않고 kafka에 넣어준다.
 */
data class LoanRequestDto(
    val userKey: String,
    val userName: String,
    val userIncomeAmount: Long,
    var userRegistrationNumber: String
)
