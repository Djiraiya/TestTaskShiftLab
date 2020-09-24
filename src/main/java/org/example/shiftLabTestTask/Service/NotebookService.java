package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Model.Notebook;

import java.util.List;

public interface NotebookService {

    List<Notebook> getAllNotebookList();

    Notebook getNotebookById(int notebookId);

    Notebook create(Notebook notebook);

    Notebook update(int notebookId, Notebook notebook);

}
