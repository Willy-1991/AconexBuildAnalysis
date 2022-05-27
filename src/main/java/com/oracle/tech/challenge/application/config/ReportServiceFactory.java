package com.oracle.tech.challenge.application.config;

import com.oracle.tech.challenge.application.report.NumberOfUniqueCustomerIdPerGeoZone;
import com.oracle.tech.challenge.application.report.NumberOfUniqueCustomerPerContractReport;
import com.oracle.tech.challenge.application.report.ReportService;

public class ReportServiceFactory {

    public static ReportService getConfiguredReportService() {
        ReportService reportService = new ReportService();
        reportService.add(new NumberOfUniqueCustomerIdPerGeoZone());
        reportService.add(new NumberOfUniqueCustomerPerContractReport());

        return reportService;
    }
}
