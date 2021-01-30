/**
 */
package robotnxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotnxt.TurnRight#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see robotnxt.RobotnxtPackage#getTurnRight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='angle_positif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot angle_positif='angle &gt; 0 and angle &lt; 180'"
 * @generated
 */
public interface TurnRight extends Movement {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see robotnxt.RobotnxtPackage#getTurnRight_Angle()
	 * @model required="true"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link robotnxt.TurnRight#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

} // TurnRight
