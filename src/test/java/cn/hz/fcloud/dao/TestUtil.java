package cn.hz.fcloud.dao;

import cn.hz.fcloud.BaseTest;
import cn.hz.fcloud.utils.SMSUtil;
import cn.hz.fcloud.utils.SerialNumberUtil;
import cn.hz.fcloud.utils.ShiroUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.apache.xpath.operations.Bool;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class TestUtil extends BaseTest{

    @Test
    public void testNumber(){
        Set set = new HashSet();
        Boolean flag = true;
        for(int i=0;i<1000000;i++){
            flag = set.add(SerialNumberUtil.generateNumner());
            if(!flag && i<10000){
                System.out.println(i);
            }
        }
    }
    @Test
    public void testSMS() throws IOException {
        SMSUtil.sendSMS(new ArrayList<String>(Arrays.asList("15779180696","13362914267")));
    }

    @Test
    public void testShiro(){
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        System.out.println(subject);
        System.out.println(Thread.currentThread());
        JdbcRealm jdbcRealm = new JdbcRealm();
        System.out.println(SecurityUtils.getSubject().getSession().getTimeout());
    }
}
