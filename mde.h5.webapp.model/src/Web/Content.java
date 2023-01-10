/**
 */
package Web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Content#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Web.ContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Web.ContentType
	 * @see #setType(ContentType)
	 * @see Web.WebPackage#getContent_Type()
	 * @model required="true"
	 * @generated
	 */
	ContentType getType();

	/**
	 * Sets the value of the '{@link Web.Content#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Web.ContentType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContentType value);

} // Content
