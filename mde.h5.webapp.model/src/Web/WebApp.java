/**
 */
package Web;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.WebApp#getTables <em>Tables</em>}</li>
 *   <li>{@link Web.WebApp#getPages <em>Pages</em>}</li>
 *   <li>{@link Web.WebApp#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getWebApp()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEntityName'"
 * @generated
 */
public interface WebApp extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see Web.WebPackage#getWebApp_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see Web.WebPackage#getWebApp_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Web.WebPackage#getWebApp_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Web.WebApp#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Index.allInstances()-&gt;select(i | i.table.name = entity)-&gt;size() + Individual.allInstances()-&gt;select(i | i.table.name = entity)-&gt;size()'"
	 * @generated
	 */
	BigInteger entityInstancesNumber(String entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tables-&gt;forAll(e | tables-&gt;select(ent | e.name = ent.name)-&gt;size()&lt;=1)'"
	 * @generated
	 */
	boolean UniqueEntityName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WebApp
