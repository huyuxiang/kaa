//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.16 at 06:35:50 PM EET 
//


package org.kaaproject.kaa.sandbox.demo.projects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iconBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platform" type="{}platform"/>
 *         &lt;element name="features">
 *           &lt;simpleType>
 *             &lt;list itemType="{}feature" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sourceArchive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectFolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sdkLibDir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destBinaryFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sdkKeyBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project", propOrder = {
    "name",
    "description",
    "iconBase64",
    "platform",
    "features",
    "sourceArchive",
    "projectFolder",
    "sdkLibDir",
    "destBinaryFile",
    "sdkKeyBase64"
})
public class Project
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String iconBase64;
    @XmlElement(required = true)
    protected Platform platform;
    @XmlList
    @XmlElement(required = true)
    protected List<Feature> features;
    @XmlElement(required = true)
    protected String sourceArchive;
    @XmlElement(required = true)
    protected String projectFolder;
    @XmlElement(required = true)
    protected String sdkLibDir;
    @XmlElement(required = true)
    protected String destBinaryFile;
    @XmlElement(required = true)
    protected String sdkKeyBase64;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the iconBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconBase64() {
        return iconBase64;
    }

    /**
     * Sets the value of the iconBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconBase64(String value) {
        this.iconBase64 = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link Platform }
     *     
     */
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform }
     *     
     */
    public void setPlatform(Platform value) {
        this.platform = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeatures() {
        if (features == null) {
            features = new ArrayList<Feature>();
        }
        return this.features;
    }

    /**
     * Gets the value of the sourceArchive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceArchive() {
        return sourceArchive;
    }

    /**
     * Sets the value of the sourceArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceArchive(String value) {
        this.sourceArchive = value;
    }

    /**
     * Gets the value of the projectFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectFolder() {
        return projectFolder;
    }

    /**
     * Sets the value of the projectFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectFolder(String value) {
        this.projectFolder = value;
    }

    /**
     * Gets the value of the sdkLibDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdkLibDir() {
        return sdkLibDir;
    }

    /**
     * Sets the value of the sdkLibDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdkLibDir(String value) {
        this.sdkLibDir = value;
    }

    /**
     * Gets the value of the destBinaryFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestBinaryFile() {
        return destBinaryFile;
    }

    /**
     * Sets the value of the destBinaryFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestBinaryFile(String value) {
        this.destBinaryFile = value;
    }

    /**
     * Gets the value of the sdkKeyBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdkKeyBase64() {
        return sdkKeyBase64;
    }

    /**
     * Sets the value of the sdkKeyBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdkKeyBase64(String value) {
        this.sdkKeyBase64 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
