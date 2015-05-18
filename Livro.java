/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Livro#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.Livro#getEdicao <em>Edicao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getLivro()
 * @model
 * @generated
 */
public interface Livro extends Exemplar {
	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see Model.ModelPackage#getLivro_Autor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link Model.Livro#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edicao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edicao</em>' attribute.
	 * @see #setEdicao(int)
	 * @see Model.ModelPackage#getLivro_Edicao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getEdicao();

	/**
	 * Sets the value of the '{@link Model.Livro#getEdicao <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edicao</em>' attribute.
	 * @see #getEdicao()
	 * @generated
	 */
	void setEdicao(int value);

} // Livro
