package com.oracle.tech.challenge.application.service;


import com.oracle.tech.challenge.application.config.BuildRecordFactory;
import com.oracle.tech.challenge.entity.BuildRecord;
import com.oracle.tech.challenge.repository.BuildRecordRepository;

import java.util.List;

public class BuildRecordCrudService {

    public void addValidBuildRecord(BuildRecord buildRecord) {
        BuildRecordRepository repository = BuildRecordFactory.getRepository();
        repository.save(buildRecord);
    }

    public List<BuildRecord> getBuildRecords() {
        return BuildRecordFactory.getRepository().getBuildRecords();
    }

}
