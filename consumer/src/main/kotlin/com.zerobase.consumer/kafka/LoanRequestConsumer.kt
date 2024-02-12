package com.zerobase.consumer.kafka

import com.fasterxml.jackson.databind.ObjectMapper
import com.zerobase.consumer.service.LoanRequestService
import com.zerobase.kafka.dto.LoanRequestDto
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class LoanRequestConsumer(
    private val objectMapper: ObjectMapper,
    private val loanRequestService: LoanRequestService
        // cb사 호출 로직
) {
    // 해당 토픽에 groupId 밑에있는 애들을 찾아서 읽어온다.
    @KafkaListener(topics = ["loan_request"], groupId = "fintech")
    fun loanRequestTopicConsumer(message: String) {
        val loanRequestKafkaDto = objectMapper.readValue(message, LoanRequestDto::class.java)

        loanRequestService.loanRequest(loanRequestKafkaDto)
    }
}