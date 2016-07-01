

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package com.mata.genanno;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class OrganizationParse extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OrganizationParse.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected OrganizationParse() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OrganizationParse(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OrganizationParse(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OrganizationParse(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: organization

  /** getter for organization - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOrganization() {
    if (OrganizationParse_Type.featOkTst && ((OrganizationParse_Type)jcasType).casFeat_organization == null)
      jcasType.jcas.throwFeatMissing("organization", "com.mata.genanno.OrganizationParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganizationParse_Type)jcasType).casFeatCode_organization);}
    
  /** setter for organization - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrganization(String v) {
    if (OrganizationParse_Type.featOkTst && ((OrganizationParse_Type)jcasType).casFeat_organization == null)
      jcasType.jcas.throwFeatMissing("organization", "com.mata.genanno.OrganizationParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganizationParse_Type)jcasType).casFeatCode_organization, v);}    
   
    
  //*--------------*
  //* Feature: ruleId

  /** getter for ruleId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleId() {
    if (OrganizationParse_Type.featOkTst && ((OrganizationParse_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.OrganizationParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganizationParse_Type)jcasType).casFeatCode_ruleId);}
    
  /** setter for ruleId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleId(String v) {
    if (OrganizationParse_Type.featOkTst && ((OrganizationParse_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.OrganizationParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganizationParse_Type)jcasType).casFeatCode_ruleId, v);}    
  }

    