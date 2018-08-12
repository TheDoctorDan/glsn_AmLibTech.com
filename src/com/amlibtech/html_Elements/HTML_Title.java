/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amlibtech.html_Elements;

import javax.swing.text.html.HTML;
import org.w3c.dom.html.HTMLCollection;
import org.w3c.dom.html.HTMLDocument;
import org.w3c.dom.html.HTMLElement;

/**
 *
 * @author dgleeson
 */
public class HTML_Title extends HTML_Element {

    public HTML_Title() {
        super("title");
    }

    public void setText(String text){
        HTML_Text html_Text = new HTML_Text(text);
        this.add_Element(html_Text);
    }


}
