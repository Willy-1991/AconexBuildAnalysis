package com.oracle.tech.challenge.repository;

import com.oracle.tech.challenge.entity.BuildRecord;

import java.util.ArrayList;
import java.util.List;

public class BuildRecordRepositoryListImpl implements BuildRecordRepository{

    private final List<BuildRecord> buildRecords;

    private BuildRecordRepositoryListImpl() {
        buildRecords = new ArrayList<>();
    }

    @Override
    public void save(BuildRecord buildRecord) {
        buildRecords.add(buildRecord);
    }

    @Override
    public  List<BuildRecord> getBuildRecords() {
        return buildRecords;
    }

    public static BuildRecordRepository getInstance() {
        return SingletonRepositoryHelper.INSTANCE;
    }

    private static class SingletonRepositoryHelper{
        private static final BuildRecordRepository INSTANCE = new BuildRecordRepositoryListImpl();
    }

}
