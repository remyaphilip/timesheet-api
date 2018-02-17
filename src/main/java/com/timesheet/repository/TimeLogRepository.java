package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.model.TimeLog;

public interface TimeLogRepository extends JpaRepository<TimeLog, Integer>{

}
