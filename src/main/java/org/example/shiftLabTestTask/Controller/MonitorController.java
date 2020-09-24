package org.example.shiftLabTestTask.Controller;

import org.example.shiftLabTestTask.Model.Monitor;
import org.example.shiftLabTestTask.Service.MonitorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @Autowired
    private MonitorServiceImpl monitorService;

    @GetMapping
    public ResponseEntity<List<Monitor>> getAll() {
        return ResponseEntity.ok().body(monitorService.getAllMonitorList());
    }

    @GetMapping("/{monitorId}")
    public ResponseEntity<Monitor> getById(@PathVariable int monitorId) {
        return ResponseEntity.ok().body(monitorService.getMonitorById(monitorId));
    }

    @PostMapping
    public ResponseEntity<Monitor> create(@RequestBody Monitor monitor) {
        return ResponseEntity.ok().body(monitorService.create(monitor));
    }

    @PatchMapping("/{monitorId}")
    public ResponseEntity<Monitor> update(@PathVariable int monitorId, @RequestBody Monitor monitor) {
        return ResponseEntity.ok().body(monitorService.update(monitorId, monitor));
    }

}
