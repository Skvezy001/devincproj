package com.app.config.beans;

import com.app.dao.AdminDao;
import com.app.dao.daoImpl.AdminDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
    @Bean
    public AdminDao getAdminDao() {
        return new AdminDaoImpl();
    }
}
