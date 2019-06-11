package cn.hz.fcloud.controller;

import cn.hz.fcloud.dao.EqMapper;
import cn.hz.fcloud.dao.EquipmentDataAndNameMapper;
import cn.hz.fcloud.entity.Eq;
import cn.hz.fcloud.entity.EquipmentDataAndName;
import cn.hz.fcloud.service.EqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wechat")
public class WechatController {

    @Autowired
    private EqMapper eqMapper;
    @Autowired
    private EquipmentDataAndNameMapper equipmentDataAndNameMapper;

    @RequestMapping("/eq/list")
    public List<Eq> findAllEqs(){
        return eqMapper.findAllEqs();
    }

    @RequestMapping("/alarm/all")
    public List<EquipmentDataAndName> findAllAlarms(){
        return equipmentDataAndNameMapper.findAll();
    }
    @RequestMapping("/alarm/provider/{id}")
    public List<EquipmentDataAndName> findAlarmsByProvider(@PathVariable("id") int id){
        return null;
    }
}
