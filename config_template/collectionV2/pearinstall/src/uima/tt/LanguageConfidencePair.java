

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Language-Confidence pair of a language candidate for the document text
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class LanguageConfidencePair extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LanguageConfidencePair.class);
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
  protected LanguageConfidencePair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LanguageConfidencePair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LanguageConfidencePair(JCas jcas) {
    super(jcas);
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
  //* Feature: languageConfidence

  /** getter for languageConfidence - gets An indication (a float value between 0 and 1) of how well the candidate language actually fits the language of the document
   * @generated
   * @return value of the feature 
   */
  public float getLanguageConfidence() {
    if (LanguageConfidencePair_Type.featOkTst && ((LanguageConfidencePair_Type)jcasType).casFeat_languageConfidence == null)
      jcasType.jcas.throwFeatMissing("languageConfidence", "uima.tt.LanguageConfidencePair");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((LanguageConfidencePair_Type)jcasType).casFeatCode_languageConfidence);}
    
  /** setter for languageConfidence - sets An indication (a float value between 0 and 1) of how well the candidate language actually fits the language of the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguageConfidence(float v) {
    if (LanguageConfidencePair_Type.featOkTst && ((LanguageConfidencePair_Type)jcasType).casFeat_languageConfidence == null)
      jcasType.jcas.throwFeatMissing("languageConfidence", "uima.tt.LanguageConfidencePair");
    jcasType.ll_cas.ll_setFloatValue(addr, ((LanguageConfidencePair_Type)jcasType).casFeatCode_languageConfidence, v);}    
   
    
  //*--------------*
  //* Feature: language

  /** getter for language - gets Language name (ISO Locale code)
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() {
    if (LanguageConfidencePair_Type.featOkTst && ((LanguageConfidencePair_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "uima.tt.LanguageConfidencePair");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LanguageConfidencePair_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets Language name (ISO Locale code) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    if (LanguageConfidencePair_Type.featOkTst && ((LanguageConfidencePair_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "uima.tt.LanguageConfidencePair");
    jcasType.ll_cas.ll_setStringValue(addr, ((LanguageConfidencePair_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: languageID

  /** getter for languageID - gets The language as TAF number
   * @generated
   * @return value of the feature 
   */
  public int getLanguageID() {
    if (LanguageConfidencePair_Type.featOkTst && ((LanguageConfidencePair_Type)jcasType).casFeat_languageID == null)
      jcasType.jcas.throwFeatMissing("languageID", "uima.tt.LanguageConfidencePair");
    return jcasType.ll_cas.ll_getIntValue(addr, ((LanguageConfidencePair_Type)jcasType).casFeatCode_languageID);}
    
  /** setter for languageID - sets The language as TAF number 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguageID(int v) {
    if (LanguageConfidencePair_Type.featOkTst && ((LanguageConfidencePair_Type)jcasType).casFeat_languageID == null)
      jcasType.jcas.throwFeatMissing("languageID", "uima.tt.LanguageConfidencePair");
    jcasType.ll_cas.ll_setIntValue(addr, ((LanguageConfidencePair_Type)jcasType).casFeatCode_languageID, v);}    
  }

    