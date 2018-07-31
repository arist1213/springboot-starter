# spring boot starter

> spring boot+mybatis

## 开箱 
- 打开idea
- 导入world.sql数据文件
- 修改数据库配置 
- 运行

## 访问接口
- 访问页面 http://localhost:8080/city/Bahia
- 访问json-api http://localhost:8080/city/id/1
- 访问swagger-api-ui http://localhost:8080/swagger-ui.html

## 配置

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

##相关链接 

[spring-boot](https://spring.io/projects/spring-boot)
[maven](https://maven.apache.org/users/index.html)
[mybatis](http://www.mybatis.org/mybatis-3/zh/index.html)

### 后续改进
把项目打包成一个 [archetype](https://maven.apache.org/guides/mini/guide-creating-archetypes.html)安装到本地（或者推送到maven社区），每次开始新项目，重新使用这个模板生成一个。