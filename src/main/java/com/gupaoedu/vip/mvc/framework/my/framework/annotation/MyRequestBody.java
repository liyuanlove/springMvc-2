package com.gupaoedu.vip.mvc.framework.my.framework.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestBody {
}
