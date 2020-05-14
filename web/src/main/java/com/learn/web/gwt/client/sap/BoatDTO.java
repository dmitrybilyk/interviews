package com.learn.web.gwt.client.sap;

import java.io.Serializable;

//import com.sap.sailing.domain.common.racelog.tracking.MappableToDevice;
//import com.sap.sailing.domain.common.security.SecuredDomainType;
//import com.sap.sse.common.Color;
//import com.sap.sse.common.WithID;
//import com.sap.sse.security.shared.HasPermissions;
//import com.sap.sse.security.shared.QualifiedObjectIdentifier;
//import com.sap.sse.security.shared.TypeRelativeObjectIdentifier;
//import com.sap.sse.security.shared.dto.NamedSecuredObjectDTO;
//import com.sap.sse.security.shared.dto.SecuredDTO;

public class BoatDTO implements WithID, Serializable {
//public class BoatDTO extends NamedSecuredObjectDTO implements WithID, Serializable, MappableToDevice, SecuredDTO {
    private static final long serialVersionUID = -4076992788294272162L;

    private String idAsString;
    private BoatClassDTO boatClass;
    private String sailId;
    private Color color;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // for GWT
    public BoatDTO() {}

    public BoatDTO(String idAsString, String name, BoatClassDTO boatClass, String sailId) {
        this(idAsString, name, boatClass, sailId, null);
    }

    public BoatDTO(String idAsString, String name, BoatClassDTO boatClass, String sailId, Color color) {
//        super(name);
        this.name = name;
        this.idAsString = idAsString;
        this.boatClass = boatClass;
        this.sailId = sailId;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getSailId() {
        return sailId;
    }
    
//    @Override
    public String getIdAsString() {
        return idAsString;
    }

    @Override
    public Serializable getId() {
        return getIdAsString();
    }

    public BoatClassDTO getBoatClass() {
        return boatClass;
    }
    
    public String getDisplayName() {
        final StringBuilder sb = new StringBuilder();
        final boolean hasSailId = sailId != null && !sailId.isEmpty();
        if (getName() != null) {
            sb.append(getName());
            if (hasSailId) {
                sb.append(" (").append(sailId).append(')');
            }
        } else if (hasSailId) {
            sb.append(sailId);
        } else {
            sb.append(idAsString);
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((boatClass == null) ? 0 : boatClass.hashCode());
        result = prime * result + ((idAsString == null) ? 0 : idAsString.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((sailId == null) ? 0 : sailId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        BoatDTO other = (BoatDTO) obj;
        if (boatClass == null) {
            if (other.boatClass != null)
                return false;
        } else if (!boatClass.equals(other.boatClass))
            return false;
        if (idAsString == null) {
            if (other.idAsString != null)
                return false;
        } else if (!idAsString.equals(other.idAsString))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (sailId == null) {
            if (other.sailId != null)
                return false;
        } else if (!sailId.equals(other.sailId))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return getName() == null ? (getBoatClass().getName() + " / " + getSailId()) : getName();
    }
    
//    @Override
//    public HasPermissions getPermissionType() {
//        return SecuredDomainType.BOAT;
//    }
    
//    @Override
//    public QualifiedObjectIdentifier getIdentifier() {
//        return getPermissionType().getQualifiedObjectIdentifier(getTypeRelativeObjectIdentifier());
//    }

//    public TypeRelativeObjectIdentifier getTypeRelativeObjectIdentifier() {
//        return new TypeRelativeObjectIdentifier(idAsString);
//    }

}
