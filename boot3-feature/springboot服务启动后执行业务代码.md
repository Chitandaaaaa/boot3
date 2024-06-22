# springboot 服务启动后执行业务代码

## 实现CommandLineRunner
`com.lixiameng.feature.init.afterrun.AfterRun.class`

## 实现ApplicationRunner
`com.lixiameng.feature.init.afterrun.AfterRun2.class`

## 调用顺序
- 使用 `@order(5)`注解
- 实现 `Ordered`,重写 `getOrder()` 方法。

数字越大，优先执行
