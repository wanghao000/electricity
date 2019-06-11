package cn.hz.fcloud.dao;

import cn.hz.fcloud.entity.Company;
import cn.hz.fcloud.entity.Provider;
import cn.hz.fcloud.entity.SysChina;
import cn.hz.fcloud.entity.SysUser;
import cn.hz.fcloud.utils.ShiroUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-jdbc.xml"})
public class TestSysChinaMapper {

    @Autowired
    private SysChinaMapper chinaMapper;
    @Autowired
    private EquipmentMapper eqMapper;
    @Autowired
    private CompanyMapper comMapper;
    @Autowired
    private EqInfosMapper eqInfosMapper;
    @Autowired
    private ProviderMapper providerMapper;
    @Test
    public void sysChinaTest(){
        List<SysChina> list = chinaMapper.findProvinces();
        list.forEach(item->{
            System.out.println(item.toString());
        });
        List<SysChina> sysChinaList = chinaMapper.findProvincesByProvider(new Long(1));
        sysChinaList.forEach(item->{
            System.out.println(item.toString());
        });
    }
    @Test
    public void equipmentTest(){
//        List<Equipment> eqs = eqMapper.findAll();
//        for(Equipment eq:eqs){
//            System.out.println(eq);
//        }
        eqMapper.modifyState("0074577",1);
    }

    @Test
    public void companyTest(){
       List<Company> list = comMapper.findConpanyByProvince(370000+"",new Long(0));
       list.forEach(item->{
           System.out.println(item.toString());
       });
    }

    @Test
    public void eqInfosTest(){
//        EqInfos infos = eqInfosMapper.findOne("8123456");
//        System.out.println(infos);
//        List<EqInfos> list = eqInfosMapper.findByComId(new Long(1));
//        for(EqInfos eq : list){
//            System.out.println(eq);
//        }
    }

    @Test
    public void testShiro(){
        SysUser user = ShiroUtil.getUserEntity();
        System.out.println(user);
    }

    @Test
    public void testProvider(){
//        System.out.println(ShiroUtil.getUserEntity());
//        List<Provider> list =  providerMapper.findAllProvider();
//        for(Provider pro : list){
//            System.out.println(pro);
//        }
//        Provider provider = providerMapper.selectByPrimaryKey(new Long(1));
//        provider.setAddress("浙江");
//        providerMapper.updateByPrimaryKeySelective(provider);
//        System.out.println(provider);

        String code = providerMapper.findProviderCode();
        String newCode = "";
        if(code != "" && code != null){
            int temp = Integer.valueOf(code.split("B")[1])+1;
            String s = String.format("%05d", temp);
            newCode = "B"+s;
        }else{
            newCode = "B00001";
        }
        System.out.println(newCode);
    }
//    public void syso(List<Enum> list){
//        for(Object obj:list){
//            System.out.println(obj);
//        }
//    }
    @Test
    public void testString(){
//        System.out.println("img.jpg".split("\\.").length);
        String str = "A00001";
        System.out.println(Integer.valueOf(str.split("A")[1])+1);
        String s = String.format("%05d", Integer.valueOf(str.split("A")[1])+1);
        System.out.println(s);
//        System.out.println(new );
    }
    @Test
    public void testProperties() throws Exception{
        Properties prop = new Properties();
//        InputStream input = new FileInputStream(new File("base.properties"));
        BufferedReader  input = new BufferedReader(new FileReader("/base.properties"));
        prop.load(input);
        String realPath = prop.getProperty("dir");
        System.out.println(realPath);
    }
}
