package com.repository.impl;

import com.bean.ConfigEmail;
import com.repository.IRepositoryConfigEmail;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryConfigEmail implements IRepositoryConfigEmail {

    ConfigEmail configEmail = new ConfigEmail("Viet Nam", 5, true, "hello");

    @Override
    public ConfigEmail show() {
        return configEmail;
    }

    @Override
    public ConfigEmail update(ConfigEmail configEmailUpdate) {
        configEmail.setLanguage(configEmailUpdate.getLanguage());
        configEmail.setPageSize(configEmailUpdate.getPageSize());
        configEmail.setSpamFiler(configEmailUpdate.isSpamFiler());
        configEmail.setSignature(configEmailUpdate.getSignature());
        return configEmail;
    }
}
