package com.smr.bfbort.test;

import com.smr.bfbor.base.BfConfiguration;
import com.smr.bfbor.utils.BFUtil;
import org.junit.Test;

import java.util.UUID;

public class TestAuth {
    @Test
    public void test(){
        BfConfiguration bc = new BfConfiguration("192.168.88.213",6379,4,0.00001,200000000);
        System.out.println(bc);
        BFUtil bfUtil = new BFUtil(bc);
        for (int i = 0 ; i <= 10000; i++){
            bfUtil.add(UUID.randomUUID().toString());
        }
    }

}
