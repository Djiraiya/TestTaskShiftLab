package org.example.shiftLabTestTask.Controller;

import org.example.shiftLabTestTask.Model.HardDisk;
import org.example.shiftLabTestTask.Service.HardDiskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/harddisk")
public class HardDiskController {

    @Autowired
    private HardDiskServiceImpl hardDiskService;

    @GetMapping
    public ResponseEntity<List<HardDisk>> getAll() {
        return ResponseEntity.ok().body(hardDiskService.getAllHardDiskList());
    }

    @GetMapping("/{hardDiskId}")
    public ResponseEntity<HardDisk> getById(@PathVariable int hardDiskId) {
        return ResponseEntity.ok().body(hardDiskService.getHardDiskById(hardDiskId));
    }

    @PostMapping
    public ResponseEntity<HardDisk> create(@RequestBody HardDisk hardDisk) {
        return ResponseEntity.ok().body(hardDiskService.create(hardDisk));
    }

    @PatchMapping("/{hardDiskId}")
    public ResponseEntity<HardDisk> update(@PathVariable int hardDiskId, @RequestBody HardDisk hardDisk) {
        return ResponseEntity.ok().body(hardDiskService.update(hardDiskId, hardDisk));
    }

}
