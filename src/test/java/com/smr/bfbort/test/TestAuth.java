package com.smr.bfbort.test;

import com.smr.bfbor.base.BfConfiguration;
import com.smr.bfbor.utils.BFUtil;
import org.junit.Test;

import java.util.UUID;

public class TestAuth {
    @Test
    public void test(){
        BfConfiguration bc = new BfConfiguration("192.168.88.213",6379,8,0.00001,200000000);
        System.out.println(bc);
        BFUtil bfUtil = new BFUtil(bc);
        long start = System.currentTimeMillis();
        int number =100;
        for (int i = 0;i <= number;i++){
            bfUtil.add(UUID.randomUUID().toString());
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start)/number);
    }

}
