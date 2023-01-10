/**
 */
package Web;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Index#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link Web.Index#getLinks <em>Links</em>}</li>
 *   <li>{@link Web.Index#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getIndex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotDuplicatedLink'"
 * @generated
 */
public interface Index extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see Web.WebPackage#getIndex_Individuals()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see Web.WebPackage#getIndex_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see Web.WebPackage#getIndex_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link Web.Index#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Page.allInstances()-&gt;forAll(page | links-&gt;select(link | link.individual=page.individual)-&gt;size()&lt;=1)'"
	 * @generated
	 */
	boolean NotDuplicatedLink(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Index
