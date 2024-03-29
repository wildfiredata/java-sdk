package cn.wildfiredata.analytics.exception;

/**
 * @author Sun Zeyu
 */
public class NeedRetryException extends RuntimeException {

    public NeedRetryException(String message) {
        super(message);
    }

    public NeedRetryException(String message, Throwable t) {
        super(message, t);
    }
}
