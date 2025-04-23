package com.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {

	public final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static Collection<String> filterLogByDateTimeRange (List<String> logRecords, String startTimeStr, String endTimeStr){
		LocalDateTime startTime = LocalDateTime.parse(startTimeStr,formatter);
		LocalDateTime endTime = LocalDateTime.parse(endTimeStr,formatter);
		
		return logRecords.stream().filter(record -> {
			String dateTimePart = record.substring(0,19);
			
			LocalDateTime logTime = LocalDateTime.parse(dateTimePart, formatter);
			return(logTime.equals(startTime) || logTime.isAfter(startTime))
					&& (logTime.equals(endTime) || logTime.isBefore(endTime));
		})
		.collect(Collectors.toList());
				
	}
}
