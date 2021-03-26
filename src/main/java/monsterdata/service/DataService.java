package monsterdata.service;

import monsterdata.dao.DataDao;
import monsterdata.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataService {
    @Autowired
    DataDao dataDao;

    public void saveData() {
        Data data = new Data();
        data.setDate(new Date());
        dataDao.save(data);
    }

}
