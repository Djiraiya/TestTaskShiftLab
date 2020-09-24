package org.example.shiftLabTestTask.Controller;

import org.example.shiftLabTestTask.Model.Notebook;
import org.example.shiftLabTestTask.Service.NotebookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notebook")
public class NotebookController {

    @Autowired
    private NotebookServiceImpl notebookService;

    @GetMapping
    public ResponseEntity<List<Notebook>> getAll() {
        return ResponseEntity.ok().body(notebookService.getAllNotebookList());
    }

    @GetMapping("/{notebookId}")
    public ResponseEntity<Notebook> getById(@PathVariable int notebookId) {
        return ResponseEntity.ok().body(notebookService.getNotebookById(notebookId));
    }

    @PostMapping
    public ResponseEntity<Notebook> create(@RequestBody Notebook notebook) {
        return ResponseEntity.ok().body(notebookService.create(notebook));
    }

    @PatchMapping("/{notebookId}")
    public ResponseEntity<Notebook> update(@PathVariable int notebookId, @RequestBody Notebook notebook) {
        return ResponseEntity.ok().body(notebookService.update(notebookId, notebook));
    }
}
