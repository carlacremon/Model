/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.UsuarioImpl
	 * @see Model.impl.ModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PRIMEIRO_NOME = 1;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ULTIMO_NOME = 2;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DATA_NASCIMENTO = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 5;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONE = 6;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO1 = 7;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO2 = 8;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CEP = 9;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CIDADE = 10;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ESTADO = 11;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PAIS = 12;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AlunoImpl
	 * @see Model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TITULO = USUARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PRIMEIRO_NOME = USUARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ULTIMO_NOME = USUARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO1 = USUARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO2 = USUARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>RA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__RA = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.FuncionarioImpl
	 * @see Model.impl.ModelPackageImpl#getFuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 2;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TITULO = USUARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__PRIMEIRO_NOME = USUARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ULTIMO_NOME = USUARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECO1 = USUARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECO2 = USUARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CADASTRO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.AtendenteImpl <em>Atendente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AtendenteImpl
	 * @see Model.impl.ModelPackageImpl#getAtendente()
	 * @generated
	 */
	int ATENDENTE = 3;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TITULO = FUNCIONARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__PRIMEIRO_NOME = FUNCIONARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__ULTIMO_NOME = FUNCIONARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__DATA_NASCIMENTO = FUNCIONARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__EMAIL = FUNCIONARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CPF = FUNCIONARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TELEFONE = FUNCIONARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__ENDERECO1 = FUNCIONARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__ENDERECO2 = FUNCIONARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CEP = FUNCIONARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CIDADE = FUNCIONARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__ESTADO = FUNCIONARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__PAIS = FUNCIONARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CADASTRO = FUNCIONARIO__CADASTRO;

	/**
	 * The number of structural features of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_FEATURE_COUNT = FUNCIONARIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Autoriza Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___AUTORIZA_EMPRESTIMO = FUNCIONARIO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_OPERATION_COUNT = FUNCIONARIO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecarioImpl <em>Bibliotecario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecarioImpl
	 * @see Model.impl.ModelPackageImpl#getBibliotecario()
	 * @generated
	 */
	int BIBLIOTECARIO = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__TITULO = FUNCIONARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__PRIMEIRO_NOME = FUNCIONARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__ULTIMO_NOME = FUNCIONARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__DATA_NASCIMENTO = FUNCIONARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__EMAIL = FUNCIONARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__CPF = FUNCIONARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__TELEFONE = FUNCIONARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__ENDERECO1 = FUNCIONARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__ENDERECO2 = FUNCIONARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__CEP = FUNCIONARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__CIDADE = FUNCIONARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__ESTADO = FUNCIONARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__PAIS = FUNCIONARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__CADASTRO = FUNCIONARIO__CADASTRO;

	/**
	 * The number of structural features of the '<em>Bibliotecario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO_FEATURE_COUNT = FUNCIONARIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Manipula Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO___MANIPULA_EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bibliotecario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO_OPERATION_COUNT = FUNCIONARIO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ProfessorImpl
	 * @see Model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 5;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TITULO = FUNCIONARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PRIMEIRO_NOME = FUNCIONARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ULTIMO_NOME = FUNCIONARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DATA_NASCIMENTO = FUNCIONARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = FUNCIONARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CPF = FUNCIONARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TELEFONE = FUNCIONARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO1 = FUNCIONARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO2 = FUNCIONARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CEP = FUNCIONARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CIDADE = FUNCIONARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ESTADO = FUNCIONARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PAIS = FUNCIONARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CADASTRO = FUNCIONARIO__CADASTRO;

	/**
	 * The feature id for the '<em><b>Disciplinas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DISCIPLINAS = FUNCIONARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = FUNCIONARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Bloqueia Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEIA_EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = FUNCIONARIO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EmprestimoImpl
	 * @see Model.impl.ModelPackageImpl#getEmprestimo()
	 * @generated
	 */
	int EMPRESTIMO = 6;

	/**
	 * The feature id for the '<em><b>Data Inicio Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DATA_INICIO_EMPRESTIMO = 0;

	/**
	 * The feature id for the '<em><b>Data Fim Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DATA_FIM_EMPRESTIMO = 1;

	/**
	 * The number of structural features of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Esta Atrasado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO___ESTA_ATRASADO = 0;

	/**
	 * The operation id for the '<em>Cria Multa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO___CRIA_MULTA = 1;

	/**
	 * The number of operations of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.MultaImpl <em>Multa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.MultaImpl
	 * @see Model.impl.ModelPackageImpl#getMulta()
	 * @generated
	 */
	int MULTA = 7;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__VALOR = 0;

	/**
	 * The number of structural features of the '<em>Multa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Multa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.ReservaImpl <em>Reserva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ReservaImpl
	 * @see Model.impl.ModelPackageImpl#getReserva()
	 * @generated
	 */
	int RESERVA = 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__DATA = 0;

	/**
	 * The number of structural features of the '<em>Reserva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reserva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExemplarImpl
	 * @see Model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 9;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__NOME = 0;

	/**
	 * The feature id for the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__BLOQUEADO = 1;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__ISBN = 2;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.LivroImpl
	 * @see Model.impl.ModelPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 10;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__NOME = EXEMPLAR__NOME;

	/**
	 * The feature id for the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__BLOQUEADO = EXEMPLAR__BLOQUEADO;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__ISBN = EXEMPLAR__ISBN;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = EXEMPLAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EDICAO = EXEMPLAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = EXEMPLAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = EXEMPLAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.PeriodicoImpl <em>Periodico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PeriodicoImpl
	 * @see Model.impl.ModelPackageImpl#getPeriodico()
	 * @generated
	 */
	int PERIODICO = 11;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__NOME = EXEMPLAR__NOME;

	/**
	 * The feature id for the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__BLOQUEADO = EXEMPLAR__BLOQUEADO;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__ISBN = EXEMPLAR__ISBN;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__EDITOR = EXEMPLAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__REVISOR = EXEMPLAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_FEATURE_COUNT = EXEMPLAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_OPERATION_COUNT = EXEMPLAR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see Model.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see Model.Usuario#getTitulo()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getPrimeiroNome <em>Primeiro Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primeiro Nome</em>'.
	 * @see Model.Usuario#getPrimeiroNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_PrimeiroNome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getUltimoNome <em>Ultimo Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ultimo Nome</em>'.
	 * @see Model.Usuario#getUltimoNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_UltimoNome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Nascimento</em>'.
	 * @see Model.Usuario#getDataNascimento()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_DataNascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Model.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCPF <em>CPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPF</em>'.
	 * @see Model.Usuario#getCPF()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_CPF();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTelefone <em>Telefone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefone</em>'.
	 * @see Model.Usuario#getTelefone()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEndereco1 <em>Endereco1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco1</em>'.
	 * @see Model.Usuario#getEndereco1()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Endereco1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEndereco2 <em>Endereco2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco2</em>'.
	 * @see Model.Usuario#getEndereco2()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Endereco2();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEP</em>'.
	 * @see Model.Usuario#getCEP()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_CEP();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCidade <em>Cidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidade</em>'.
	 * @see Model.Usuario#getCidade()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cidade();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Model.Usuario#getEstado()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Estado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see Model.Usuario#getPais()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Pais();

	/**
	 * Returns the meta object for class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#getRA <em>RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RA</em>'.
	 * @see Model.Aluno#getRA()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_RA();

	/**
	 * Returns the meta object for class '{@link Model.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionario</em>'.
	 * @see Model.Funcionario
	 * @generated
	 */
	EClass getFuncionario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Funcionario#getCadastro <em>Cadastro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cadastro</em>'.
	 * @see Model.Funcionario#getCadastro()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_Cadastro();

	/**
	 * Returns the meta object for class '{@link Model.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atendente</em>'.
	 * @see Model.Atendente
	 * @generated
	 */
	EClass getAtendente();

	/**
	 * Returns the meta object for the '{@link Model.Atendente#AutorizaEmprestimo() <em>Autoriza Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Autoriza Emprestimo</em>' operation.
	 * @see Model.Atendente#AutorizaEmprestimo()
	 * @generated
	 */
	EOperation getAtendente__AutorizaEmprestimo();

	/**
	 * Returns the meta object for class '{@link Model.Bibliotecario <em>Bibliotecario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotecario</em>'.
	 * @see Model.Bibliotecario
	 * @generated
	 */
	EClass getBibliotecario();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecario#ManipulaExemplar() <em>Manipula Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Manipula Exemplar</em>' operation.
	 * @see Model.Bibliotecario#ManipulaExemplar()
	 * @generated
	 */
	EOperation getBibliotecario__ManipulaExemplar();

	/**
	 * Returns the meta object for class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Professor#getDisciplinas <em>Disciplinas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disciplinas</em>'.
	 * @see Model.Professor#getDisciplinas()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Disciplinas();

	/**
	 * Returns the meta object for the '{@link Model.Professor#BloqueiaExemplar() <em>Bloqueia Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloqueia Exemplar</em>' operation.
	 * @see Model.Professor#BloqueiaExemplar()
	 * @generated
	 */
	EOperation getProfessor__BloqueiaExemplar();

	/**
	 * Returns the meta object for class '{@link Model.Emprestimo <em>Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emprestimo</em>'.
	 * @see Model.Emprestimo
	 * @generated
	 */
	EClass getEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getDataInicioEmprestimo <em>Data Inicio Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Inicio Emprestimo</em>'.
	 * @see Model.Emprestimo#getDataInicioEmprestimo()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_DataInicioEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getDataFimEmprestimo <em>Data Fim Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Fim Emprestimo</em>'.
	 * @see Model.Emprestimo#getDataFimEmprestimo()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_DataFimEmprestimo();

	/**
	 * Returns the meta object for the '{@link Model.Emprestimo#EstaAtrasado() <em>Esta Atrasado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Esta Atrasado</em>' operation.
	 * @see Model.Emprestimo#EstaAtrasado()
	 * @generated
	 */
	EOperation getEmprestimo__EstaAtrasado();

	/**
	 * Returns the meta object for the '{@link Model.Emprestimo#CriaMulta() <em>Cria Multa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cria Multa</em>' operation.
	 * @see Model.Emprestimo#CriaMulta()
	 * @generated
	 */
	EOperation getEmprestimo__CriaMulta();

	/**
	 * Returns the meta object for class '{@link Model.Multa <em>Multa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multa</em>'.
	 * @see Model.Multa
	 * @generated
	 */
	EClass getMulta();

	/**
	 * Returns the meta object for the attribute '{@link Model.Multa#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Model.Multa#getValor()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_Valor();

	/**
	 * Returns the meta object for class '{@link Model.Reserva <em>Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserva</em>'.
	 * @see Model.Reserva
	 * @generated
	 */
	EClass getReserva();

	/**
	 * Returns the meta object for the attribute '{@link Model.Reserva#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see Model.Reserva#getData()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_Data();

	/**
	 * Returns the meta object for class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Exemplar#getNome()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloqueado</em>'.
	 * @see Model.Exemplar#isBloqueado()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Bloqueado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getISBN <em>ISBN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISBN</em>'.
	 * @see Model.Exemplar#getISBN()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_ISBN();

	/**
	 * Returns the meta object for class '{@link Model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see Model.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Model.Livro#getAutor()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getEdicao <em>Edicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edicao</em>'.
	 * @see Model.Livro#getEdicao()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Edicao();

	/**
	 * Returns the meta object for class '{@link Model.Periodico <em>Periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodico</em>'.
	 * @see Model.Periodico
	 * @generated
	 */
	EClass getPeriodico();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor</em>'.
	 * @see Model.Periodico#getEditor()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Editor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getRevisor <em>Revisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revisor</em>'.
	 * @see Model.Periodico#getRevisor()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Revisor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.UsuarioImpl
		 * @see Model.impl.ModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TITULO = eINSTANCE.getUsuario_Titulo();

		/**
		 * The meta object literal for the '<em><b>Primeiro Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PRIMEIRO_NOME = eINSTANCE.getUsuario_PrimeiroNome();

		/**
		 * The meta object literal for the '<em><b>Ultimo Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ULTIMO_NOME = eINSTANCE.getUsuario_UltimoNome();

		/**
		 * The meta object literal for the '<em><b>Data Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DATA_NASCIMENTO = eINSTANCE.getUsuario_DataNascimento();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>CPF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getUsuario_CPF();

		/**
		 * The meta object literal for the '<em><b>Telefone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONE = eINSTANCE.getUsuario_Telefone();

		/**
		 * The meta object literal for the '<em><b>Endereco1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO1 = eINSTANCE.getUsuario_Endereco1();

		/**
		 * The meta object literal for the '<em><b>Endereco2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO2 = eINSTANCE.getUsuario_Endereco2();

		/**
		 * The meta object literal for the '<em><b>CEP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CEP = eINSTANCE.getUsuario_CEP();

		/**
		 * The meta object literal for the '<em><b>Cidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CIDADE = eINSTANCE.getUsuario_Cidade();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ESTADO = eINSTANCE.getUsuario_Estado();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PAIS = eINSTANCE.getUsuario_Pais();

		/**
		 * The meta object literal for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AlunoImpl
		 * @see Model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '<em><b>RA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__RA = eINSTANCE.getAluno_RA();

		/**
		 * The meta object literal for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FuncionarioImpl
		 * @see Model.impl.ModelPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

		/**
		 * The meta object literal for the '<em><b>Cadastro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__CADASTRO = eINSTANCE.getFuncionario_Cadastro();

		/**
		 * The meta object literal for the '{@link Model.impl.AtendenteImpl <em>Atendente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AtendenteImpl
		 * @see Model.impl.ModelPackageImpl#getAtendente()
		 * @generated
		 */
		EClass ATENDENTE = eINSTANCE.getAtendente();

		/**
		 * The meta object literal for the '<em><b>Autoriza Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___AUTORIZA_EMPRESTIMO = eINSTANCE.getAtendente__AutorizaEmprestimo();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecarioImpl <em>Bibliotecario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecarioImpl
		 * @see Model.impl.ModelPackageImpl#getBibliotecario()
		 * @generated
		 */
		EClass BIBLIOTECARIO = eINSTANCE.getBibliotecario();

		/**
		 * The meta object literal for the '<em><b>Manipula Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIO___MANIPULA_EXEMPLAR = eINSTANCE.getBibliotecario__ManipulaExemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ProfessorImpl
		 * @see Model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Disciplinas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__DISCIPLINAS = eINSTANCE.getProfessor_Disciplinas();

		/**
		 * The meta object literal for the '<em><b>Bloqueia Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEIA_EXEMPLAR = eINSTANCE.getProfessor__BloqueiaExemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EmprestimoImpl
		 * @see Model.impl.ModelPackageImpl#getEmprestimo()
		 * @generated
		 */
		EClass EMPRESTIMO = eINSTANCE.getEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Data Inicio Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DATA_INICIO_EMPRESTIMO = eINSTANCE.getEmprestimo_DataInicioEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Data Fim Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DATA_FIM_EMPRESTIMO = eINSTANCE.getEmprestimo_DataFimEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Esta Atrasado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPRESTIMO___ESTA_ATRASADO = eINSTANCE.getEmprestimo__EstaAtrasado();

		/**
		 * The meta object literal for the '<em><b>Cria Multa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPRESTIMO___CRIA_MULTA = eINSTANCE.getEmprestimo__CriaMulta();

		/**
		 * The meta object literal for the '{@link Model.impl.MultaImpl <em>Multa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.MultaImpl
		 * @see Model.impl.ModelPackageImpl#getMulta()
		 * @generated
		 */
		EClass MULTA = eINSTANCE.getMulta();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__VALOR = eINSTANCE.getMulta_Valor();

		/**
		 * The meta object literal for the '{@link Model.impl.ReservaImpl <em>Reserva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ReservaImpl
		 * @see Model.impl.ModelPackageImpl#getReserva()
		 * @generated
		 */
		EClass RESERVA = eINSTANCE.getReserva();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__DATA = eINSTANCE.getReserva_Data();

		/**
		 * The meta object literal for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExemplarImpl
		 * @see Model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__NOME = eINSTANCE.getExemplar_Nome();

		/**
		 * The meta object literal for the '<em><b>Bloqueado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__BLOQUEADO = eINSTANCE.getExemplar_Bloqueado();

		/**
		 * The meta object literal for the '<em><b>ISBN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__ISBN = eINSTANCE.getExemplar_ISBN();

		/**
		 * The meta object literal for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.LivroImpl
		 * @see Model.impl.ModelPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__AUTOR = eINSTANCE.getLivro_Autor();

		/**
		 * The meta object literal for the '<em><b>Edicao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__EDICAO = eINSTANCE.getLivro_Edicao();

		/**
		 * The meta object literal for the '{@link Model.impl.PeriodicoImpl <em>Periodico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PeriodicoImpl
		 * @see Model.impl.ModelPackageImpl#getPeriodico()
		 * @generated
		 */
		EClass PERIODICO = eINSTANCE.getPeriodico();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__EDITOR = eINSTANCE.getPeriodico_Editor();

		/**
		 * The meta object literal for the '<em><b>Revisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__REVISOR = eINSTANCE.getPeriodico_Revisor();

	}

} //ModelPackage
