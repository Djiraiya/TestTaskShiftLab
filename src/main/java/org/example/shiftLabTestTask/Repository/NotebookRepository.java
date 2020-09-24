package org.example.shiftLabTestTask.Repository;

import org.example.shiftLabTestTask.Model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer> {
}
