package com.learn.web.gwt.client.sap;

import java.io.Serializable;

//import com.sap.sse.common.Named;

/**
 * Equality and hash code are based on the {@link #name} field's value.
 * 
 * @author Axel Uhl (D043530)
 *
 */
public class NamedDTO implements Named, Serializable {
    private static final long serialVersionUID = -6620231501480297257L;
    private String name;

    public NamedDTO() {}
    
    public NamedDTO(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NamedDTO other = (NamedDTO) obj;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
