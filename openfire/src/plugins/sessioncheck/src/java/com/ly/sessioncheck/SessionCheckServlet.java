package com.ly.sessioncheck;

import com.ly.sessioncheck.tools.FBase64;
import org.jivesoftware.admin.AuthCheckFilter;
import org.jivesoftware.openfire.SessionManager;
import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.session.Session;
import org.xmpp.packet.JID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionCheckServlet extends HttpServlet {

    private static final String SERVICE_NAME = "sessioncheck/check";

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //  super.doPost(req, resp);
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        System.out.println("HelloServlet check POST Method");
        String reqStr = req.getParameter("value");

        reqStr = new String(FBase64.decode(reqStr));

        //根据传入的字符串获取JID
        JID address = new JID(reqStr);
        //初始化SessionManager
        XMPPServer xmppServer = XMPPServer.getInstance();
        SessionManager sessionManager = new SessionManager();
        sessionManager.initialize(xmppServer);
        //根据JID获取session
        Session session = sessionManager.getSession(address);
        if (session == null) {
            out.print(-100);
            System.out.println("连接为空");
        }else{
            out.print(1);
            System.out.println("连接");
        }

        out.flush();
    }

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        super.init();
        AuthCheckFilter.addExclude(SERVICE_NAME);
    }

    @Override
    public void destroy() {
        AuthCheckFilter.removeExclude(SERVICE_NAME);
        // TODO Auto-generated method stub
        super.destroy();
    }

}
