package com.moon.config.db;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
@PropertySource("classpath:druid-config.properties")
public class DruidDataSourceAttrs {

	@Value("${spring.datasource.initial-size}")
	private int initialSize;

	@Value("${spring.datasource.min-idle}")
	private int minIdle;

	@Value("${spring.datasource.max-active}")
	private int maxActive;

	@Value("${spring.datasource.max-wait}")
	private int maxWait;

	@Value("${spring.datasource.time-between-connect-error-millis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${spring.datasource.min-evictable-idle-time-millis}")
	private int minEvictableIdleTimeMillis;

	@Value("${spring.datasource.validation-query}")
	private String validationQuery;

	@Value("${spring.datasource.test-while-idle}")
	private boolean testWhileIdle;

	@Value("${spring.datasource.test-on-borrow}")
	private boolean testOnBorrow;

	@Value("${spring.datasource.test-on-return}")
	private boolean testOnReturn;

	@Value("${spring.datasource.pool-prepared-statements}")
	private boolean poolPreparedStatements;

	@Value("${spring.datasource.max-pool-prepared-statement-per-connection-size}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${spring.datasource.proxy-filters}")
	private String filters;

	@Value("${spring.datasource.tomcat.connection-properties}")
	private String connectionProperties;

	public void setOtherDataSourceAttr(DruidDataSource dataSource) {
		//具体配置
		dataSource.setInitialSize(initialSize);
		dataSource.setMinIdle(minIdle);
		dataSource.setMaxActive(maxActive);
		dataSource.setMaxWait(maxWait);
		dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		dataSource.setValidationQuery(validationQuery);
		dataSource.setTestWhileIdle(testWhileIdle);
		dataSource.setTestOnBorrow(testOnBorrow);
		dataSource.setTestOnReturn(testOnReturn);
		dataSource.setPoolPreparedStatements(poolPreparedStatements);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
		try {
			dataSource.setFilters(filters);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dataSource.setConnectionProperties(connectionProperties);
	}
}
