package com.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Params: $
 * @return $
 * @Author: wangzhenyang
 * @Date $
 */
public class AfterLog implements AfterReturningAdvice {

    // returnValue 返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回结果为:" + returnValue);
    }
}
