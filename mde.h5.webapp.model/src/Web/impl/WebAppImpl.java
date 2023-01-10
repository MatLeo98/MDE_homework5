/**
 */
package Web.impl;

import Web.Index;
import Web.Individual;
import Web.Page;
import Web.Table;
import Web.WebApp;
import Web.WebPackage;
import Web.WebTables;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Iterator;
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

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.WebAppImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link Web.impl.WebAppImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link Web.impl.WebAppImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebAppImpl extends NamedElementImpl implements WebApp {
	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.WEB_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<Table>(Table.class, this, WebPackage.WEB_APP__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WebPackage.WEB_APP__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.WEB_APP__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger entityInstancesNumber(final String entity) {
		/**
		 *
		 * Index.allInstances()
		 * ->select(i | (i.table.name = entity))
		 * ->size() +
		 * Individual.allInstances()
		 * ->select(i | (i.table.name = entity))
		 * ->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Index_0 = idResolver.getClass(WebTables.CLSSid_Index, null);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Individual_0 = idResolver.getClass(WebTables.CLSSid_Individual, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Index, TYP_Web_c_c_Index_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Index);
		Iterator<Object> ITERATOR_i = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR_i.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Index i = (Index)ITERATOR_i.next();
			/**
			 * i.table.name = entity
			 */
			final /*@NonInvalid*/ Table table = i.getTable();
			final /*@NonInvalid*/ String name = table.getName();
			final /*@NonInvalid*/ boolean eq = entity.equals(name);
			//
			if (eq) {
				accumulator.add(i);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Individual, TYP_Web_c_c_Individual_0);
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Individual);
		Iterator<Object> ITERATOR_i_0 = allInstances_0.iterator();
		/*@NonInvalid*/ SetValue select_0;
		while (true) {
			if (!ITERATOR_i_0.hasNext()) {
				select_0 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Individual i_0 = (Individual)ITERATOR_i_0.next();
			/**
			 * i.table.name = entity
			 */
			final /*@NonInvalid*/ Table table_0 = i_0.getTable();
			final /*@NonInvalid*/ String name_0 = table_0.getName();
			final /*@NonInvalid*/ boolean eq_0 = entity.equals(name_0);
			//
			if (eq_0) {
				accumulator_0.add(i_0);
			}
		}
		final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
		final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(size, size_0);
		final BigInteger ECORE_sum = ValueUtil.bigIntegerValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueEntityName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WebApp::UniqueEntityName";
		try {
			/**
			 *
			 * inv UniqueEntityName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = tables->forAll(e |
			 *           tables->select(ent | (e.name = ent.name))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WebPackage.Literals.WEB_APP___UNIQUE_ENTITY_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Table> tables = this.getTables();
				final /*@NonInvalid*/ OrderedSetValue BOXED_tables = idResolver.createOrderedSetOfAll(WebTables.ORD_CLSSid_Table, tables);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_tables.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Table e_0 = (Table)ITERATOR_e_0.next();
					/**
					 *
					 * tables->select(ent | (e.name = ent.name))
					 * ->size() <= 1
					 */
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(WebTables.ORD_CLSSid_Table);
					Iterator<Object> ITERATOR_ent = BOXED_tables.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_ent.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Table ent = (Table)ITERATOR_ent.next();
						/**
						 * e.name = ent.name
						 */
						final /*@NonInvalid*/ String name = e_0.getName();
						final /*@NonInvalid*/ String name_0 = ent.getName();
						final /*@NonInvalid*/ boolean eq = (name != null) ? name.equals(name_0) : (name_0 == null);
						//
						if (eq) {
							accumulator_0.add(ent);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, WebTables.INT_1).booleanValue();
					//
					if (!le_0) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (le_0) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WebTables.INT_0).booleanValue();
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
			case WebPackage.WEB_APP__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case WebPackage.WEB_APP__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case WebPackage.WEB_APP__TABLES:
				return getTables();
			case WebPackage.WEB_APP__PAGES:
				return getPages();
			case WebPackage.WEB_APP__VERSION:
				return getVersion();
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
			case WebPackage.WEB_APP__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
				return;
			case WebPackage.WEB_APP__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebPackage.WEB_APP__VERSION:
				setVersion((String)newValue);
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
			case WebPackage.WEB_APP__TABLES:
				getTables().clear();
				return;
			case WebPackage.WEB_APP__PAGES:
				getPages().clear();
				return;
			case WebPackage.WEB_APP__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case WebPackage.WEB_APP__TABLES:
				return tables != null && !tables.isEmpty();
			case WebPackage.WEB_APP__PAGES:
				return pages != null && !pages.isEmpty();
			case WebPackage.WEB_APP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
			case WebPackage.WEB_APP___ENTITY_INSTANCES_NUMBER__STRING:
				return entityInstancesNumber((String)arguments.get(0));
			case WebPackage.WEB_APP___UNIQUE_ENTITY_NAME__DIAGNOSTICCHAIN_MAP:
				return UniqueEntityName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //WebAppImpl
