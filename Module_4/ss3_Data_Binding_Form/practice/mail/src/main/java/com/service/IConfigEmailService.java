package com.service;

import com.bean.ConfigEmail;
import org.springframework.stereotype.Service;

@Service
public interface IConfigEmailService {

    public ConfigEmail show();

    public ConfigEmail update(ConfigEmail configEmail);
}
