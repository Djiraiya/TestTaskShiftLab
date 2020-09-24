package org.example.shiftLabTestTask.Service;

import org.example.shiftLabTestTask.Model.HardDisk;

import java.util.List;

public interface HardDiskService {

    List<HardDisk> getAllHardDiskList();

    HardDisk getHardDiskById(int hardDiskId);

    HardDisk create(HardDisk hardDisk);

    HardDisk update(int hardDiskId, HardDisk hardDisk);

}
