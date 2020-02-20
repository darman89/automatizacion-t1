/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import talleruno.ServidorAlmacenamiento;
import talleruno.TallerunoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.ServidorAlmacenamientoImpl#getTamanioInicial <em>Tamanio Inicial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServidorAlmacenamientoImpl extends RecursoImpl implements ServidorAlmacenamiento {
	/**
	 * The default value of the '{@link #getTamanioInicial() <em>Tamanio Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanioInicial()
	 * @generated
	 * @ordered
	 */
	protected static final int TAMANIO_INICIAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTamanioInicial() <em>Tamanio Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanioInicial()
	 * @generated
	 * @ordered
	 */
	protected int tamanioInicial = TAMANIO_INICIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorAlmacenamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.SERVIDOR_ALMACENAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTamanioInicial() {
		return tamanioInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamanioInicial(int newTamanioInicial) {
		int oldTamanioInicial = tamanioInicial;
		tamanioInicial = newTamanioInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL, oldTamanioInicial, tamanioInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TallerunoPackage.SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL:
				return getTamanioInicial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TallerunoPackage.SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL:
				setTamanioInicial((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TallerunoPackage.SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL:
				setTamanioInicial(TAMANIO_INICIAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TallerunoPackage.SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL:
				return tamanioInicial != TAMANIO_INICIAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tamanioInicial: ");
		result.append(tamanioInicial);
		result.append(')');
		return result.toString();
	}

} //ServidorAlmacenamientoImpl
