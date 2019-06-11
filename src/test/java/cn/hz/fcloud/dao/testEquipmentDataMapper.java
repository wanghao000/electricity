package cn.hz.fcloud.dao;

import cn.hz.fcloud.BaseTest;
import cn.hz.fcloud.entity.Alarm;
import cn.hz.fcloud.entity.EquipmentData;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class testEquipmentDataMapper extends BaseTest {
    @Autowired
    private EquipmentDataMapper equipmentDataMapper;
    @Autowired
    private AlarmMapper alarmMapper;

    @Test
    public void testData(){
        List<Map<String,Object>> map=equipmentDataMapper.AlarmTrend();
        System.out.println(map);
    }

    @Test
    public void insertAlarm(){
        List<EquipmentData> list = equipmentDataMapper.findType(0);
        list.forEach(item->{
            Alarm alarm = new Alarm();
            alarm.setCode(item.getCode());
            alarm.setCreateTime(item.getCreateTime());
            alarm.setInfo(item.getInfo());
            alarm.setType(item.getType());
            alarmMapper.addRecord(alarm);
        });
    }
}
