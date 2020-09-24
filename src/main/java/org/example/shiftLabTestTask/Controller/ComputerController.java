package org.example.shiftLabTestTask.Controller;


import org.example.shiftLabTestTask.Model.Computer;
import org.example.shiftLabTestTask.Service.ComputerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerController {

    @Autowired
    private ComputerServiceImpl computerService;

    @GetMapping
    public ResponseEntity<List<Computer>> getAll() {
        return ResponseEntity.ok().body(computerService.getAllComputerList());
    }

    @GetMapping("/{computerId}")
    public ResponseEntity<Computer> getById(@PathVariable int computerId) {
        return ResponseEntity.ok().body(computerService.getComputerById(computerId));
    }

    @PostMapping
    public ResponseEntity<Computer> create(@RequestBody Computer computer) {
        return ResponseEntity.ok().body(computerService.create(computer));
    }

    @PatchMapping("/{computerId}")
    public ResponseEntity<Computer> update(@PathVariable int computerId, @RequestBody Computer computer) {
        return ResponseEntity.ok().body(computerService.update(computerId, computer));
    }

}
