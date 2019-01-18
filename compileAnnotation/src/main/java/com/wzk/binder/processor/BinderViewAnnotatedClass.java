package com.wzk.binder.processor;

import javax.lang.model.element.TypeElement;

/**
 * Created by 政魁 on 2019/1/18 11:35
 * E-Mail Address：wangzhengkui@yingzi.com
 */
public class BinderViewAnnotatedClass {
    private TypeElement annotatedClassElement;

    public BinderViewAnnotatedClass(TypeElement classElement) throws IllegalArgumentException {
        this.annotatedClassElement = classElement;
        BinderView annotation = classElement.getAnnotation(BinderView.class);
    }



}
