/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amlibtech.html_Elements;

import java.util.LinkedList;

/**
 *
 * @author dgleeson
 */
public class HTML_Attribute_List extends LinkedList {

    public HTML_Attribute_List() {
        super();
    }

    public boolean add(HTML_Attribute e) {
        return super.add(e);
    }

    public void add(int index, HTML_Attribute element) {
        super.add(index, element);
    }

    public void addFirst(HTML_Attribute e) {
        super.addFirst(e);
    }

    public void addLast(HTML_Attribute e) {
        super.addLast(e);
    }

    @Override
    public HTML_Attribute element() {
        return (HTML_Attribute)super.element();
    }


    @Override
    public HTML_Attribute get(int index) {
        return (HTML_Attribute)super.get(index);
    }

    @Override
    public HTML_Attribute getFirst() {
        return (HTML_Attribute)super.getFirst();
    }

    @Override
    public HTML_Attribute getLast() {
        return (HTML_Attribute)super.getLast();
    }

    public HTML_Attribute set(int index, HTML_Attribute element) {
        return (HTML_Attribute)super.set(index, element);
    }



    @Override
    public String toString(){
        String result="";
        for(int i=0; i<this.size(); i++){
            this.get(i).toString();
        }
        return result;
    }

}
