/**
 */
package Web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Column#getType <em>Type</em>}</li>
 *   <li>{@link Web.Column#isIsPK <em>Is PK</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Web.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Web.ColumnType
	 * @see #setType(ColumnType)
	 * @see Web.WebPackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link Web.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Web.ColumnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Is PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is PK</em>' attribute.
	 * @see #setIsPK(boolean)
	 * @see Web.WebPackage#getColumn_IsPK()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPK();

	/**
	 * Sets the value of the '{@link Web.Column#isIsPK <em>Is PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is PK</em>' attribute.
	 * @see #isIsPK()
	 * @generated
	 */
	void setIsPK(boolean value);

} // Column
