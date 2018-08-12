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
public class HTML_Head extends HTML_Element {

    HTML_Title title;

    public HTML_Head() {
        super("head");
        title=new HTML_Title();
    }

    public HTML_Title getTitle() {
        return title;
    }

    public void setTitle_Text(String text){
        this.title.setText(text);
    }

    public void print(PrintWriter out){
        out.println("<head>");
        title.print(out);
        elements.print(out);
        out.println("</head>");
    }


}
