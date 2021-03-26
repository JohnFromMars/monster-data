package monsterdata.controller;

import monsterdata.service.TrxIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TrxIdController {
    @Autowired
    TrxIdService trxIdService;

    @GetMapping("/save-tid")
    public void saveTid() {
        trxIdService.save(UUID.randomUUID().toString());
    }
}
