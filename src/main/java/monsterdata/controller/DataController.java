package monsterdata.controller;

import monsterdata.model.Data;
import monsterdata.service.DataService;
import monsterdata.service.TrxIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    DataService dataService;
    @Autowired
    TrxIdService trxIdService;

    @GetMapping("/save-data")
    @ResponseStatus(HttpStatus.OK)
    public void saveData() {
         dataService.saveData();
    }


    @GetMapping("/find-data")
    @ResponseStatus(HttpStatus.OK)
    public Data findData() {
        return null;
    }
}
