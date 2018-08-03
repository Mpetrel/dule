package io.lovs.dule;

import io.lovs.dule.server.DuleServer;
import io.lovs.dule.server.impl.DefaultDuleServer;

/**
 * @program: dule
 * @description:
 * @author: Larry
 * @create: 2018-08-03 13:35
 **/
public class Dule {
    public static void main(String[] args) {
        DuleServer server = new DefaultDuleServer();
        server.start();
    }
}
