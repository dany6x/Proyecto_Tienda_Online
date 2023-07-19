package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Integer>  {

}
