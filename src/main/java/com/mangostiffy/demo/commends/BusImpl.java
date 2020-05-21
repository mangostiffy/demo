package com.mangostiffy.demo.commends;

import com.mangostiffy.demo.commends.Bus;
import com.mangostiffy.demo.commends.Commend;

public class BusImpl implements Bus {
    @Override
    public <R, C extends Commend> R execute(C command) {
        return null;
    }
}
