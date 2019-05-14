package com.ly.sessioncheck;

import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

import java.io.File;

public class SessionCheckPlugin implements Plugin {

    private XMPPServer server;

    @Override
    public void initializePlugin(PluginManager pluginManager, File file) {
        server = XMPPServer.getInstance();
        System.out.println("***************************start...");
        System.out.println(server.getServerInfo());
    }

    @Override
    public void destroyPlugin() {
        System.out.println("end...");
    }
}
