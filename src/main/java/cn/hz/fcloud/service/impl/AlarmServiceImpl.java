package cn.hz.fcloud.service.impl;

import cn.hz.fcloud.dao.AlarmMapper;
import cn.hz.fcloud.entity.Alarm;
import cn.hz.fcloud.entity.EquipmentDataAndName;
import cn.hz.fcloud.service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName AlarmServiceImpl
 * @Description {TODO}
 * @Author wh
 * #Date 2019-06-10 15:05
 */
@Service
public class AlarmServiceImpl implements AlarmService {

    @Autowired
    private AlarmMapper alarmMapper;
    @Override
    public List<Alarm> findOne(String imei) {
        return alarmMapper.findAll();
    }

    @Override
    public void addRecord(Alarm alarm) {
        alarmMapper.addRecord(alarm);
    }

    @Override
    public List<Alarm> findType(int type) {
        return alarmMapper.findType(type);
    }

    @Override
    public int alarmCount() {
        return alarmMapper.alarmCount();
    }

    @Override
    public int alarmCountByCode(String code) {
        return alarmMapper.alarmCountByCode(code);
    }

    @Override
    public List<Alarm> AlarmListByCode(List<String> codes) {
        return alarmMapper.AlarmListByCode(codes);
    }

    @Override
    public List<Map<String, Object>> alarmTrend() {
        return alarmMapper.alarmTrend();
    }

    @Override
    public List<Map<String, Object>> alarmTable(List<Long> ids) {
        return alarmMapper.alarmTable(ids);
    }

    @Override
    public List<Map<String, Object>> lineChartMap(List<Long> ids) {
        return alarmMapper.lineChartMap(ids);
    }

    @Override
    public List<Map<String, Object>> findAlarmEquipmentAndCount() {
        return alarmMapper.findAlarmEquipmentAndCount();
    }

    @Override
    public List<Map<String, Object>> findAlarmEquipmentAndCountByUser(long userId) {
        return alarmMapper.findAlarmEquipmentAndCountByUser(userId);
    }

    @Override
    public List<Map<String, Object>> findCompanyAlarmCount() {
        return alarmMapper.findCompanyAlarmCount();
    }

    @Override
    public List<Map<String, Object>> findCompanyAlarmCountByUser(long userId) {
        return alarmMapper.findCompanyAlarmCountByUser(userId);
    }

    @Override
    public List<Map<String, Object>> find7dayAlarmCount() {
        return alarmMapper.find7dayAlarmCount();
    }

    @Override
    public List<Map<String, Object>> find7dayAlarmCountByUser(long userId) {
        return alarmMapper.find7dayAlarmCountByUser(userId);
    }

    @Override
    public List<Map<String, Object>> recent5Record() {
        return alarmMapper.recent5Record();
    }

    @Override
    public List<Map<String, Object>> recent5RecordByUser(long userId) {
        return alarmMapper.recent5RecordByUser(userId);
    }

    @Override
    public List<Map<String, Object>> findAreaAlarmCount() {
        return alarmMapper.findAreaAlarmCount();
    }

    @Override
    public List<Map<String, Object>> findAreaAlarmCountByUser(long userId) {
        return alarmMapper.findAreaAlarmCountByUser(userId);
    }

    @Override
    public List<Alarm> selectByCode(Map<String, Object> map) {
        return alarmMapper.selectByCode(map);
    }

    @Override
    public int selectByCodeCount(Map<String, Object> map) {
        return alarmMapper.selectByCodeCount(map);
    }

    @Override
    public List<Alarm> findAll() {
        return alarmMapper.findAll();
    }

    @Override
    public List<Alarm> findByComId(Long id) {
        return alarmMapper.findByComId(id);
    }
}
