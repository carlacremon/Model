/**
 */
package Model;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Aluno#getRA <em>RA</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends Usuario {
	/**
	 * Returns the value of the '<em><b>RA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RA</em>' attribute.
	 * @see #setRA(BigInteger)
	 * @see Model.ModelPackage#getAluno_RA()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getRA();

	/**
	 * Sets the value of the '{@link Model.Aluno#getRA <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RA</em>' attribute.
	 * @see #getRA()
	 * @generated
	 */
	void setRA(BigInteger value);

} // Aluno
