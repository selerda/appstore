// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * 
 */
public abstract class CreditDegree
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 6857458489765981031L;

    private java.lang.String crdgName;

    /**
     * 
     */
    public java.lang.String getCrdgName()
    {
        return this.crdgName;
    }

    public void setCrdgName(java.lang.String crdgName)
    {
        this.crdgName = crdgName;
    }

    private java.lang.String description;

    /**
     * 
     */
    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
    }

    private java.lang.Integer lowLevel;

    /**
     * 
     */
    public java.lang.Integer getLowLevel()
    {
        return this.lowLevel;
    }

    public void setLowLevel(java.lang.Integer lowLevel)
    {
        this.lowLevel = lowLevel;
    }

    private java.lang.Integer highLevel;

    /**
     * 
     */
    public java.lang.Integer getHighLevel()
    {
        return this.highLevel;
    }

    public void setHighLevel(java.lang.Integer highLevel)
    {
        this.highLevel = highLevel;
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private cn.edu.uestc.appstore.domain.Role role;

    /**
     * 
     */
    public cn.edu.uestc.appstore.domain.Role getRole()
    {
        return this.role;
    }

    public void setRole(cn.edu.uestc.appstore.domain.Role role)
    {
        this.role = role;
    }

    private java.util.Collection consumers = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getConsumers()
    {
        return this.consumers;
    }

    public void setConsumers(java.util.Collection consumers)
    {
        this.consumers = consumers;
    }

    private java.util.Collection personServProvs = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getPersonServProvs()
    {
        return this.personServProvs;
    }

    public void setPersonServProvs(java.util.Collection personServProvs)
    {
        this.personServProvs = personServProvs;
    }

    private java.util.Collection entServProvs = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getEntServProvs()
    {
        return this.entServProvs;
    }

    public void setEntServProvs(java.util.Collection entServProvs)
    {
        this.entServProvs = entServProvs;
    }

    /**
     * Returns <code>true</code> if the argument is an CreditDegree instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof CreditDegree))
        {
            return false;
        }
        final CreditDegree that = (CreditDegree)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link cn.edu.uestc.appstore.domain.CreditDegree}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.CreditDegree}.
         */
        public static cn.edu.uestc.appstore.domain.CreditDegree newInstance()
        {
            return new cn.edu.uestc.appstore.domain.CreditDegreeImpl();
        }

        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.CreditDegree}, taking all required and/or
         * read-only properties as arguments.
         */
        public static cn.edu.uestc.appstore.domain.CreditDegree newInstance(java.lang.String crdgName, java.lang.Integer lowLevel, java.lang.Integer highLevel, cn.edu.uestc.appstore.domain.Role role)
        {
            final cn.edu.uestc.appstore.domain.CreditDegree entity = new cn.edu.uestc.appstore.domain.CreditDegreeImpl();
            entity.setCrdgName(crdgName);
            entity.setLowLevel(lowLevel);
            entity.setHighLevel(highLevel);
            entity.setRole(role);
            return entity;
        }

        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.CreditDegree}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static cn.edu.uestc.appstore.domain.CreditDegree newInstance(java.lang.String crdgName, java.lang.String description, java.lang.Integer lowLevel, java.lang.Integer highLevel, cn.edu.uestc.appstore.domain.Role role, java.util.Collection consumers, java.util.Collection personServProvs, java.util.Collection entServProvs)
        {
            final cn.edu.uestc.appstore.domain.CreditDegree entity = new cn.edu.uestc.appstore.domain.CreditDegreeImpl();
            entity.setCrdgName(crdgName);
            entity.setDescription(description);
            entity.setLowLevel(lowLevel);
            entity.setHighLevel(highLevel);
            entity.setRole(role);
            entity.setConsumers(consumers);
            entity.setPersonServProvs(personServProvs);
            entity.setEntServProvs(entServProvs);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}