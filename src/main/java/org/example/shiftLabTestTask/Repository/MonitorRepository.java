package org.example.shiftLabTestTask.Repository;

import org.example.shiftLabTestTask.Model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor, Integer> {
}
