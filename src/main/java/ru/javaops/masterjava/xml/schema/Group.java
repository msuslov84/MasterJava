package ru.javaops.masterjava.xml.schema;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "type",
        "project"
})
@XmlRootElement(name = "Group", namespace = "http://javaops.ru")
public class Group {

    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "type", required = true)
    protected GroupType type;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object project;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getProject() {
        return project;
    }

    public void setProject(Object project) {
        this.project = project;
    }
}
