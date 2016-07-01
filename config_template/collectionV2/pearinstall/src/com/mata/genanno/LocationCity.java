

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
public class LocationCity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LocationCity.class);
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
  protected LocationCity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LocationCity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LocationCity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LocationCity(JCas jcas, int begin, int end) {
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
  //* Feature: city

  /** getter for city - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCity() {
    if (LocationCity_Type.featOkTst && ((LocationCity_Type)jcasType).casFeat_city == null)
      jcasType.jcas.throwFeatMissing("city", "com.mata.genanno.LocationCity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LocationCity_Type)jcasType).casFeatCode_city);}
    
  /** setter for city - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCity(String v) {
    if (LocationCity_Type.featOkTst && ((LocationCity_Type)jcasType).casFeat_city == null)
      jcasType.jcas.throwFeatMissing("city", "com.mata.genanno.LocationCity");
    jcasType.ll_cas.ll_setStringValue(addr, ((LocationCity_Type)jcasType).casFeatCode_city, v);}    
   
    
  //*--------------*
  //* Feature: ruleId

  /** getter for ruleId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleId() {
    if (LocationCity_Type.featOkTst && ((LocationCity_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.LocationCity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LocationCity_Type)jcasType).casFeatCode_ruleId);}
    
  /** setter for ruleId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleId(String v) {
    if (LocationCity_Type.featOkTst && ((LocationCity_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.LocationCity");
    jcasType.ll_cas.ll_setStringValue(addr, ((LocationCity_Type)jcasType).casFeatCode_ruleId, v);}    
  }

    