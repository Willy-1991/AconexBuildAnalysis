package com.oracle.tech.challenge.application.report;

import com.oracle.tech.challenge.entity.BuildRecord;

import java.util.ArrayList;
import java.util.List;

public class ReportService {

    List<Report> reportServices = new ArrayList<>();

    public void add(Report reportService){
        reportServices.add(reportService);
    }


    public void runReports(List<BuildRecord> buildRecords){
        for(Report service: reportServices){
            service.run(buildRecords);
        }
    }

}
