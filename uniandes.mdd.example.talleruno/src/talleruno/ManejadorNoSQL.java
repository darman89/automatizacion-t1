/**
 */
package talleruno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Manejador No SQL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see talleruno.TallerunoPackage#getManejadorNoSQL()
 * @model
 * @generated
 */
public enum ManejadorNoSQL implements Enumerator {
	/**
	 * The '<em><b>MONGODB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGODB_VALUE
	 * @generated
	 * @ordered
	 */
	MONGODB(0, "MONGODB", "MONGODB"),

	/**
	 * The '<em><b>CASSANDRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA(1, "CASSANDRA", "CASSANDRA");

	/**
	 * The '<em><b>MONGODB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONGODB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONGODB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONGODB_VALUE = 0;

	/**
	 * The '<em><b>CASSANDRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASSANDRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Manejador No SQL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ManejadorNoSQL[] VALUES_ARRAY =
		new ManejadorNoSQL[] {
			MONGODB,
			CASSANDRA,
		};

	/**
	 * A public read-only list of all the '<em><b>Manejador No SQL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ManejadorNoSQL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Manejador No SQL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManejadorNoSQL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ManejadorNoSQL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Manejador No SQL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManejadorNoSQL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ManejadorNoSQL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Manejador No SQL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManejadorNoSQL get(int value) {
		switch (value) {
			case MONGODB_VALUE: return MONGODB;
			case CASSANDRA_VALUE: return CASSANDRA;
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
	private ManejadorNoSQL(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ManejadorNoSQL
