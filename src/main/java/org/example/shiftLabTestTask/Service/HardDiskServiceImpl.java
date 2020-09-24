package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Exception.NotFoundException;
import org.example.shiftLabTestTask.Model.HardDisk;
import org.example.shiftLabTestTask.Repository.HardDiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HardDiskServiceImpl implements HardDiskService{

    @Autowired
    private HardDiskRepository hardDiskRepository;


    @Override
    public List<HardDisk> getAllHardDiskList() {
        return hardDiskRepository.findAll();
    }

    @Override
    public HardDisk getHardDiskById(int hardDiskId) {
        Optional<HardDisk> hardDiskOptional = hardDiskRepository.findById(hardDiskId);
        if (hardDiskOptional.isPresent()) {
            return hardDiskOptional.get();
        }
        else {
            throw new NotFoundException("Товар с заданным id не существует.");
        }
    }

    @Override
    public HardDisk create(HardDisk hardDisk) {
        return hardDiskRepository.save(hardDisk);
    }

    @Override
    public HardDisk update(int hardDiskId, HardDisk hardDisk) {
        Optional<HardDisk> beforeUpdate = hardDiskRepository.findById(hardDiskId);
        if (beforeUpdate.isPresent()) {
            hardDisk.setId(hardDiskId);
            return hardDiskRepository.save(hardDisk);
        }
        else {
            throw new NotFoundException("Товар, который вы хотите обновить не найден.");
        }
    }

}
