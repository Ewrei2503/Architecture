package com.mycompany.architecture.config; 

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
    @MapperScan("path in your mapper directory")
public class DataConfig {
    
        @Bean
        public BasicDataSource dataSource(){
            BasicDataSource dataSource = new BasicDataSource();
                dataSource.setDriverClassName("com.mysql.jdbc.Driver");
                dataSource.setUrl("jdbc:mysql://localhost/test?useUnicode=true&characterCharacterEncoding=utf8");
                dataSource.setUsername("root");
                dataSource.setPassword("root");
                return dataSource;
        }
        
        
        @Bean 
        public DataSourceTransactionManager transactionManager() { 
            return new DataSourceTransactionManager(dataSource()); 
        } 

        
        @Bean 
        public SqlSessionFactoryBean sqlSessionFactory() throws Exception { 
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean(); 
            sessionFactory.setDataSource(dataSource()); 
            sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:**/persistence/*.xml")); 
            return sessionFactory; 
        }
    }    

