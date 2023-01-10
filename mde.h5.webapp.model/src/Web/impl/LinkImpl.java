/**
 */
package Web.impl;

import Web.Index;
import Web.Individual;
import Web.Link;
import Web.WebPackage;
import Web.WebTables;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;

import org.eclipse.ocl.pivot.values.BagValue.Accumulator;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.LinkImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link Web.impl.LinkImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual individual;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getIndividual() {
		if (individual != null && individual.eIsProxy()) {
			InternalEObject oldIndividual = (InternalEObject)individual;
			individual = (Individual)eResolveProxy(oldIndividual);
			if (individual != oldIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.LINK__INDIVIDUAL, oldIndividual, individual));
			}
		}
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(Individual newIndividual) {
		Individual oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.LINK__INDIVIDUAL, oldIndividual, individual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger referencesNumber() {
		/**
		 *
		 * Index.allInstances()
		 * .links->select(individual = self.individual)
		 * ->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Index_0 = idResolver.getClass(WebTables.CLSSid_Index, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Index, TYP_Web_c_c_Index_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createBagAccumulatorValue(WebTables.BAG_CLSSid_Link_0);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ BagValue collect;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Index _1 = (Index)ITERATOR__1.next();
			/**
			 * links
			 */
			final /*@NonInvalid*/ List<Link> links = _1.getLinks();
			final /*@NonInvalid*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(WebTables.ORD_CLSSid_Link, links);
			//
			for (Object value : BOXED_links.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(WebTables.BAG_CLSSid_Link_0);
		Iterator<Object> ITERATOR__1_0 = collect.iterator();
		/*@NonInvalid*/ BagValue select;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				select = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
			/**
			 * individual = self.individual
			 */
			final /*@NonInvalid*/ Individual individual = _1_0.getIndividual();
			final /*@NonInvalid*/ Individual individual_0 = this.getIndividual();
			final /*@NonInvalid*/ boolean eq = individual.equals(individual_0);
			//
			if (eq) {
				accumulator_0.add(_1_0);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final BigInteger ECORE_size = ValueUtil.bigIntegerValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.LINK__INDIVIDUAL:
				if (resolve) return getIndividual();
				return basicGetIndividual();
			case WebPackage.LINK__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebPackage.LINK__INDIVIDUAL:
				setIndividual((Individual)newValue);
				return;
			case WebPackage.LINK__NAME:
				setName((String)newValue);
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
			case WebPackage.LINK__INDIVIDUAL:
				setIndividual((Individual)null);
				return;
			case WebPackage.LINK__NAME:
				setName(NAME_EDEFAULT);
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
			case WebPackage.LINK__INDIVIDUAL:
				return individual != null;
			case WebPackage.LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebPackage.LINK___REFERENCES_NUMBER:
				return referencesNumber();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
