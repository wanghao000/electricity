package cn.hz.fcloud.dao;

import cn.hz.fcloud.entity.SysChina;

import java.util.List;

public interface SysChinaMapper {

    /**
     * 省市县根据父类id的获取对应子类信息
     * @param parentid
     * @return
     */
    List<SysChina> selectByParentid(int parentid);

    /**
     * 管理员账号获取所有已接入公司的省份信息
     * @return
     */
    List<SysChina> findProvinces();

    /**
     * 根据服务商id获取对应已接入公司的省份
     * @param id
     * @return
     */
    List<SysChina> findProvincesByProvider(Long id);
}
