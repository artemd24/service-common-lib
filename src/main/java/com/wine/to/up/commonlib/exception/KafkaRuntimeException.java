package com.wine.to.up.commonlib.exception;

public class KafkaRuntimeException extends FormattedRuntimeException {
    public KafkaRuntimeException(String messagePattern, Object... params) {
        super(messagePattern, params);
    }

    public KafkaRuntimeException(String messagePattern, Throwable cause, Object... params) {
        super(messagePattern, cause, params);
    }
}
