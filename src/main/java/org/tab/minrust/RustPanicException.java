package org.tab.minrust;

/**
 * Rust panic异常
 * 当Rust代码发生panic时抛出此异常
 */
public class RustPanicException extends RuntimeException {
    
    public RustPanicException(String message) {
        super(message);
    }
    
    public RustPanicException(String message, Throwable cause) {
        super(message, cause);
    }
}