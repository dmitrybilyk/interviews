package com.learn.spring.propertyeditors;

import java.beans.PropertyEditorSupport;

/**
 * Created by dik81 on 19.02.19.
 */
public class SomeClassPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SomeClassWithPropertyEditors value = new SomeClassWithPropertyEditors();
        value.setName(text);
        setValue(value);
    }
}
