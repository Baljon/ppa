package org.ilintar.study.question;

/**
 * Created by Anna on 20.12.2016.
 */
public class SimpleAnswer implements Answer {
    protected Object value;

    public SimpleAnswer(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
