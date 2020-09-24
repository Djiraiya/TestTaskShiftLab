package org.example.shiftLabTestTask.Repository;

import org.example.shiftLabTestTask.Model.HardDisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepository extends JpaRepository<HardDisk, Integer> {
}
