package com.data;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.utility.LogFilter;

public class DateRangeResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> logRecords = Arrays.asList(
		           "2023-06-21 14:35:00 INFO Application started successfully",
		           "2023-06-21 14:40:00 DEBUG Loading configuration",
		           "2023-06-21 14:45:00 INFO Application shutdown",
		           "2023-06-21 14:50:00 ERROR Failed to load resource"
		       );
		
		String startTimeStr = "2023-06-21 14:35:00";
		String endTimeStr = "2023-06-21 14:45:00";

		Collection<String> result = LogFilter.filterLogByDateTimeRange(logRecords, startTimeStr, endTimeStr);
		result.forEach(System.out::println);
	}

}
