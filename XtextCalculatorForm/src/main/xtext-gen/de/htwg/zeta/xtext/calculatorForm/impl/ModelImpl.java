/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm.impl;

import de.htwg.zeta.xtext.calculatorForm.Calculate;
import de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage;
import de.htwg.zeta.xtext.calculatorForm.FormElement;
import de.htwg.zeta.xtext.calculatorForm.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.ModelImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.ModelImpl#getCalculations <em>Calculations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
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
  protected ModelImpl()
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
    return CalculatorFormPackage.Literals.MODEL;
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
      formElements = new EObjectContainmentEList<FormElement>(FormElement.class, this, CalculatorFormPackage.MODEL__FORM_ELEMENTS);
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
      calculations = new EObjectContainmentEList<Calculate>(Calculate.class, this, CalculatorFormPackage.MODEL__CALCULATIONS);
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
      case CalculatorFormPackage.MODEL__FORM_ELEMENTS:
        return ((InternalEList<?>)getFormElements()).basicRemove(otherEnd, msgs);
      case CalculatorFormPackage.MODEL__CALCULATIONS:
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
      case CalculatorFormPackage.MODEL__FORM_ELEMENTS:
        return getFormElements();
      case CalculatorFormPackage.MODEL__CALCULATIONS:
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
      case CalculatorFormPackage.MODEL__FORM_ELEMENTS:
        getFormElements().clear();
        getFormElements().addAll((Collection<? extends FormElement>)newValue);
        return;
      case CalculatorFormPackage.MODEL__CALCULATIONS:
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
      case CalculatorFormPackage.MODEL__FORM_ELEMENTS:
        getFormElements().clear();
        return;
      case CalculatorFormPackage.MODEL__CALCULATIONS:
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
      case CalculatorFormPackage.MODEL__FORM_ELEMENTS:
        return formElements != null && !formElements.isEmpty();
      case CalculatorFormPackage.MODEL__CALCULATIONS:
        return calculations != null && !calculations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
