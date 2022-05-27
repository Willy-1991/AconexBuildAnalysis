package com.oracle.tech.challenge.repository;

import com.oracle.tech.challenge.entity.BuildRecord;

import java.util.List;

public interface BuildRecordRepository {

    void save(BuildRecord buildRecord);

    List<BuildRecord> getBuildRecords();
}
