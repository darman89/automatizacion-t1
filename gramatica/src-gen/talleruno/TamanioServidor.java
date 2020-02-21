/**
 */
package talleruno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tamanio Servidor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see talleruno.GramaticaPackage#getTamanioServidor()
 * @model
 * @generated
 */
public enum TamanioServidor implements Enumerator {
	/**
	 * The '<em><b>MICRO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO_VALUE
	 * @generated
	 * @ordered
	 */
	MICRO(0, "MICRO", "MICRO"),

	/**
	 * The '<em><b>SMALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL(1, "SMALL", "SMALL"),

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(2, "MEDIUM", "MEDIUM"),

	/**
	 * The '<em><b>LARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE(3, "LARGE", "LARGE");

	/**
	 * The '<em><b>MICRO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICRO_VALUE = 0;

	/**
	 * The '<em><b>SMALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_VALUE = 1;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 2;

	/**
	 * The '<em><b>LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tamanio Servidor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TamanioServidor[] VALUES_ARRAY = new TamanioServidor[] {
			MICRO, SMALL, MEDIUM, LARGE, };

	/**
	 * A public read-only list of all the '<em><b>Tamanio Servidor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TamanioServidor> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tamanio Servidor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TamanioServidor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TamanioServidor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tamanio Servidor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TamanioServidor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TamanioServidor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tamanio Servidor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TamanioServidor get(int value) {
		switch (value) {
		case MICRO_VALUE:
			return MICRO;
		case SMALL_VALUE:
			return SMALL;
		case MEDIUM_VALUE:
			return MEDIUM;
		case LARGE_VALUE:
			return LARGE;
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
	private TamanioServidor(int value, String name, String literal) {
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

} //TamanioServidor
