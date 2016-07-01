

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
public class OpinionPhraseLevel1 extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OpinionPhraseLevel1.class);
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
  protected OpinionPhraseLevel1() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OpinionPhraseLevel1(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OpinionPhraseLevel1(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OpinionPhraseLevel1(JCas jcas, int begin, int end) {
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
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPolarity() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: ruleName

  /** getter for ruleName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleName() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_ruleName == null)
      jcasType.jcas.throwFeatMissing("ruleName", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_ruleName);}
    
  /** setter for ruleName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleName(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_ruleName == null)
      jcasType.jcas.throwFeatMissing("ruleName", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_ruleName, v);}    
   
    
  //*--------------*
  //* Feature: sentimentTerm

  /** getter for sentimentTerm - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentimentTerm() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_sentimentTerm == null)
      jcasType.jcas.throwFeatMissing("sentimentTerm", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_sentimentTerm);}
    
  /** setter for sentimentTerm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentimentTerm(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_sentimentTerm == null)
      jcasType.jcas.throwFeatMissing("sentimentTerm", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_sentimentTerm, v);}    
   
    
  //*--------------*
  //* Feature: sentimentMatch

  /** getter for sentimentMatch - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentimentMatch() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_sentimentMatch == null)
      jcasType.jcas.throwFeatMissing("sentimentMatch", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_sentimentMatch);}
    
  /** setter for sentimentMatch - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentimentMatch(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_sentimentMatch == null)
      jcasType.jcas.throwFeatMissing("sentimentMatch", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_sentimentMatch, v);}    
   
    
  //*--------------*
  //* Feature: ruleId

  /** getter for ruleId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleId() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_ruleId);}
    
  /** setter for ruleId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleId(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_ruleId, v);}    
   
    
  //*--------------*
  //* Feature: not

  /** getter for not - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNot() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_not == null)
      jcasType.jcas.throwFeatMissing("not", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_not);}
    
  /** setter for not - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNot(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_not == null)
      jcasType.jcas.throwFeatMissing("not", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_not, v);}    
   
    
  //*--------------*
  //* Feature: value1

  /** getter for value1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue1() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_value1 == null)
      jcasType.jcas.throwFeatMissing("value1", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_value1);}
    
  /** setter for value1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue1(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_value1 == null)
      jcasType.jcas.throwFeatMissing("value1", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_value1, v);}    
   
    
  //*--------------*
  //* Feature: value2

  /** getter for value2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue2() {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_value2 == null)
      jcasType.jcas.throwFeatMissing("value2", "com.mata.genanno.OpinionPhraseLevel1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_value2);}
    
  /** setter for value2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue2(String v) {
    if (OpinionPhraseLevel1_Type.featOkTst && ((OpinionPhraseLevel1_Type)jcasType).casFeat_value2 == null)
      jcasType.jcas.throwFeatMissing("value2", "com.mata.genanno.OpinionPhraseLevel1");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhraseLevel1_Type)jcasType).casFeatCode_value2, v);}    
  }

    