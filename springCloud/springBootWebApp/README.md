# Spring Boot Web App Demo

[TOC]

## 创建项目
基于[SPRING INITIALIZR](http://start.spring.io/)创建基项目基本框架。
- 基于Maven的Java项目。
- 添加web依赖。

## 编写Rest controller
通过`@RestController`注解编写REST serivce API [RestServiceController](src/main/java/com/spring/boot/web/app/controller/RestServiceController.java)

## 编写对应REST service API的集成测试用例
通过`MockMvc`编写单元测试用例[SpringBootWebAppApplicationTests](src/test/java/com/spring/boot/web/app/SpringBootWebAppApplicationTests.java)：
- `setup()`中初始化`MockMvc`
- 通过`perform()`模拟调用controller接口请求
- 通过`accept()`指定接收的数据数据类型
- 通过`andExpect()`判断接口返回期望值

使用如下的静态引用函数判断HTTP和ASSERT状态：
```
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
```

## 添加SWAGGER2支持
- 在POM中添加如下依赖：
```
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.7.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.7.0</version>
		</dependency>
```
- 在application.java同级包中新建类[Swagger2](http://)
  其中：
	-  `RequestHandlerSelectors.basePackage("com.spring.boot.web.app.controller")`指定生成Swagger文档的包路径 
	-  
- 