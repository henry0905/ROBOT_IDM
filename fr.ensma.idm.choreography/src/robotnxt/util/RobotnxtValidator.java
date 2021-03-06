/**
 */
package robotnxt.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import robotnxt.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see robotnxt.RobotnxtPackage
 * @generated
 */
public class RobotnxtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RobotnxtValidator INSTANCE = new RobotnxtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "robotnxt";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotnxtValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RobotnxtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RobotnxtPackage.CHOREOGRAPHY:
				return validateChoreography((Choreography)value, diagnostics, context);
			case RobotnxtPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case RobotnxtPackage.PEN_DOWN:
				return validatePenDown((PenDown)value, diagnostics, context);
			case RobotnxtPackage.PEN_UP:
				return validatePenUp((PenUp)value, diagnostics, context);
			case RobotnxtPackage.GRAB:
				return validateGrab((Grab)value, diagnostics, context);
			case RobotnxtPackage.RELEASE:
				return validateRelease((Release)value, diagnostics, context);
			case RobotnxtPackage.TURN_LEFT:
				return validateTurnLeft((TurnLeft)value, diagnostics, context);
			case RobotnxtPackage.TURN_RIGHT:
				return validateTurnRight((TurnRight)value, diagnostics, context);
			case RobotnxtPackage.GO_FORWARD:
				return validateGoForward((GoForward)value, diagnostics, context);
			case RobotnxtPackage.GO_BACKWARD:
				return validateGoBackward((GoBackward)value, diagnostics, context);
			case RobotnxtPackage.MOVEMENT:
				return validateMovement((Movement)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreography(Choreography choreography, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(choreography, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validateChoreography_pas_nom_meme(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validateChoreography_up_down_autant(choreography, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the pas_nom_meme constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHOREOGRAPHY__PAS_NOM_MEME__EEXPRESSION = "Choreography.allInstances()->forAll(c1,c2|c1<>c2 implies c1.name<>c2.name)";

	/**
	 * Validates the pas_nom_meme constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreography_pas_nom_meme(Choreography choreography, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.CHOREOGRAPHY,
				 choreography,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "pas_nom_meme",
				 CHOREOGRAPHY__PAS_NOM_MEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the up_down_autant constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHOREOGRAPHY__UP_DOWN_AUTANT__EEXPRESSION = "Choreography.allInstances()->select(e: Instruction | e.oclIsTypeOf(PenDown))->size() = Choreography.allInstances()->select(e: Instruction | e.oclIsTypeOf(PenUp))->size()";

	/**
	 * Validates the up_down_autant constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreography_up_down_autant(Choreography choreography, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.CHOREOGRAPHY,
				 choreography,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "up_down_autant",
				 CHOREOGRAPHY__UP_DOWN_AUTANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenDown(PenDown penDown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penDown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenUp(PenUp penUp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penUp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrab(Grab grab, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grab, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelease(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(release, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnLeft(TurnLeft turnLeft, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnLeft, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateTurnLeft_angle_positif(turnLeft, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the angle_positif constraint of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_LEFT__ANGLE_POSITIF__EEXPRESSION = "angle > 0 and angle < 180";

	/**
	 * Validates the angle_positif constraint of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnLeft_angle_positif(TurnLeft turnLeft, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.TURN_LEFT,
				 turnLeft,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "angle_positif",
				 TURN_LEFT__ANGLE_POSITIF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnRight(TurnRight turnRight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnRight, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateTurnRight_angle_positif(turnRight, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the angle_positif constraint of '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_RIGHT__ANGLE_POSITIF__EEXPRESSION = "angle > 0 and angle < 180";

	/**
	 * Validates the angle_positif constraint of '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnRight_angle_positif(TurnRight turnRight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.TURN_RIGHT,
				 turnRight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "angle_positif",
				 TURN_RIGHT__ANGLE_POSITIF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoForward(GoForward goForward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goForward, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validateGoForward_distance_positif(goForward, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the distance_positif constraint of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GO_FORWARD__DISTANCE_POSITIF__EEXPRESSION = "distance > 0";

	/**
	 * Validates the distance_positif constraint of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoForward_distance_positif(GoForward goForward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.GO_FORWARD,
				 goForward,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "distance_positif",
				 GO_FORWARD__DISTANCE_POSITIF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoBackward(GoBackward goBackward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goBackward, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validateGoBackward_distance_positif(goBackward, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the distance_positif constraint of '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GO_BACKWARD__DISTANCE_POSITIF__EEXPRESSION = "distance > 0";

	/**
	 * Validates the distance_positif constraint of '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoBackward_distance_positif(GoBackward goBackward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.GO_BACKWARD,
				 goBackward,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "distance_positif",
				 GO_BACKWARD__DISTANCE_POSITIF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovement(Movement movement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movement, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RobotnxtValidator
