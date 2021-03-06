/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculate Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.CalculateVariable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getCalculateVariable()
 * @model
 * @generated
 */
public interface CalculateVariable extends ResultOutput, InputVariable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getCalculateVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.htwg.zeta.xtext.calculatorForm.CalculateVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // CalculateVariable
