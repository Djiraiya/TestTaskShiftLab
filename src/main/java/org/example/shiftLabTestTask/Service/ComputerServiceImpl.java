package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Exception.NotFoundException;
import org.example.shiftLabTestTask.Model.Computer;
import org.example.shiftLabTestTask.Repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;


    @Override
    public List<Computer> getAllComputerList() {
        return computerRepository.findAll();
    }

    @Override
    public Computer getComputerById(int computerId) {
        Optional<Computer> computerOptional = computerRepository.findById(computerId);
        if (computerOptional.isPresent()) {
            return computerOptional.get();
        }
        else {
            throw new NotFoundException("Товар с заданным id не существует.");
        }
    }

    @Override
    public Computer create(Computer computer) {
        return computerRepository.save(computer);
    }

    @Override
    public Computer update(int computerId, Computer computer) {
        Optional<Computer> beforeUpdate = computerRepository.findById(computerId);
        if (beforeUpdate.isPresent()) {
            computer.setId(computerId);
            return computerRepository.save(computer);
        }
        else {
            throw new NotFoundException("Товар, который вы хотите обновить не найден.");
        }
    }
}
