/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amlibtech.html_Elements;

import com.amlibtech.util.StringPlus;

/**
 *
 * @author dgleeson
 */
public class HTML_Attribute {

    String name;
    String value;

    public HTML_Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return name+"=\"" + StringPlus.html_Encode(value) +"\" ";
    }


}
