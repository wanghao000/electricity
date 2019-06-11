package cn.hz.fcloud.dao;

import cn.hz.fcloud.BaseTest;
import cn.hz.fcloud.entity.Equipment;
import cn.hz.fcloud.entity.EquipmentData;
import cn.hz.fcloud.entity.SysUser;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class testEquipmentMapper extends BaseTest {
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private EquipmentDataMapper equipmentDataMapper;

    @Test
    public void addEq(){
        List<Equipment> eqs = equipmentMapper.findAll();
        for(int i=0;i<50;i++){
//            Equipment eq = new Equipment();
//            eq.setType(0);
//            eq.setisDelete(1);
//            eq.setIsOnline(1);
//            eq.setCreateTime(new Date());
//            List<Integer> list = Arrays.asList(6,10,11,12,13,14,15,16,17);
//            Random random = new Random(i*3+i);
//            eq.setCompanyId(list.get(random.nextInt(9)));
//            eq.setName("测试烟感"+i);
//            eq.setCode("12345"+i);
//            equipmentMapper.addEquipment(eq);
            EquipmentData equipmentData = new EquipmentData();
            Random random = new Random(i*3+i);
            equipmentData.setCode(eqs.get(random.nextInt(56)).getCode());
            equipmentData.setType(0);
            equipmentData.setCreateTime(new Date());
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("msg","测试告警");
            jsonObject.put("datetime","190201150130");
            jsonObject.put("code","1111");
            equipmentData.setInfo(jsonObject.toString());
            equipmentDataMapper.addRecord(equipmentData);
         }
    }
}
