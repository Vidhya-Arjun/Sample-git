import java.io.File;
import java.security.KeyStore.Entry.Attribute;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLCreation {
    public static void main(String[] args) throws ParserConfigurationException
    {
        try
        {
        //The following step creates empty XML file
        DocumentBuilderFactory dbfactory =  DocumentBuilderFactory.newInstance();
        DocumentBuilder docbuild = dbfactory.newDocumentBuilder();
        Document doc = docbuild.newDocument();
     
        //Creation of parent name . I also forms the starting point of the XML
        Element rootElement = doc.createElement("company");
       doc.appendChild(rootElement);
        
        //Creating one more parent attribute using element.
        Element elem = doc.createElement("Staff");
        rootElement.appendChild(elem);

        //Setting value for Staff tag in XML
        Attr attr = doc.createAttribute("id");
        attr.setValue("1"); 
        elem.setAttributeNode(attr);

        //Childnode creation 
        Element firstname = doc.createElement("Firstname");
        firstname.appendChild(doc.createTextNode("Vidhya"));
        elem.appendChild(firstname);
       
        //Childnode creation
        Element lastname = doc.createElement("Lastname");
        lastname.appendChild(doc.createTextNode("Segar"));
        elem.appendChild(lastname);

        //Childnode creation 
        Element designation = doc.createElement("Designation");
        designation.appendChild(doc.createTextNode("ITA"));
        elem.appendChild(designation);

        //Childnode creation for salary
        Element salary = doc.createElement("Salary");
        salary.appendChild(doc.createTextNode("1000"));
        elem.appendChild(salary);

      
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("file.xml"));
        transformer.transform(source, result);

		System.out.println("File saved!");

      } 
    
      catch (ParserConfigurationException pce) 
      {
		pce.printStackTrace();
      } catch (TransformerException tfe) 
      {
		tfe.printStackTrace();
	  }
	


    }
    
}