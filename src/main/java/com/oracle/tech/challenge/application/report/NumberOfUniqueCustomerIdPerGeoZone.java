package com.oracle.tech.challenge.application.report;

import com.oracle.tech.challenge.entity.BuildRecord;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfUniqueCustomerIdPerGeoZone implements Report {

    @Override
    public void run(List<BuildRecord> buildRecords) {
        System.out.println("_________________________________________ ");
        System.out.println("Number Of Unique Customers Per GeoZone Report ");

        buildRecords
                .stream()
                .collect(Collectors.groupingBy(BuildRecord::getGeoZone, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + ":" + v));
    }
}
