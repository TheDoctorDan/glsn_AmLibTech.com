/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amlibtech.html_Elements;

import java.io.NotSerializableException;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author dgleeson
 */
public class HTML_Element_List  extends LinkedList {
    

    public HTML_Element_List() {
        super();
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported.");
    }

    public boolean add(HTML_Element e) {
        return super.add(e);
    }

    public void add(int index, HTML_Element e) {
        super.add(index, e);
    }

    public void addFirst(HTML_Element e) {
        super.addFirst(e);
    }

    public void addLast(HTML_Element e) {
        super.addLast(e);
    }

    @Override
    public HTML_Element get(int index) {
        return (HTML_Element)super.get(index);
    }

    @Override
    public HTML_Element getFirst() {
        return (HTML_Element)super.getFirst();
    }

    @Override
    public HTML_Element getLast() {
        return (HTML_Element)super.getLast();
    }

    
    public HTML_Element set(int index, HTML_Element element) {
        return (HTML_Element)super.set(index, element);
    }

    public void print(PrintWriter out){
        for(int i=0; i<this.size(); i++){
            this.get(i).print(out);
        }
    }



}
