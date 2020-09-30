package com.tsign.demo.generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * mybatis plus代码生成器
 *
 * @author fei lv
 * @version 1.0
 * @since 2020/9/18 3:00 下午
 */
@Slf4j
public class MpCodeGenerator {

    public static void main(String[] args) {
        //代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //获取当前项目的路径
        String projectPath = System.getProperty("user.dir") + "/service/src/main/";
        String generatePath = projectPath  + "java/";
        log.info(generatePath);
        globalConfig.setOutputDir(generatePath);
        globalConfig.setAuthor("lvfei");
        globalConfig.setOpen(false);
        globalConfig.setActiveRecord(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(false);
        autoGenerator.setGlobalConfig(globalConfig);

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/sql_test?characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("lv1031");
        autoGenerator.setDataSource(dataSourceConfig);

        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName("umps");
        packageConfig.setParent(MpCodeGenerator.class.getPackage().getName());
        autoGenerator.setPackageInfo(packageConfig);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/resources/mapper/" + packageConfig.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        autoGenerator.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        //templateConfig.setEntity("templates/entity2.java");
//		 templateConfig.setService();
        // templateConfig.setController();
        templateConfig.setXml(null);
        autoGenerator.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setLogicDeleteFieldName("del_flag");
        //strategy.setInclude("version_app");
        //strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(packageConfig.getModuleName() + "_");
        autoGenerator.setStrategy(strategy);
        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        autoGenerator.execute();

    }
}
