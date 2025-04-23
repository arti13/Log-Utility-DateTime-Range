# 📘 Log-Utility-DateTime-Range

A simple Java 8 utility for filtering log records within a specified datetime range using the Java Streams API and `java.time` package. This project demonstrates clean modularization and reusability for log filtering tasks in Java applications.

---

## 📂 Project Structure

```
src/
├── com.data/
│   └── DateRangeResults.java      # Main class to run and test the utility
├── com.utility/
│   └── LogFilter.java             # Core logic for log filtering
```

---

## 🔧 Technologies Used

- **Java 8**
- **Java Streams API**
- **java.time.LocalDateTime**
- **Maven (optional)** or raw JDK usage
- **STS IDE** 

---

## 🚀 How It Works

### `LogFilter.java` (in `com.utility`)
- **Purpose**: Contains a reusable static method for filtering log entries based on a datetime range.
- **Method**:
  ```java
  public static Collection<String> filterLogByDateTimeRange(List<String> logRecords, String startTimeStr, String endTimeStr)
  ```
  - `logRecords`: A list of log strings (each beginning with a timestamp).
  - `startTimeStr` / `endTimeStr`: String representations of the datetime range in `yyyy-MM-dd HH:mm:ss` format.
  - Returns all log entries within the given time range (inclusive of boundaries).

### `DateRangeResults.java` (in `com.data`)
- **Purpose**: A sample usage class with a `main` method to demonstrate filtering.
- **What it does**:
  - Initializes sample log records.
  - Defines a start and end time.
  - Calls `LogFilter.filterLogByDateTimeRange()` and prints the filtered output.

---

## 🧪 Example Output

With this input:

```
2023-06-21 14:35:00 INFO Application started successfully
2023-06-21 14:40:00 DEBUG Loading configuration
2023-06-21 14:45:00 INFO Application shutdown
2023-06-21 14:50:00 ERROR Failed to load resource
```

And filter range:  
**Start**: `2023-06-21 14:35:00`  
**End**:   `2023-06-21 14:45:00`

The output will be:
```
2023-06-21 14:35:00 INFO Application started successfully
2023-06-21 14:40:00 DEBUG Loading configuration
2023-06-21 14:45:00 INFO Application shutdown
```

---

## ✅ How to Run

1. Clone or import the project into Eclipse.
2. Run `DateRangeResults.java` as a Java application.
3. Observe the filtered log entries printed in the console.

---

## 📈 Extending Further

- Add support for timezone-aware logs (use `ZonedDateTime`).
- Parse logs into a structured `LogRecord` object.
- Export filtered logs to file or database.
- Add unit tests using JUnit 5.
