package com.practice.ebay.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

class CustomExceptions(message: String) : Exception(message)

@ResponseStatus(HttpStatus.NOT_FOUND, reason = "Item might not be eligible for the shipping program")
class NotEligibleForShippingException(message: String) : Exception(message)