/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm.impl;

import de.htwg.zeta.xtext.calculatorForm.Calculate;
import de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage;
import de.htwg.zeta.xtext.calculatorForm.Form;
import de.htwg.zeta.xtext.calculatorForm.FormElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FormImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FormImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FormImpl#getCalculations <em>Calculations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormElements() <em>Form Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormElements()
   * @generated
   * @ordered
   */
  protected EList<FormElement> formElements;

  /**
   * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalculations()
   * @generated
   * @ordered
   */
  protected EList<Calculate> calculations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CalculatorFormPackage.Literals.FORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FORM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormElement> getFormElements()
  {
    if (formElements == null)
    {
      formElements = new EObjectContainmentEList<FormElement>(FormElement.class, this, CalculatorFormPackage.FORM__FORM_ELEMENTS);
    }
    return formElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Calculate> getCalculations()
  {
    if (calculations == null)
    {
      calculations = new EObjectContainmentEList<Calculate>(Calculate.class, this, CalculatorFormPackage.FORM__CALCULATIONS);
    }
    return calculations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CalculatorFormPackage.FORM__FORM_ELEMENTS:
        return ((InternalEList<?>)getFormElements()).basicRemove(otherEnd, msgs);
      case CalculatorFormPackage.FORM__CALCULATIONS:
        return ((InternalEList<?>)getCalculations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CalculatorFormPackage.FORM__NAME:
        return getName();
      case CalculatorFormPackage.FORM__FORM_ELEMENTS:
        return getFormElements();
      case CalculatorFormPackage.FORM__CALCULATIONS:
        return getCalculations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CalculatorFormPackage.FORM__NAME:
        setName((String)newValue);
        return;
      case CalculatorFormPackage.FORM__FORM_ELEMENTS:
        getFormElements().clear();
        getFormElements().addAll((Collection<? extends FormElement>)newValue);
        return;
      case CalculatorFormPackage.FORM__CALCULATIONS:
        getCalculations().clear();
        getCalculations().addAll((Collection<? extends Calculate>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CalculatorFormPackage.FORM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CalculatorFormPackage.FORM__FORM_ELEMENTS:
        getFormElements().clear();
        return;
      case CalculatorFormPackage.FORM__CALCULATIONS:
        getCalculations().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CalculatorFormPackage.FORM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CalculatorFormPackage.FORM__FORM_ELEMENTS:
        return formElements != null && !formElements.isEmpty();
      case CalculatorFormPackage.FORM__CALCULATIONS:
        return calculations != null && !calculations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FormImpl
