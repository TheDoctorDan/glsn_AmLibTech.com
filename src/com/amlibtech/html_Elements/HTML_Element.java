/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amlibtech.html_Elements;

import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author dgleeson
 */
public class HTML_Element {

    String mark;
    HTML_Attribute_List attrs;
    String text; // if mark=""
    HTML_Element_List elements;


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

    public HTML_Element(String mark) {
        this.mark = mark;
        this.attrs = new HTML_Attribute_List();
        this.text="";
        this.elements= new HTML_Element_List();
    }

    public String getMark() {
        return mark;
    }

    public HTML_Attribute_List getAttrs() {
        return attrs;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HTML_Element_List getElements() {
        return elements;
    }

    public void add_Attr(String name, String value){
        HTML_Attribute attr = new HTML_Attribute(name, value);
        this.attrs.add(attr);
    }

    public void add_Element(HTML_Element element){
        this.elements.add(element);
    }

    public void add_Text(String text){
        HTML_Element html_Text = new HTML_Text(text);
        this.elements.add(html_Text);
    }

    public void print(PrintWriter out){
        if(this.mark.equals("")){
            out.println(text);
        }else{
            out.println("<" + mark + " " + attrs.toString() + ">");
            elements.print(out);
            out.println("</" + mark + ">");
        }
    }

}
