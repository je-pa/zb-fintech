package com.zerobase.api.loan.review

class LoanReviewDto {
    data class LoanReviewResponseDto(
        val userKey: String,
        val loanResult: LoanResult
    )

    data class LoanResult(
        // 대출 한도
        val userLimitAmount: Long,
        // 대출 이자율
        val userLoanInterest: Double
    )

    data class LoanReview(
        val userKey: String,
        // 한도금액
        val userLimitAmount: Long,
        // 이자율
        val userLoanInterest: Double
    )
}