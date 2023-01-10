/**
 */
package Web;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Page#getIndividual <em>Individual</em>}</li>
 *   <li>{@link Web.Page#getList <em>List</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PageType'"
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(Individual)
	 * @see Web.WebPackage#getPage_Individual()
	 * @model containment="true"
	 * @generated
	 */
	Individual getIndividual();

	/**
	 * Sets the value of the '{@link Web.Page#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see Web.WebPackage#getPage_List()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.individual-&gt;size() = 1 and self.list-&gt;size()=0 or self.individual-&gt;size() = 0 and self.list-&gt;size()&gt;=1'"
	 * @generated
	 */
	boolean PageType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
