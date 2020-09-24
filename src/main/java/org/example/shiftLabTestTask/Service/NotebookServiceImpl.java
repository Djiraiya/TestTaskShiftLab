package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Exception.NotFoundException;
import org.example.shiftLabTestTask.Model.Notebook;
import org.example.shiftLabTestTask.Repository.NotebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotebookServiceImpl implements NotebookService {

    @Autowired
    private NotebookRepository notebookRepository;

    @Override
    public List<Notebook> getAllNotebookList() {
        return notebookRepository.findAll();
    }

    @Override
    public Notebook getNotebookById(int notebookId) {
        Optional<Notebook> notebookOptional = notebookRepository.findById(notebookId);
        if (notebookOptional.isPresent()) {
            return notebookOptional.get();
        }
        else {
            throw new NotFoundException("Товар с заданным id не существует.");
        }
    }

    @Override
    public Notebook create(Notebook notebook) {
        return notebookRepository.save(notebook);
    }

    @Override
    public Notebook update(int notebookId, Notebook notebook) {
        Optional<Notebook> beforeUpdate = notebookRepository.findById(notebookId);
        if (beforeUpdate.isPresent()) {
            notebook.setId(notebookId);
            return notebookRepository.save(notebook);
        }
        else {
            throw new NotFoundException("Товар, который вы хотите обновить не найден.");
        }
    }
}
