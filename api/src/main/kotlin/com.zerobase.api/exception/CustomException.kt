package com.zerobase.api.exception

import java.lang.RuntimeException
// 특정 Exception
class CustomException(val customErrorCode: CustomErrorCode) : RuntimeException()