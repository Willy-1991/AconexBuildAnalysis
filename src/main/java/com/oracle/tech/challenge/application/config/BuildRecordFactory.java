package com.oracle.tech.challenge.application.config;

import com.oracle.tech.challenge.repository.BuildRecordRepository;
import com.oracle.tech.challenge.repository.BuildRecordRepositoryListImpl;

public class BuildRecordFactory {

    public static BuildRecordRepository getRepository() {
        return BuildRecordRepositoryListImpl.getInstance();
    }

}
