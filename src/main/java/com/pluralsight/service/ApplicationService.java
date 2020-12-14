package com.pluralsight.service;

import java.util.List;

import com.pluralsight.entity.Application;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


