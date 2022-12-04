package com.service.impl;

import com.bean.ConfigEmail;
import com.repository.IRepositoryConfigEmail;
import com.service.IConfigEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigEmailService implements IConfigEmailService {
    @Autowired
    IRepositoryConfigEmail configEmail;

    @Override
    public ConfigEmail show() {
        return configEmail.show();
    }

    @Override
    public ConfigEmail update(ConfigEmail configEmailUpdate) {
        return configEmail.update(configEmailUpdate);
    }
}
