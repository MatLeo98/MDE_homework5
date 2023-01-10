/**
 */
package Web;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link Web.Table#getIndividualPages <em>Individual Pages</em>}</li>
 *   <li>{@link Web.Table#getIndexPages <em>Index Pages</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueAttributeName'"
 * @generated
 */
public interface Table extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see Web.WebPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Individual Pages</b></em>' reference list.
	 * The list contents are of type {@link Web.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Pages</em>' reference list.
	 * @see Web.WebPackage#getTable_IndividualPages()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Individual> getIndividualPages();

	/**
	 * Returns the value of the '<em><b>Index Pages</b></em>' reference list.
	 * The list contents are of type {@link Web.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Pages</em>' reference list.
	 * @see Web.WebPackage#getTable_IndexPages()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Index> getIndexPages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Column.allInstances()-&gt;forAll(attr | columns-&gt;select(a | attr.name = a.name)-&gt;size()&lt;=1)'"
	 * @generated
	 */
	boolean UniqueAttributeName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Table
