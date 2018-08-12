/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amlibtech.html_Elements;

import java.io.PrintWriter;

/**
 *
 * @author dgleeson
 */
public class HTML_Document extends HTML_Element {

    String version_info = "-//W3C//DTD HTML 4.01 Transitional//EN";
    HTML_Head head;
    boolean use_Frameset;
    HTML_Body body;
    HTML_Frameset frameset;

    private static final String[] Copyright= {
    "|       Copyright (c) 1985 thru 2003, 2004, 2005, 2006, 2007, 2008, 2009       |",
    "|       American Liberator Technologies                                        |",
    "|       All Rights Reserved                                                    |",
    "|                                                                              |",
    "|       THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF                         |",
    "|       American Liberator Technologies                                        |",
    "|       The copyright notice above does not evidence any                       |",
    "|       actual or intended publication of such source code.                    |"
    };

    public HTML_Document() {
        super("DOCTYPE");
        head=new HTML_Head();
        body=new HTML_Body();
        use_Frameset=false;
        frameset=null;
    }

    public HTML_Document(boolean use_Frameset) {
        super("DOCTYPE");
        this.head = new HTML_Head();
        this.use_Frameset = use_Frameset;
        if(!this.use_Frameset)
            this.body = new HTML_Body();
        else
            this.frameset = new HTML_Frameset();
    }

    public HTML_Body getBody() {
        return body;
    }

    public HTML_Frameset getFrameset() {
        return frameset;
    }

    public HTML_Head getHead() {
        return head;
    }

    public boolean isUse_Frameset() {
        return use_Frameset;
    }

    public void print(PrintWriter out){
        out.println("<!DOCTYPE HTML PUBLIC \"" + this.version_info + "\">");
        head.print(out);
        if(!use_Frameset)
            body.print(out);
        else
            frameset.print(out);
    }

}
