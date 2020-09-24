package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Exception.NotFoundException;
import org.example.shiftLabTestTask.Model.Monitor;
import org.example.shiftLabTestTask.Repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    @Override
    public List<Monitor> getAllMonitorList() {
        return monitorRepository.findAll();
    }

    @Override
    public Monitor getMonitorById(int monitorId) {
        Optional<Monitor> monitorOptional = monitorRepository.findById(monitorId);
        if (monitorOptional.isPresent()) {
            return monitorOptional.get();
        }
        else {
            throw new NotFoundException("Товар с заданным id не существует.");
        }
    }

    @Override
    public Monitor create(Monitor monitor) {
        return monitorRepository.save(monitor);
    }

    @Override
    public Monitor update(int monitorId, Monitor monitor) {
        Optional<Monitor> beforeUpdate = monitorRepository.findById(monitorId);
        if (beforeUpdate.isPresent()) {
            monitor.setId(monitorId);
            return monitorRepository.save(monitor);
        }
        else {
            throw new NotFoundException("Товар, который вы хотите обновить не найден.");
        }
    }
}
