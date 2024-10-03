package com.example.student.service;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckServiceImpl implements HealthCheckService {

    @Override
    public String checkHealth() {
        return "tout va bien";
    }
}
