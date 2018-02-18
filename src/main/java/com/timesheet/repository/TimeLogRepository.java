package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.domain.Timelog;

public interface TimeLogRepository extends JpaRepository<Timelog, Integer>{

}
