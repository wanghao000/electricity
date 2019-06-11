package cn.hz.fcloud.dao;

import cn.hz.fcloud.entity.Alarm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName AlarmMapper
 * @Description {TODO}
 * @Author wh
 * #Date 2019-06-10 13:58
 */
public interface AlarmMapper {
    /**
     * 通过imei查找设备
     */
    List<Alarm> findOne(String imei);
    /**
     * 添加设备记录
     */
    void addRecord(Alarm Alarm);
    List<Alarm> findType(int type);

    /**
     * 获取今日设备全部告警数量
     * @return
     */
    int alarmCount();

    int alarmCountByCode(String code);

    List<Alarm> AlarmListByCode(List<String> codes);

    List<Map<String,Object>> alarmTrend();

    List<Map<String,Object>> alarmTable(@Param("ids") List<Long> ids);

    List<Map<String,Object>> lineChartMap(List<Long> ids);
    /**
     * 报警设备及次数
     */
    List<Map<String, Object>> findAlarmEquipmentAndCount();
    /**
     * 根据用户查找报警设备及次数
     */
    List<Map<String, Object>> findAlarmEquipmentAndCountByUser(long userId);
    /**
     * 公司其下设备报警数
     */
    List<Map<String, Object>> findCompanyAlarmCount();
    /**
     * 根据用户公司其下设备报警数
     */
    List<Map<String, Object>> findCompanyAlarmCountByUser(long userId);
    /**
     * 最近7天报警数
     */
    List<Map<String, Object>> find7dayAlarmCount();
    /**
     * 根据用户查询最近7天报警数
     */
    List<Map<String, Object>> find7dayAlarmCountByUser(long userId);
    /**
     * 最近5调报警
     */
    List<Map<String, Object>> recent5Record();
    /**
     * 根据用户查询最近5调报警
     */
    List<Map<String, Object>> recent5RecordByUser(long userId);
    /**
     * 地区报警数
     */
    List<Map<String, Object>> findAreaAlarmCount();
    /**
     * 按角色查询其下地区报警数
     */
    List<Map<String, Object>> findAreaAlarmCountByUser(long userId);

    /**
     * 根据code查询设备数据
     */
    List<Alarm> selectByCode(Map<String,Object> map);

    /**
     * 统计设备数据
     */
    int selectByCodeCount(Map<String,Object> map);

    /**
     * 获取当天所有告警数据
     * @return 告警数据列表
     */
    List<Alarm> findAll();

    /**
     * 根据公司id获取告警数据
     * @param id 公司id
     * @return 告警数据列表
     */
    List<Alarm> findByComId(Long id);
}
