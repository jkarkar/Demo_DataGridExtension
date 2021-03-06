// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Person
{
	private final IMendixObject personMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.Person";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		CssClass("CssClass"),
		Employed("Employed"),
		Order("Order");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Person(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.Person"));
	}

	protected Person(IContext context, IMendixObject personMendixObject)
	{
		if (personMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MyFirstModule.Person", personMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.Person");

		this.personMendixObject = personMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new Person(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Person create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "MyFirstModule.Person");
		return new myfirstmodule.proxies.Person(context, mendixObject);
	}

	/**
	 * @deprecated Use 'Person.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Person initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.Person.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Person initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Person(context, mendixObject);
	}

	public static myfirstmodule.proxies.Person load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Person.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Person> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.Person> result = new java.util.ArrayList<myfirstmodule.proxies.Person>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.Person" + xpathConstraint))
			result.add(myfirstmodule.proxies.Person.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * Set value of CssClass
	 * @param cssclass
	 */
	public final myfirstmodule.proxies.Enum_Colors getCssClass()
	{
		return getCssClass(getContext());
	}

	/**
	 * @param context
	 * @return value of CssClass
	 */
	public final myfirstmodule.proxies.Enum_Colors getCssClass(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CssClass.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Enum_Colors.valueOf((String) obj);
	}

	/**
	 * Set value of CssClass
	 * @param cssclass
	 */
	public final void setCssClass(myfirstmodule.proxies.Enum_Colors cssclass)
	{
		setCssClass(getContext(), cssclass);
	}

	/**
	 * Set value of CssClass
	 * @param context
	 * @param cssclass
	 */
	public final void setCssClass(IContext context, myfirstmodule.proxies.Enum_Colors cssclass)
	{
		if (cssclass != null)
			getMendixObject().setValue(context, MemberNames.CssClass.toString(), cssclass.toString());
		else
			getMendixObject().setValue(context, MemberNames.CssClass.toString(), null);
	}

	/**
	 * @return value of Employed
	 */
	public final Boolean getEmployed()
	{
		return getEmployed(getContext());
	}

	/**
	 * @param context
	 * @return value of Employed
	 */
	public final Boolean getEmployed(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Employed.toString());
	}

	/**
	 * Set value of Employed
	 * @param employed
	 */
	public final void setEmployed(Boolean employed)
	{
		setEmployed(getContext(), employed);
	}

	/**
	 * Set value of Employed
	 * @param context
	 * @param employed
	 */
	public final void setEmployed(IContext context, Boolean employed)
	{
		getMendixObject().setValue(context, MemberNames.Employed.toString(), employed);
	}

	/**
	 * @return value of Order
	 */
	public final Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final Integer getOrder(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(IContext context, Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return personMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Person that = (myfirstmodule.proxies.Person) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "MyFirstModule.Person";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
