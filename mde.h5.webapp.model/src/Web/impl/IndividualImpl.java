/**
 */
package Web.impl;

import Web.Column;
import Web.Content;
import Web.Individual;
import Web.Link;
import Web.Table;
import Web.WebPackage;
import Web.WebTables;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.IndividualImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Web.impl.IndividualImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link Web.impl.IndividualImpl#getTable <em>Table</em>}</li>
 *   <li>{@link Web.impl.IndividualImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends NamedElementImpl implements Individual {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> attributes;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Column>(Column.class, this, WebPackage.INDIVIDUAL__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		/**
		 * Link.allInstances()->select(individual = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Link_0 = idResolver.getClass(WebTables.CLSSid_Link, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Link_0, TYP_Web_c_c_Link_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Link_0);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Link _1 = (Link)ITERATOR__1.next();
			/**
			 * individual = self
			 */
			final /*@NonInvalid*/ Individual individual = _1.getIndividual();
			final /*@NonInvalid*/ boolean eq = individual.equals(this);
			//
			if (eq) {
				accumulator.add(_1);
			}
		}
		final /*@NonInvalid*/ List<Link> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Link.class, select);
		return (EList<Link>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.INDIVIDUAL__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.INDIVIDUAL__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<Content>(Content.class, this, WebPackage.INDIVIDUAL__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPackage.INDIVIDUAL__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case WebPackage.INDIVIDUAL__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.INDIVIDUAL__ATTRIBUTES:
				return getAttributes();
			case WebPackage.INDIVIDUAL__LINKS:
				return getLinks();
			case WebPackage.INDIVIDUAL__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case WebPackage.INDIVIDUAL__CONTENTS:
				return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebPackage.INDIVIDUAL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Column>)newValue);
				return;
			case WebPackage.INDIVIDUAL__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case WebPackage.INDIVIDUAL__TABLE:
				setTable((Table)newValue);
				return;
			case WebPackage.INDIVIDUAL__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Content>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebPackage.INDIVIDUAL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case WebPackage.INDIVIDUAL__LINKS:
				getLinks().clear();
				return;
			case WebPackage.INDIVIDUAL__TABLE:
				setTable((Table)null);
				return;
			case WebPackage.INDIVIDUAL__CONTENTS:
				getContents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebPackage.INDIVIDUAL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case WebPackage.INDIVIDUAL__LINKS:
				return !getLinks().isEmpty();
			case WebPackage.INDIVIDUAL__TABLE:
				return table != null;
			case WebPackage.INDIVIDUAL__CONTENTS:
				return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
