package com.tea.common.exception;

public class EntityNotFoundException extends RuntimeException {
    public <Id> EntityNotFoundException(Id id) {
        super("Cant find entity by id[" + id + "]!");
    }
}
