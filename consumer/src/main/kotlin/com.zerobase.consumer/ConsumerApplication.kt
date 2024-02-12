package com.zerobase.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

/**
 * 구동되는 메인함수가 필요함
 * 독립적으로 배포가 되어 메시지큐에 쌓일때마다 읽어서 보내줌
 */
@SpringBootApplication
@ComponentScan(basePackages = ["com.zerobase"])
@EntityScan(basePackages = ["com.zerobase.domain"])
class ConsumerApplication

fun main(args: Array<String>) {
    runApplication<ConsumerApplication>(*args)
}