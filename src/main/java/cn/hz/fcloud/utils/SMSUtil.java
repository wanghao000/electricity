package cn.hz.fcloud.utils;

import cn.hz.fcloud.SMS.sdk.CCPRestSmsSDK;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 *@ClassName SMSUtil
 *@Description  {TODO}
 *@Author wh
 *#Date 2019-06-03 11:02
 */
public class SMSUtil {

    public static void sendSMS(List<String> phones) throws IOException {

        Resource r = new ClassPathResource("/base.properties");
        Properties prop = new Properties();
        prop.load(new FileInputStream(r.getFile()));
        String sms_ip = prop.getProperty("sms_ip");
        String sms_port = prop.getProperty("sms_port");
        String account_sid = prop.getProperty("account_sid");
        String auth_token = prop.getProperty("auth_token");
        String appid = prop.getProperty("appid");
        String rest_url = prop.getProperty("rest_url");
        HashMap<String, Object> result = null;

        //初始化SDK
        CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
        restAPI.init(sms_ip, sms_port);
        restAPI.setAccount(account_sid, auth_token);
        restAPI.setAppId(appid);
        String code = "";
        for(int i=0;i<6;i++){
            int random = (int)(Math.random()*10);
            code += String.valueOf(random);
        }
        result = restAPI.sendTemplateSMS(StringUtils.join(phones.toArray(), ","),"1" ,new String[]{code,"1"});

        if("000000".equals(result.get("statusCode"))){
            //正常返回输出data包体信息（map）
            HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
            Set<String> keySet = data.keySet();
            for(String key:keySet){
                Object object = data.get(key);
                System.out.println(key +" = "+object);
            }
        }else{
            //异常返回输出错误码和错误信息
            System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
        }
    }
}
