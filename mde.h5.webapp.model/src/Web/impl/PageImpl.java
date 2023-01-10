/**
 */
package Web.impl;

import Web.Index;
import Web.Individual;
import Web.Page;
import Web.WebPackage;
import Web.WebTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.PageImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link Web.impl.PageImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual individual;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual(Individual newIndividual, NotificationChain msgs) {
		Individual oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPackage.PAGE__INDIVIDUAL, oldIndividual, newIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(Individual newIndividual) {
		if (newIndividual != individual) {
			NotificationChain msgs = null;
			if (individual != null)
				msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPackage.PAGE__INDIVIDUAL, null, msgs);
			if (newIndividual != null)
				msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebPackage.PAGE__INDIVIDUAL, null, msgs);
			msgs = basicSetIndividual(newIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PAGE__INDIVIDUAL, newIndividual, newIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getList() {
		if (list == null) {
			list = new EObjectContainmentEList<Index>(Index.class, this, WebPackage.PAGE__LIST);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PageType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::PageType";
		try {
			/**
			 *
			 * inv PageType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.individual->size() = 1 and
			 *         self.list->size() = 0 or
			 *         self.individual->size() = 0 and
			 *         self.list->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WebPackage.Literals.PAGE___PAGE_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@NonInvalid*/ Individual individual = this.getIndividual();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Individual, individual);
							final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
							final /*@Thrown*/ boolean eq = size.equals(WebTables.INT_1);
							CAUGHT_eq = eq;
						}
						catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ List<Index> list = this.getList();
							final /*@NonInvalid*/ OrderedSetValue BOXED_list = idResolver.createOrderedSetOfAll(WebTables.ORD_CLSSid_Index, list);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_list);
							final /*@NonInvalid*/ boolean eq_0 = size_0.equals(WebTables.INT_0);
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_eq instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_eq;
								}
								and = ValueUtil.TRUE_VALUE;
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_eq_1;
							try {
								final /*@NonInvalid*/ Individual individual_0 = this.getIndividual();
								final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Individual, individual_0);
								final /*@Thrown*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet_0);
								final /*@Thrown*/ boolean eq_1 = size_1.equals(WebTables.INT_0);
								CAUGHT_eq_1 = eq_1;
							}
							catch (Exception e) {
								CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ List<Index> list_0 = this.getList();
								final /*@NonInvalid*/ OrderedSetValue BOXED_list_0 = idResolver.createOrderedSetOfAll(WebTables.ORD_CLSSid_Index, list_0);
								final /*@NonInvalid*/ IntegerValue size_2 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_list_0);
								final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size_2, WebTables.INT_1).booleanValue();
								if (!ge) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_eq_1 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_eq_1;
									}
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WebTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPackage.PAGE__INDIVIDUAL:
				return basicSetIndividual(null, msgs);
			case WebPackage.PAGE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
			case WebPackage.PAGE__INDIVIDUAL:
				return getIndividual();
			case WebPackage.PAGE__LIST:
				return getList();
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
			case WebPackage.PAGE__INDIVIDUAL:
				setIndividual((Individual)newValue);
				return;
			case WebPackage.PAGE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends Index>)newValue);
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
			case WebPackage.PAGE__INDIVIDUAL:
				setIndividual((Individual)null);
				return;
			case WebPackage.PAGE__LIST:
				getList().clear();
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
			case WebPackage.PAGE__INDIVIDUAL:
				return individual != null;
			case WebPackage.PAGE__LIST:
				return list != null && !list.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebPackage.PAGE___PAGE_TYPE__DIAGNOSTICCHAIN_MAP:
				return PageType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PageImpl
