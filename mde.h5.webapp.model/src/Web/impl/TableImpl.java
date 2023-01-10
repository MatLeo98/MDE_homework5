/**
 */
package Web.impl;

import Web.Column;
import Web.Index;
import Web.Individual;
import Web.Table;
import Web.WebPackage;
import Web.WebTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

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
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link Web.impl.TableImpl#getIndividualPages <em>Individual Pages</em>}</li>
 *   <li>{@link Web.impl.TableImpl#getIndexPages <em>Index Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends NamedElementImpl implements Table {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, WebPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividualPages() {
		/**
		 * Individual.allInstances()->select(table = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Individual_0 = idResolver.getClass(WebTables.CLSSid_Individual, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Individual, TYP_Web_c_c_Individual_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Individual);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Individual _1 = (Individual)ITERATOR__1.next();
			/**
			 * table = self
			 */
			final /*@NonInvalid*/ Table table = _1.getTable();
			final /*@NonInvalid*/ boolean eq = table.equals(this);
			//
			if (eq) {
				accumulator.add(_1);
			}
		}
		final /*@NonInvalid*/ List<Individual> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Individual.class, select);
		return (EList<Individual>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndexPages() {
		/**
		 * Index.allInstances()->select(table = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Index_0 = idResolver.getClass(WebTables.CLSSid_Index, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Index, TYP_Web_c_c_Index_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Index);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Index _1 = (Index)ITERATOR__1.next();
			/**
			 * table = self
			 */
			final /*@NonInvalid*/ Table table = _1.getTable();
			final /*@NonInvalid*/ boolean eq = table.equals(this);
			//
			if (eq) {
				accumulator.add(_1);
			}
		}
		final /*@NonInvalid*/ List<Index> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Index.class, select);
		return (EList<Index>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueAttributeName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Table::UniqueAttributeName";
		try {
			/**
			 *
			 * inv UniqueAttributeName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Column.allInstances()
			 *         ->forAll(attr |
			 *           columns->select(a | (attr.name = a.name))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WebPackage.Literals.TABLE___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Column = idResolver.getClass(WebTables.CLSSid_Column, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Column, TYP_Web_c_c_Column);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_attr = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_attr.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Column attr = (Column)ITERATOR_attr.next();
					/**
					 *
					 * columns->select(a | (attr.name = a.name))
					 * ->size() <= 1
					 */
					final /*@NonInvalid*/ List<Column> columns = this.getColumns();
					final /*@NonInvalid*/ OrderedSetValue BOXED_columns = idResolver.createOrderedSetOfAll(WebTables.ORD_CLSSid_Column, columns);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(WebTables.ORD_CLSSid_Column);
					Iterator<Object> ITERATOR_a = BOXED_columns.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Column a = (Column)ITERATOR_a.next();
						/**
						 * attr.name = a.name
						 */
						final /*@NonInvalid*/ String name = attr.getName();
						final /*@NonInvalid*/ String name_0 = a.getName();
						final /*@NonInvalid*/ boolean eq = (name != null) ? name.equals(name_0) : (name_0 == null);
						//
						if (eq) {
							accumulator_0.add(a);
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
			case WebPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case WebPackage.TABLE__COLUMNS:
				return getColumns();
			case WebPackage.TABLE__INDIVIDUAL_PAGES:
				return getIndividualPages();
			case WebPackage.TABLE__INDEX_PAGES:
				return getIndexPages();
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
			case WebPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case WebPackage.TABLE__INDIVIDUAL_PAGES:
				getIndividualPages().clear();
				getIndividualPages().addAll((Collection<? extends Individual>)newValue);
				return;
			case WebPackage.TABLE__INDEX_PAGES:
				getIndexPages().clear();
				getIndexPages().addAll((Collection<? extends Index>)newValue);
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
			case WebPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case WebPackage.TABLE__INDIVIDUAL_PAGES:
				getIndividualPages().clear();
				return;
			case WebPackage.TABLE__INDEX_PAGES:
				getIndexPages().clear();
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
			case WebPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case WebPackage.TABLE__INDIVIDUAL_PAGES:
				return !getIndividualPages().isEmpty();
			case WebPackage.TABLE__INDEX_PAGES:
				return !getIndexPages().isEmpty();
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
			case WebPackage.TABLE___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP:
				return UniqueAttributeName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableImpl
