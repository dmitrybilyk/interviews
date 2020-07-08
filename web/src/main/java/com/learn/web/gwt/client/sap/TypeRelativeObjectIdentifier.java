package com.learn.web.gwt.client.sap;

import java.io.Serializable;

//import com.sap.sse.security.shared.impl.WildcardPermissionEncoder;

public class TypeRelativeObjectIdentifier implements Serializable {
    private static final long serialVersionUID = 118021576560675686L;

    private String typeRelativeIdentifer;

    public TypeRelativeObjectIdentifier() {
    }

    /**
     * Only for DB restore, as the identifier is already escaped and would be double escaped
     */
    public static TypeRelativeObjectIdentifier fromEncodedString(String encodedIdentifier) {
        return new TypeRelativeObjectIdentifier(encodedIdentifier);
    }

    private TypeRelativeObjectIdentifier(String encodedIdentifier) {
        typeRelativeIdentifer = encodedIdentifier;
    }

    /**
     * @param identifers a sequence of {@link String}s identifying an object relative to a type. This means
     * that this means of identification does not have to be unique across different types. For example,
     * if a name is used to identify an object, equal-named objects of different types can still be kept
     * apart. These identifiers can be arbitrary strings. They will be encoded internally such that they
     * can be represented as part of a {@link WildcardPermission}. The {@link #toString()} representation
     * will be the encoded version. Make sure not to pass an encoded version again to this constructor as
     * it would duplicate the encoding.
     */
//    public TypeRelativeObjectIdentifier(String... identifers) {
//        typeRelativeIdentifer = WildcardPermissionEncoder.encode(identifers);
//    }

    /**
     */
    @Override
    public String toString() {
        return typeRelativeIdentifer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((typeRelativeIdentifer == null) ? 0 : typeRelativeIdentifer.hashCode());
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
        TypeRelativeObjectIdentifier other = (TypeRelativeObjectIdentifier) obj;
        if (typeRelativeIdentifer == null) {
            if (other.typeRelativeIdentifer != null)
                return false;
        } else if (!typeRelativeIdentifer.equals(other.typeRelativeIdentifer))
            return false;
        return true;
    }
}
