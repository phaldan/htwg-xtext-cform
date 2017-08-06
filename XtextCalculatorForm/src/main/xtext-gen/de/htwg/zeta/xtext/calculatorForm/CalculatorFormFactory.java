/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage
 * @generated
 */
public interface CalculatorFormFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CalculatorFormFactory eINSTANCE = de.htwg.zeta.xtext.calculatorForm.impl.CalculatorFormFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form</em>'.
   * @generated
   */
  Form createForm();

  /**
   * Returns a new object of class '<em>Form Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Element</em>'.
   * @generated
   */
  FormElement createFormElement();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Field Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Input</em>'.
   * @generated
   */
  FieldInput createFieldInput();

  /**
   * Returns a new object of class '<em>Field Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Select</em>'.
   * @generated
   */
  FieldSelect createFieldSelect();

  /**
   * Returns a new object of class '<em>Field Select Child</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Select Child</em>'.
   * @generated
   */
  FieldSelectChild createFieldSelectChild();

  /**
   * Returns a new object of class '<em>Field Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Option</em>'.
   * @generated
   */
  FieldOption createFieldOption();

  /**
   * Returns a new object of class '<em>Field Option Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Option Group</em>'.
   * @generated
   */
  FieldOptionGroup createFieldOptionGroup();

  /**
   * Returns a new object of class '<em>Field Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Choice</em>'.
   * @generated
   */
  FieldChoice createFieldChoice();

  /**
   * Returns a new object of class '<em>Field Choice Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Choice Option</em>'.
   * @generated
   */
  FieldChoiceOption createFieldChoiceOption();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  Page createPage();

  /**
   * Returns a new object of class '<em>Page Child</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page Child</em>'.
   * @generated
   */
  PageChild createPageChild();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Button Submit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Submit</em>'.
   * @generated
   */
  ButtonSubmit createButtonSubmit();

  /**
   * Returns a new object of class '<em>Calculate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calculate</em>'.
   * @generated
   */
  Calculate createCalculate();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multi Or Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Or Div</em>'.
   * @generated
   */
  MultiOrDiv createMultiOrDiv();

  /**
   * Returns a new object of class '<em>Boolean Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Negation</em>'.
   * @generated
   */
  BooleanNegation createBooleanNegation();

  /**
   * Returns a new object of class '<em>Arithmetic Signed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Signed</em>'.
   * @generated
   */
  ArithmeticSigned createArithmeticSigned();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  FloatLiteral createFloatLiteral();

  /**
   * Returns a new object of class '<em>Percent Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Percent Literal</em>'.
   * @generated
   */
  PercentLiteral createPercentLiteral();

  /**
   * Returns a new object of class '<em>Field Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Reference</em>'.
   * @generated
   */
  FieldReference createFieldReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CalculatorFormPackage getCalculatorFormPackage();

} //CalculatorFormFactory
