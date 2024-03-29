package com.zerobase.api.aop

import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch

@Aspect
@Component
class LogAspect {
    val logger = KotlinLogging.logger {  }

    @Pointcut("within(com.zerobase.api..*)") // 하위의 모듈 패키지 모두
    // 특정 시점에 가져옴 1. 어노테이션 방법 2.within: 패키지 or 메소드 호출 시점
    private fun isApi() {}

    @Around("isApi()")
    fun loggingAspect(joinPoint: ProceedingJoinPoint): Any {
        val stopWatch = StopWatch()
        stopWatch.start()

        val result = joinPoint.proceed()

        stopWatch.stop()

        logger.info { "${joinPoint.signature.name} ${joinPoint.args[0]} ${stopWatch.lastTaskTimeMillis}" }

        return result // 다음으로 넘어가기 위해 리턴
    }
}