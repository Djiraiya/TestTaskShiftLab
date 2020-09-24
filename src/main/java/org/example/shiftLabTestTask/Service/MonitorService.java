package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Model.Monitor;

import java.util.List;

public interface MonitorService {

    List<Monitor> getAllMonitorList();

    Monitor getMonitorById(int monitorId);

    Monitor create(Monitor monitor);

    Monitor update(int monitorId, Monitor monitor);

}
