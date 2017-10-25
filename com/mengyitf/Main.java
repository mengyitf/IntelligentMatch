package com.mengyitf;

import com.mengyitf.config.Config;
import com.mengyitf.service.DepartmentOfStudentMatching;
import com.mengyitf.service.impl.DepartmentOfStudentMatchingImpl;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Config config = new Config(true);
        CreateInportFile createInportFile = new CreateInportFile(config);
        DepartmentOfStudentMatching dosm = new DepartmentOfStudentMatchingImpl();
        dosm.setConfig(config);
        dosm.init();
        long oldtime = new Date().getTime();
        dosm.matching();
        long newtime = new Date().getTime();
        System.out.println("匹配执行时间为: "+(newtime-oldtime)+" 毫秒");
        dosm.print();
    }
}
