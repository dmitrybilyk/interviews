package com.learn.hibernate.queries.hql.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 15.01.14
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class TableTableParser {
    public static void main(String[] args) {
        /* Make InputSource file from the html file */
        File htmlFile = new File("/htmltablesfordb/student.html");
        InputStream inStrem = null;
        try {
            inStrem = new FileInputStream(htmlFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        InputSource ins = new InputSource(inStrem);

  /* Make a Document File */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document htmlDocument = null;
        try {
            htmlDocument = factory.newDocumentBuilder().parse(ins);
        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

  /* Create a new div node */
        Element root = htmlDocument.getDocumentElement();
        System.out.print("root Name : " + root.getTagName() + "\n");
        NodeList nodeList = root.getElementsByTagName("div");
        Node aDivNode = nodeList.item(0);
        System.out.print("Div Content :" + aDivNode.getTextContent() + "\n");

  /* Attach a text node to div node, i.e,Hi Surabhi Here*/
        Element anewDivElement = htmlDocument.createElement("div");
        Text txtNode = htmlDocument.createTextNode("Hi Surabhi Here");
        anewDivElement.appendChild(txtNode);

  /* Attach the new div elemnet to document Fragment */
        DocumentFragment fragment = htmlDocument.createDocumentFragment();
        fragment.appendChild(anewDivElement);
        aDivNode.appendChild(fragment);

  /* Create a Transformer Factory and a Transformer */
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer htmlTransformer = null;
        try {
            htmlTransformer = tFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Source domSource = new DOMSource(htmlDocument);
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(
                    new File("./demoHtmlOutPut.html"));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Result result = new StreamResult(filewriter);
        try {
            htmlTransformer.transform(domSource, result);
        } catch (TransformerException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
