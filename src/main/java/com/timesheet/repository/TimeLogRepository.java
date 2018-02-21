package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.model.Timelog;

public interface TimeLogRepository extends JpaRepository<Timelog, Integer>{

}
