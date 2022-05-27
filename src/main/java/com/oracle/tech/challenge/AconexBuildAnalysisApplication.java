package com.oracle.tech.challenge;

import com.oracle.tech.challenge.application.config.BuildRecordFactory;
import com.oracle.tech.challenge.application.config.ReportServiceFactory;
import com.oracle.tech.challenge.application.service.BuildRecordMapper;
import com.oracle.tech.challenge.application.service.ValidationService;
import com.oracle.tech.challenge.repository.BuildRecordRepository;
import com.oracle.tech.challenge.utils.SystemUtils;

import java.util.List;
import java.util.Objects;

public class AconexBuildAnalysisApplication {
    public static void main(String[] args) {

        List<String> buildRecords = SystemUtils.readBuildRecords();

        BuildRecordRepository repository = BuildRecordFactory.getRepository();
        ValidationService validationService = new ValidationService();

        buildRecords.stream()
                .map(s -> BuildRecordMapper.mapToBuildRecord(s.split(",")))
                .filter(Objects::nonNull)
                .filter(validationService::validateBuildRecord)
                .forEach(repository::save);

        ReportServiceFactory.getConfiguredReportService()
                .runReports(repository.getBuildRecords());

    }
}
