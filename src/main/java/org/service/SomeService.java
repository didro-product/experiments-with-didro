package org.service;

/**
 * Represents some service that may be used in business logic.
 */
public interface SomeService {

    /**
     * Returns an integer value. Does not need any arguments.
     */
    int getIntValue();

    /**
     * Returns an integer value and accepts one integer argument.
     */
    int getGreaterIntValue(int v);

    /**
     * Returns a string value. Does not need any arguments.
     */
    String getStringValue();

    /**
     * Returns a string value and accepts one string argument.
     */
    String getLongerStringValue(String arg2);

}
