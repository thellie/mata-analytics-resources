

/* First created by JCasGen Mon Jun 06 12:46:22 ICT 2016 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Jun 06 12:46:22 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class OpinionPhrase extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OpinionPhrase.class);
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
  protected OpinionPhrase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OpinionPhrase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OpinionPhrase(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OpinionPhrase(JCas jcas, int begin, int end) {
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
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPolarity() {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "OpinionPhrase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(String v) {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "OpinionPhrase");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: ruleName

  /** getter for ruleName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleName() {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_ruleName == null)
      jcasType.jcas.throwFeatMissing("ruleName", "OpinionPhrase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_ruleName);}
    
  /** setter for ruleName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleName(String v) {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_ruleName == null)
      jcasType.jcas.throwFeatMissing("ruleName", "OpinionPhrase");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_ruleName, v);}    
   
    
  //*--------------*
  //* Feature: sentimentMatch

  /** getter for sentimentMatch - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentimentMatch() {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_sentimentMatch == null)
      jcasType.jcas.throwFeatMissing("sentimentMatch", "OpinionPhrase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_sentimentMatch);}
    
  /** setter for sentimentMatch - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentimentMatch(String v) {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_sentimentMatch == null)
      jcasType.jcas.throwFeatMissing("sentimentMatch", "OpinionPhrase");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_sentimentMatch, v);}    
   
    
  //*--------------*
  //* Feature: sentimentTerm

  /** getter for sentimentTerm - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentimentTerm() {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_sentimentTerm == null)
      jcasType.jcas.throwFeatMissing("sentimentTerm", "OpinionPhrase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_sentimentTerm);}
    
  /** setter for sentimentTerm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentimentTerm(String v) {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_sentimentTerm == null)
      jcasType.jcas.throwFeatMissing("sentimentTerm", "OpinionPhrase");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_sentimentTerm, v);}    
   
    
  //*--------------*
  //* Feature: ruleId

  /** getter for ruleId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRuleId() {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "OpinionPhrase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_ruleId);}
    
  /** setter for ruleId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleId(String v) {
    if (OpinionPhrase_Type.featOkTst && ((OpinionPhrase_Type)jcasType).casFeat_ruleId == null)
      jcasType.jcas.throwFeatMissing("ruleId", "OpinionPhrase");
    jcasType.ll_cas.ll_setStringValue(addr, ((OpinionPhrase_Type)jcasType).casFeatCode_ruleId, v);}    
  }

    