/**
 */
package talleruno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Manejador SQL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see talleruno.GramaticaPackage#getManejadorSQL()
 * @model
 * @generated
 */
public enum ManejadorSQL implements Enumerator {
	/**
	 * The '<em><b>POSTGRESQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRESQL_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRESQL(0, "POSTGRESQL", "POSTGRESQL"),

	/**
	 * The '<em><b>MYSQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYSQL_VALUE
	 * @generated
	 * @ordered
	 */
	MYSQL(1, "MYSQL", "MYSQL"),

	/**
	 * The '<em><b>ORACLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(2, "ORACLE", "ORACLE"),

	/**
	 * The '<em><b>SQLSERVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQLSERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SQLSERVER(3, "SQLSERVER", "SQLSERVER");

	/**
	 * The '<em><b>POSTGRESQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRESQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRESQL_VALUE = 0;

	/**
	 * The '<em><b>MYSQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYSQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MYSQL_VALUE = 1;

	/**
	 * The '<em><b>ORACLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 2;

	/**
	 * The '<em><b>SQLSERVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQLSERVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQLSERVER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Manejador SQL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ManejadorSQL[] VALUES_ARRAY = new ManejadorSQL[] {
			POSTGRESQL, MYSQL, ORACLE, SQLSERVER, };

	/**
	 * A public read-only list of all the '<em><b>Manejador SQL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ManejadorSQL> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Manejador SQL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManejadorSQL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ManejadorSQL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Manejador SQL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManejadorSQL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ManejadorSQL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Manejador SQL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManejadorSQL get(int value) {
		switch (value) {
		case POSTGRESQL_VALUE:
			return POSTGRESQL;
		case MYSQL_VALUE:
			return MYSQL;
		case ORACLE_VALUE:
			return ORACLE;
		case SQLSERVER_VALUE:
			return SQLSERVER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ManejadorSQL(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ManejadorSQL
