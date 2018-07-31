# spring boot starter

> spring boot+mybatis 
> a.打开idea, b.导入world.sql数据文件,修改数据库配置 c.运行
> 访问页面 http://localhost:8080/city/Bahia
> 访问json-api http://localhost:8080/city/id/1
> 访问swagger-api-ui http://localhost:8080/swagger-ui.html

1. 项目结构

.
├── README.md
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── DemoApplication.java
│   │   │               ├── api                                 # 后端api 控制器
│   │   │               │   ├── BaseController.java
│   │   │               │   └── CityController.java             # 测试控制器City,操作city表里的数据
│   │   │               ├── model                               # mybatis自动生成的代码，模型层
│   │   │               │   ├── dao
│   │   │               │   │   ├── CityMapper.java
│   │   │               │   │   ├── CountryMapper.java
│   │   │               │   │   └── CountrylanguageMapper.java
│   │   │               │   └── entity
│   │   │               │       ├── City.java
│   │   │               │       ├── CityExample.java
│   │   │               │       ├── Country.java
│   │   │               │       ├── CountryExample.java
│   │   │               │       ├── Countrylanguage.java
│   │   │               │       ├── CountrylanguageExample.java
│   │   │               │       └── CountrylanguageKey.java
│   │   │               ├── services                            # DAO层
│   │   │               │   ├── CityServices.java
│   │   │               │   └── impl
│   │   │               │       └── CityServicesImpl.java
│   │   │               └── utils                               # api-json工具
│   │   │               │    ├── JsonApiError.java
│   │   │               │    └── JsonApiResult.java
│   │   │               └── web                                 # 前端web控制器
│   │   │                   └── IndexController.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── mybatis                                        # mybatis配置
│   │       │   ├── generatorConfig.xml
│   │       │   ├── mapper
│   │       │   │   ├── CityMapper.xml
│   │       │   │   ├── CountryMapper.xml
│   │       │   │   └── CountrylanguageMapper.xml
│   │       │   └── mybatis-config.xml
│   │       ├── static                                         # 前端结构  
│   │       └── templates
│   │           └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── DemoApplicationTests.java
└── world.sql

2. 关于配置

- *重点关注* `src/main/application.properties` 

```$xslt
mybatis.mapper-locations=classpath*:mybatis/mapper/*Mapper.xml  # spring注入DAO的配置路径
mybatis.type-aliases-package=com.example.demo.model
mybatis.config-location=classpath:mybatis/mybatis-config.xml
```

- mybatis generator 配置文件 `src/main/resources/mybatis/generatorConfig.xml` 指定PO,DAO,TO的生成路径

```$xslt

<!-- !!!! Model Configurations !!!! -->
<javaModelGenerator targetPackage="com.example.demo.model.entity" targetProject="src/main/java">
    <property name="enableSubPackages" value="true" />
    <property name="trimStrings" value="true" />
</javaModelGenerator>

<!-- !!!! Mapper XML Configurations !!!! -->
<sqlMapGenerator targetPackage="mapper" targetProject="src/main/resources/mybatis">
    <property name="enableSubPackages" value="false" />
</sqlMapGenerator>

<!-- !!!! Mapper Interface Configurations !!!! -->
<javaClientGenerator targetPackage="com.example.demo.model.dao" targetProject="src/main/java" type="XMLMAPPER">
    <property name="enableSubPackages" value="false" />
</javaClientGenerator>
        
```

3. 相关链接 
    
    a. [maven](https://maven.apache.org/users/index.html)
    b. [spring-boot](https://spring.io/projects/spring-boot)
    c. [mybatis](http://www.mybatis.org/mybatis-3/zh/index.html)