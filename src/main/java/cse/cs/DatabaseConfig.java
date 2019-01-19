package com.javatpoint;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;



@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
//@EnableJpaRepositories(entityManagerFactoryRef ="entityManagerFactory", excludeFilters = { @ComponentScan.Filter(type = FilterType.REGEX, pattern = {
//		"com.bcv.kagami.core.databinder.repository.*", "com.bcv.kagami.runtime.context.nosql.repository.*" }) })
//@EnableJpaAuditing
public class DatabaseConfig {

	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_MAX_FETCH_DEPTH = "hibernate.max_fetch_depth";
	private static final String PROPERTY_NAME_HIBERNATE_JDBC_FETCH_SIZE = "hibernate.jdbc.fetch_size";
	private static final String PROPERTY_NAME_HIBERNATE_JDBC_BATCH_SIZE = "hibernate.jdbc.batch_size";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
	private static final String[] ENTITYMANAGER_PACKAGES_TO_SCAN = { "com.javatpoint.model" };

	@Autowired
	private Environment env;

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	/*@Bean
	public DBSchemaExecutor dbSchemaExecutor() {
		DBSchemaExecutor executor = new DBSchemaExecutor();
		executor.setJdbcTemplate(jdbcTemplate());
		return executor;
	}*/

	/*@Bean
	@DependsOn("entityManagerFactory")
	public ApplicationStartupService applicationStartupService() {
		ApplicationStartupService executor = new ApplicationStartupSeviceImpl();
		return executor;
	}*/

	@Bean
	@ConfigurationProperties(prefix = "datasource.secondry")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		return dataSource;
	}

	

	//
	// @Bean
	// public JpaTransactionManager jpaTransactionManager() {
	// JpaTransactionManager transactionManager = new JpaTransactionManager();
	// transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
	// return transactionManager;
	// }
    @Bean(name = "mainTransactionManager")
    public PlatformTransactionManager transactionManager() {
          JpaTransactionManager tm = new JpaTransactionManager();
          tm.setEntityManagerFactory(entityManagerFactory().getObject());
          tm.setDataSource(dataSource());
          return tm;
    }
	private HibernateJpaVendorAdapter vendorAdaptor() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql(true);
		return vendorAdapter;
	}

	@Bean
	//@DependsOn("dbSchemaExecutor")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setPersistenceUnitName("main");
		entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
		entityManagerFactoryBean.setDataSource((DataSource) dataSource());
	//	entityManagerFactoryBean.setPersistenceProviderClass(net.bull.javamelody.JpaPersistence.class);
		entityManagerFactoryBean.setPersistenceProviderClass(org.hibernate.jpa.HibernatePersistenceProvider.class);
		entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
		entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
		return entityManagerFactoryBean;
	}
	

	private Properties jpaHibernateProperties() {

		Properties properties = new Properties();
	//	properties.put("net.bull.javamelody.jpa.provider", "org.hibernate.jpa.HibernatePersistenceProvider");
		properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
		properties.put(PROPERTY_NAME_HIBERNATE_MAX_FETCH_DEPTH,
				env.getProperty(PROPERTY_NAME_HIBERNATE_MAX_FETCH_DEPTH));
		properties.put(PROPERTY_NAME_HIBERNATE_JDBC_FETCH_SIZE,
				env.getProperty(PROPERTY_NAME_HIBERNATE_JDBC_FETCH_SIZE));
		properties.put(PROPERTY_NAME_HIBERNATE_JDBC_BATCH_SIZE,
				env.getProperty(PROPERTY_NAME_HIBERNATE_JDBC_BATCH_SIZE));
		properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
		properties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO, "update");
		properties.put("hibernate.format_sql",true);

		return properties;
	}



}
