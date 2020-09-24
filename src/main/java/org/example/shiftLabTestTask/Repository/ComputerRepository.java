package org.example.shiftLabTestTask.Repository;

import org.example.shiftLabTestTask.Model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository <Computer, Integer> {
}
