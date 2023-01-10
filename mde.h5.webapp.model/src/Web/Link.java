/**
 */
package Web;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Link#getIndividual <em>Individual</em>}</li>
 *   <li>{@link Web.Link#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' reference.
	 * @see #setIndividual(Individual)
	 * @see Web.WebPackage#getLink_Individual()
	 * @model required="true"
	 * @generated
	 */
	Individual getIndividual();

	/**
	 * Sets the value of the '{@link Web.Link#getIndividual <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Web.WebPackage#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Web.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Index.allInstances().links-&gt;select(individual=self.individual)-&gt;size()'"
	 * @generated
	 */
	BigInteger referencesNumber();

} // Link
