package com.project.bootsantander.exceptions;

import com.project.bootsantander.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(MessageUtils.STOCK_NOT_FOUND);
    }
}
