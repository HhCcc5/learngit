package com.hchcc.miaoshaDemo.quartz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "quartz" )
public class AppConfig {
    private String schedulerInstanceName;
    private String schedulerInstanceId;
    private String schedulerSkipUpdateCheck;
    private String schedulerJobFactoryClass;
    private String jobStoreClass;
    private String jobStoreDriverDelegateClass;
    private String jobStoreDataSource;
    private String jobStoreTablePrefix;
    private String jobStoreIsClustered;
    private String threadPoolClass;
    private String threadPoolThreadCount;
    private String datasourceQuartzDataSourceConnectionProviderClass;
    @Value("${quartz.datasource.quartzDataSource.driver}")
    private String datasourceQuartzDataSourceDriver;
    private String datasourceQuartzDataSourceURL;
    private String datasourceQuartzDataSourceUser;
    private String datasourceQuartzDataSourcePassword;
    private String datasourceQuartzDataSourceMaxConnections;

    public String getSchedulerInstanceName() {
        return schedulerInstanceName;
    }

    public void setSchedulerInstanceName(String schedulerInstanceName) {
        this.schedulerInstanceName = schedulerInstanceName;
    }

    public String getSchedulerInstanceId() {
        return schedulerInstanceId;
    }

    public void setSchedulerInstanceId(String schedulerInstanceId) {
        this.schedulerInstanceId = schedulerInstanceId;
    }

    public String getSchedulerSkipUpdateCheck() {
        return schedulerSkipUpdateCheck;
    }

    public void setSchedulerSkipUpdateCheck(String schedulerSkipUpdateCheck) {
        this.schedulerSkipUpdateCheck = schedulerSkipUpdateCheck;
    }

    public String getSchedulerJobFactoryClass() {
        return schedulerJobFactoryClass;
    }

    public void setSchedulerJobFactoryClass(String schedulerJobFactoryClass) {
        this.schedulerJobFactoryClass = schedulerJobFactoryClass;
    }

    public String getJobStoreClass() {
        return jobStoreClass;
    }

    public void setJobStoreClass(String jobStoreClass) {
        this.jobStoreClass = jobStoreClass;
    }

    public String getJobStoreDriverDelegateClass() {
        return jobStoreDriverDelegateClass;
    }

    public void setJobStoreDriverDelegateClass(String jobStoreDriverDelegateClass) {
        this.jobStoreDriverDelegateClass = jobStoreDriverDelegateClass;
    }

    public String getJobStoreDataSource() {
        return jobStoreDataSource;
    }

    public void setJobStoreDataSource(String jobStoreDataSource) {
        this.jobStoreDataSource = jobStoreDataSource;
    }

    public String getJobStoreTablePrefix() {
        return jobStoreTablePrefix;
    }

    public void setJobStoreTablePrefix(String jobStoreTablePrefix) {
        this.jobStoreTablePrefix = jobStoreTablePrefix;
    }

    public String getJobStoreIsClustered() {
        return jobStoreIsClustered;
    }

    public void setJobStoreIsClustered(String jobStoreIsClustered) {
        this.jobStoreIsClustered = jobStoreIsClustered;
    }

    public String getThreadPoolClass() {
        return threadPoolClass;
    }

    public void setThreadPoolClass(String threadPoolClass) {
        this.threadPoolClass = threadPoolClass;
    }

    public String getThreadPoolThreadCount() {
        return threadPoolThreadCount;
    }

    public void setThreadPoolThreadCount(String threadPoolThreadCount) {
        this.threadPoolThreadCount = threadPoolThreadCount;
    }

    public String getDatasourceQuartzDataSourceConnectionProviderClass() {
        return datasourceQuartzDataSourceConnectionProviderClass;
    }

    public void setDatasourceQuartzDataSourceConnectionProviderClass(String datasourceQuartzDataSourceConnectionProviderClass) {
        this.datasourceQuartzDataSourceConnectionProviderClass = datasourceQuartzDataSourceConnectionProviderClass;
    }

    public String getDatasourceQuartzDataSourceDriver() {
        return datasourceQuartzDataSourceDriver;
    }

    public void setDatasourceQuartzDataSourceDriver(String datasourceQuartzDataSourceDriver) {
        this.datasourceQuartzDataSourceDriver = datasourceQuartzDataSourceDriver;
    }

    public String getDatasourceQuartzDataSourceURL() {
        return datasourceQuartzDataSourceURL;
    }

    public void setDatasourceQuartzDataSourceURL(String datasourceQuartzDataSourceURL) {
        this.datasourceQuartzDataSourceURL = datasourceQuartzDataSourceURL;
    }

    public String getDatasourceQuartzDataSourceUser() {
        return datasourceQuartzDataSourceUser;
    }

    public void setDatasourceQuartzDataSourceUser(String datasourceQuartzDataSourceUser) {
        this.datasourceQuartzDataSourceUser = datasourceQuartzDataSourceUser;
    }

    public String getDatasourceQuartzDataSourcePassword() {
        return datasourceQuartzDataSourcePassword;
    }

    public void setDatasourceQuartzDataSourcePassword(String datasourceQuartzDataSourcePassword) {
        this.datasourceQuartzDataSourcePassword = datasourceQuartzDataSourcePassword;
    }

    public String getDatasourceQuartzDataSourceMaxConnections() {
        return datasourceQuartzDataSourceMaxConnections;
    }

    public void setDatasourceQuartzDataSourceMaxConnections(String datasourceQuartzDataSourceMaxConnections) {
        this.datasourceQuartzDataSourceMaxConnections = datasourceQuartzDataSourceMaxConnections;
    }
}
