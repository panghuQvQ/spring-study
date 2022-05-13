package com.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Params: $
 * @return $
 * @Author: wangzhenyang
 * @Date $
 */
public class Log implements MethodBeforeAdvice {

    /**
     * method: 要执行的目标对象的方法
     * object：参数
     * target：目标对象
     */

    @Override
    public void before(Method method, Object[] orgs, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
