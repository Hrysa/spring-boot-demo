package com.eevoe.demo1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Res<T> {
    private int code = 200;
    private T mData;
    private String hint;

    public Res(T t) {
        mData = t;
    }
}
