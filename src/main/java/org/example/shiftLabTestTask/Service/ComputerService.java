package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Model.Computer;

import java.util.List;

public interface ComputerService {

    List<Computer> getAllComputerList();

    Computer getComputerById(int computerId);

    Computer create(Computer computer);

    Computer update(int computerId, Computer computer);
}
