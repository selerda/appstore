// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>cn.edu.uestc.appstore.domain.Vocation</code>.
 * </p>
 *
 * @see cn.edu.uestc.appstore.domain.Vocation
 */
public abstract class VocationDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements cn.edu.uestc.appstore.domain.VocationDao
{

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#load(int, java.lang.Long)
     */
    public java.lang.Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Vocation.load - 'id' can not be null");
        }
        final java.lang.Object entity = this.getHibernateTemplate().get(cn.edu.uestc.appstore.domain.VocationImpl.class, id);
        return transformEntity(transform, (cn.edu.uestc.appstore.domain.Vocation)entity);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#load(java.lang.Long)
     */
    public cn.edu.uestc.appstore.domain.Vocation load(java.lang.Long id)
    {
        return (cn.edu.uestc.appstore.domain.Vocation)this.load(TRANSFORM_NONE, id);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#loadAll(int, int)
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#loadAll(int, int, int)
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize)
    {
        try
        {
            final org.hibernate.Criteria criteria = this.getSession(false).createCriteria(cn.edu.uestc.appstore.domain.VocationImpl.class);
            if (pageNumber > 0 && pageSize > 0)
            {
                criteria.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
                criteria.setMaxResults(pageSize);
            }
            final java.util.Collection results = criteria.list();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#create(cn.edu.uestc.appstore.domain.Vocation)
     */
    public cn.edu.uestc.appstore.domain.Vocation create(cn.edu.uestc.appstore.domain.Vocation vocation)
    {
        return (cn.edu.uestc.appstore.domain.Vocation)this.create(TRANSFORM_NONE, vocation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#create(int transform, cn.edu.uestc.appstore.domain.Vocation)
     */
    public java.lang.Object create(final int transform, final cn.edu.uestc.appstore.domain.Vocation vocation)
    {
        if (vocation == null)
        {
            throw new IllegalArgumentException(
                "Vocation.create - 'vocation' can not be null");
        }
        this.getHibernateTemplate().save(vocation);
        return this.transformEntity(transform, vocation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Vocation.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (cn.edu.uestc.appstore.domain.Vocation)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#create(java.lang.String, java.lang.String)
     */
    public cn.edu.uestc.appstore.domain.Vocation create(
        java.lang.String name,
        java.lang.String code)
    {
        return (cn.edu.uestc.appstore.domain.Vocation)this.create(TRANSFORM_NONE, name, code);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#create(int, java.lang.String, java.lang.String)
     */
    public java.lang.Object create(
        final int transform,
        java.lang.String name,
        java.lang.String code)
    {
        cn.edu.uestc.appstore.domain.Vocation entity = new cn.edu.uestc.appstore.domain.VocationImpl();
        entity.setName(name);
        entity.setCode(code);
        return this.create(transform, entity);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#update(cn.edu.uestc.appstore.domain.Vocation)
     */
    public void update(cn.edu.uestc.appstore.domain.Vocation vocation)
    {
        if (vocation == null)
        {
            throw new IllegalArgumentException(
                "Vocation.update - 'vocation' can not be null");
        }
        this.getHibernateTemplate().update(vocation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Vocation.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((cn.edu.uestc.appstore.domain.Vocation)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#remove(cn.edu.uestc.appstore.domain.Vocation)
     */
    public void remove(cn.edu.uestc.appstore.domain.Vocation vocation)
    {
        if (vocation == null)
        {
            throw new IllegalArgumentException(
                "Vocation.remove - 'vocation' can not be null");
        }
        this.getHibernateTemplate().delete(vocation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Vocation.remove - 'id' can not be null");
        }
        cn.edu.uestc.appstore.domain.Vocation entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Vocation.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>cn.edu.uestc.appstore.domain.VocationDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link cn.edu.uestc.appstore.domain.VocationDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    protected java.lang.Object transformEntity(final int transform, final cn.edu.uestc.appstore.domain.Vocation entity)
    {
        java.lang.Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,cn.edu.uestc.appstore.domain.Vocation)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>cn.edu.uestc.appstore.domain.VocationDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,cn.edu.uestc.appstore.domain.Vocation)
     */
    protected void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#toEntities(java.util.Collection)
     */
    public void toEntities(final java.util.Collection results)
    {
        if (results != null)
        {
            org.apache.commons.collections.CollectionUtils.transform(results, ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link cn.edu.uestc.appstore.domain.Vocation}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections.Transformer ENTITYTRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                java.lang.Object result = null;
                if (input instanceof java.lang.Object[])
                {
                    result = toEntity((java.lang.Object[])input);
                }
                else if (input instanceof cn.edu.uestc.appstore.domain.Vocation)
                {
                    result = input;
                }
                return result;
            }
        };

    protected cn.edu.uestc.appstore.domain.Vocation toEntity(java.lang.Object[] row)
    {
        cn.edu.uestc.appstore.domain.Vocation target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final java.lang.Object object = row[ctr];
                if (object instanceof cn.edu.uestc.appstore.domain.Vocation)
                {
                    target = (cn.edu.uestc.appstore.domain.Vocation)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return cn.edu.uestc.appstore.PrincipalStore.get();
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#search(int, int, int, cn.edu.uestc.appstore.Search)
     */
    public cn.edu.uestc.appstore.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final cn.edu.uestc.appstore.Search search)
    {
        try
        {
            search.setPageNumber(pageNumber);
            search.setPageSize(pageSize);
            final cn.edu.uestc.appstore.PropertySearch propertySearch = new cn.edu.uestc.appstore.PropertySearch(
                this.getSession(false), cn.edu.uestc.appstore.domain.VocationImpl.class, search);
            final java.util.List results = propertySearch.executeAsList();
            this.transformEntities(transform, results);
            return new cn.edu.uestc.appstore.PaginationResult(results.toArray(new java.lang.Object[0]), propertySearch.getTotalCount());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#search(int, int, cn.edu.uestc.appstore.Search)
     */
    public cn.edu.uestc.appstore.PaginationResult search(final int pageNumber, final int pageSize, final cn.edu.uestc.appstore.Search search)
    {
        return this.search(TRANSFORM_NONE, pageNumber, pageSize, search);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#search(int, cn.edu.uestc.appstore.Search)
     */
    public java.util.Set search(final int transform, final cn.edu.uestc.appstore.Search search)
    {
        try
        {
            final cn.edu.uestc.appstore.PropertySearch propertySearch = new cn.edu.uestc.appstore.PropertySearch(
                this.getSession(false), cn.edu.uestc.appstore.domain.VocationImpl.class, search);
            final java.util.Set results = propertySearch.executeAsSet();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.VocationDao#search(cn.edu.uestc.appstore.Search)
     */
    public java.util.Set search(final cn.edu.uestc.appstore.Search search)
    {
        return this.search(TRANSFORM_NONE, search);
    }

    // spring-hibernate-dao-base merge-point
}