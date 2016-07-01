

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
public class MentionParse extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MentionParse.class);
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
  protected MentionParse() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MentionParse(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MentionParse(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MentionParse(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "com.mata.genanno.MentionParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "com.mata.genanno.MentionParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: mentionNorm

  /** getter for mentionNorm - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMentionNorm() {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_mentionNorm == null)
      jcasType.jcas.throwFeatMissing("mentionNorm", "com.mata.genanno.MentionParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_mentionNorm);}
    
  /** setter for mentionNorm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionNorm(String v) {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_mentionNorm == null)
      jcasType.jcas.throwFeatMissing("mentionNorm", "com.mata.genanno.MentionParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_mentionNorm, v);}    
   
    
  //*--------------*
  //* Feature: mention

  /** getter for mention - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMention() {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_mention == null)
      jcasType.jcas.throwFeatMissing("mention", "com.mata.genanno.MentionParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_mention);}
    
  /** setter for mention - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMention(String v) {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_mention == null)
      jcasType.jcas.throwFeatMissing("mention", "com.mata.genanno.MentionParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_mention, v);}    
   
    
  //*--------------*
  //* Feature: ruleId

  /** getter for ruleId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleId() {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.MentionParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_ruleId);}
    
  /** setter for ruleId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleId(String v) {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.MentionParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_ruleId, v);}    
   
    
  //*--------------*
  //* Feature: value1

  /** getter for value1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue1() {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_value1 == null)
      jcasType.jcas.throwFeatMissing("value1", "com.mata.genanno.MentionParse");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_value1);}
    
  /** setter for value1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue1(String v) {
    if (MentionParse_Type.featOkTst && ((MentionParse_Type)jcasType).casFeat_value1 == null)
      jcasType.jcas.throwFeatMissing("value1", "com.mata.genanno.MentionParse");
    jcasType.ll_cas.ll_setStringValue(addr, ((MentionParse_Type)jcasType).casFeatCode_value1, v);}    
  }

    