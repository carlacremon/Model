/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Periodico#getEditor <em>Editor</em>}</li>
 *   <li>{@link Model.Periodico#getRevisor <em>Revisor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPeriodico()
 * @model
 * @generated
 */
public interface Periodico extends Exemplar {
	/**
	 * Returns the value of the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' attribute.
	 * @see #setEditor(String)
	 * @see Model.ModelPackage#getPeriodico_Editor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEditor();

	/**
	 * Sets the value of the '{@link Model.Periodico#getEditor <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' attribute.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(String value);

	/**
	 * Returns the value of the '<em><b>Revisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisor</em>' attribute.
	 * @see #setRevisor(String)
	 * @see Model.ModelPackage#getPeriodico_Revisor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRevisor();

	/**
	 * Sets the value of the '{@link Model.Periodico#getRevisor <em>Revisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisor</em>' attribute.
	 * @see #getRevisor()
	 * @generated
	 */
	void setRevisor(String value);

} // Periodico
