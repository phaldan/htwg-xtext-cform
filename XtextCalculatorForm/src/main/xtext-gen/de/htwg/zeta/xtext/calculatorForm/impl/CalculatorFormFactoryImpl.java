/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm.impl;

import de.htwg.zeta.xtext.calculatorForm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalculatorFormFactoryImpl extends EFactoryImpl implements CalculatorFormFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CalculatorFormFactory init()
  {
    try
    {
      CalculatorFormFactory theCalculatorFormFactory = (CalculatorFormFactory)EPackage.Registry.INSTANCE.getEFactory(CalculatorFormPackage.eNS_URI);
      if (theCalculatorFormFactory != null)
      {
        return theCalculatorFormFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CalculatorFormFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalculatorFormFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CalculatorFormPackage.MODEL: return createModel();
      case CalculatorFormPackage.FORM: return createForm();
      case CalculatorFormPackage.FORM_ELEMENT: return createFormElement();
      case CalculatorFormPackage.FIELD: return createField();
      case CalculatorFormPackage.FIELD_INPUT: return createFieldInput();
      case CalculatorFormPackage.FIELD_SELECT: return createFieldSelect();
      case CalculatorFormPackage.FIELD_SELECT_CHILD: return createFieldSelectChild();
      case CalculatorFormPackage.FIELD_OPTION: return createFieldOption();
      case CalculatorFormPackage.FIELD_OPTION_GROUP: return createFieldOptionGroup();
      case CalculatorFormPackage.FIELD_CHOICE: return createFieldChoice();
      case CalculatorFormPackage.FIELD_CHOICE_OPTION: return createFieldChoiceOption();
      case CalculatorFormPackage.GROUP: return createGroup();
      case CalculatorFormPackage.PAGE: return createPage();
      case CalculatorFormPackage.PAGE_CHILD: return createPageChild();
      case CalculatorFormPackage.BUTTON: return createButton();
      case CalculatorFormPackage.BUTTON_SUBMIT: return createButtonSubmit();
      case CalculatorFormPackage.CALCULATE: return createCalculate();
      case CalculatorFormPackage.RESULT_OUTPUT: return createResultOutput();
      case CalculatorFormPackage.EXPRESSION: return createExpression();
      case CalculatorFormPackage.UNARY_OPERATION: return createUnaryOperation();
      case CalculatorFormPackage.LITERAL: return createLiteral();
      case CalculatorFormPackage.OUTPUT_FIELD: return createOutputField();
      case CalculatorFormPackage.OUTPUT_VARIABLE: return createOutputVariable();
      case CalculatorFormPackage.PLUS: return createPlus();
      case CalculatorFormPackage.MINUS: return createMinus();
      case CalculatorFormPackage.MULTI: return createMulti();
      case CalculatorFormPackage.DIV: return createDiv();
      case CalculatorFormPackage.BOOLEAN_NEGATION: return createBooleanNegation();
      case CalculatorFormPackage.ARITHMETIC_SIGNED: return createArithmeticSigned();
      case CalculatorFormPackage.NUMBER_LITERAL: return createNumberLiteral();
      case CalculatorFormPackage.FLOAT_LITERAL: return createFloatLiteral();
      case CalculatorFormPackage.PERCENT_LITERAL: return createPercentLiteral();
      case CalculatorFormPackage.REFERENCE_LITERAL: return createReferenceLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form createForm()
  {
    FormImpl form = new FormImpl();
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormElement createFormElement()
  {
    FormElementImpl formElement = new FormElementImpl();
    return formElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldInput createFieldInput()
  {
    FieldInputImpl fieldInput = new FieldInputImpl();
    return fieldInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldSelect createFieldSelect()
  {
    FieldSelectImpl fieldSelect = new FieldSelectImpl();
    return fieldSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldSelectChild createFieldSelectChild()
  {
    FieldSelectChildImpl fieldSelectChild = new FieldSelectChildImpl();
    return fieldSelectChild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOption createFieldOption()
  {
    FieldOptionImpl fieldOption = new FieldOptionImpl();
    return fieldOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOptionGroup createFieldOptionGroup()
  {
    FieldOptionGroupImpl fieldOptionGroup = new FieldOptionGroupImpl();
    return fieldOptionGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldChoice createFieldChoice()
  {
    FieldChoiceImpl fieldChoice = new FieldChoiceImpl();
    return fieldChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldChoiceOption createFieldChoiceOption()
  {
    FieldChoiceOptionImpl fieldChoiceOption = new FieldChoiceOptionImpl();
    return fieldChoiceOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageChild createPageChild()
  {
    PageChildImpl pageChild = new PageChildImpl();
    return pageChild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonSubmit createButtonSubmit()
  {
    ButtonSubmitImpl buttonSubmit = new ButtonSubmitImpl();
    return buttonSubmit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calculate createCalculate()
  {
    CalculateImpl calculate = new CalculateImpl();
    return calculate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultOutput createResultOutput()
  {
    ResultOutputImpl resultOutput = new ResultOutputImpl();
    return resultOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperation createUnaryOperation()
  {
    UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
    return unaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputField createOutputField()
  {
    OutputFieldImpl outputField = new OutputFieldImpl();
    return outputField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputVariable createOutputVariable()
  {
    OutputVariableImpl outputVariable = new OutputVariableImpl();
    return outputVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanNegation createBooleanNegation()
  {
    BooleanNegationImpl booleanNegation = new BooleanNegationImpl();
    return booleanNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticSigned createArithmeticSigned()
  {
    ArithmeticSignedImpl arithmeticSigned = new ArithmeticSignedImpl();
    return arithmeticSigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PercentLiteral createPercentLiteral()
  {
    PercentLiteralImpl percentLiteral = new PercentLiteralImpl();
    return percentLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceLiteral createReferenceLiteral()
  {
    ReferenceLiteralImpl referenceLiteral = new ReferenceLiteralImpl();
    return referenceLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalculatorFormPackage getCalculatorFormPackage()
  {
    return (CalculatorFormPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CalculatorFormPackage getPackage()
  {
    return CalculatorFormPackage.eINSTANCE;
  }

} //CalculatorFormFactoryImpl
