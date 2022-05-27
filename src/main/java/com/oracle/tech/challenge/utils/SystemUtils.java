package com.oracle.tech.challenge.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemUtils {

    public static List<String> readBuildRecords() {
        System.out.println("Please input build data \n * Each record separated by new line, \n * blank line to end : ");

        List<String> buildRecordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String buildRecord = scanner.nextLine();
            if(buildRecord.isEmpty()){
                break;
            }
            buildRecordList.add(buildRecord);
        }
        scanner.close();

        return buildRecordList;
    }
}
