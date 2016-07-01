

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package org.apache.uima.jcas.tcas;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.StringArray;


/** Annotation covering the entire document, containing document meta information, for example the document language
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class DocumentAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentAnnotation.class);
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
  protected DocumentAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DocumentAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocumentAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DocumentAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: language

  /** getter for language - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "uima.tcas.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "uima.tcas.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: languageCandidates

  /** getter for languageCandidates - gets A list of language candidates for the document produced during language identification. These are sorted by confidence value
   * @generated
   * @return value of the feature 
   */
  public FSList getLanguageCandidates() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_languageCandidates == null)
      jcasType.jcas.throwFeatMissing("languageCandidates", "uima.tcas.DocumentAnnotation");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_languageCandidates)));}
    
  /** setter for languageCandidates - sets A list of language candidates for the document produced during language identification. These are sorted by confidence value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguageCandidates(FSList v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_languageCandidates == null)
      jcasType.jcas.throwFeatMissing("languageCandidates", "uima.tcas.DocumentAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_languageCandidates, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: categories

  /** getter for categories - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getCategories() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_categories == null)
      jcasType.jcas.throwFeatMissing("categories", "uima.tcas.DocumentAnnotation");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_categories)));}
    
  /** setter for categories - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategories(FSList v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_categories == null)
      jcasType.jcas.throwFeatMissing("categories", "uima.tcas.DocumentAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_categories, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets Document id, such as a URL
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "uima.tcas.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Document id, such as a URL 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "uima.tcas.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: fallbackLanguage

  /** getter for fallbackLanguage - gets The ISO name of the fallback language.
   * @generated
   * @return value of the feature 
   */
  public String getFallbackLanguage() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_fallbackLanguage == null)
      jcasType.jcas.throwFeatMissing("fallbackLanguage", "uima.tcas.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_fallbackLanguage);}
    
  /** setter for fallbackLanguage - sets The ISO name of the fallback language. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFallbackLanguage(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_fallbackLanguage == null)
      jcasType.jcas.throwFeatMissing("fallbackLanguage", "uima.tcas.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_fallbackLanguage, v);}    
   
    
  //*--------------*
  //* Feature: acceptLanguage

  /** getter for acceptLanguage - gets The list of ISO name of the language, which the result of language identification is limited to.
   * @generated
   * @return value of the feature 
   */
  public StringArray getAcceptLanguage() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_acceptLanguage == null)
      jcasType.jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_acceptLanguage)));}
    
  /** setter for acceptLanguage - sets The list of ISO name of the language, which the result of language identification is limited to. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAcceptLanguage(StringArray v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_acceptLanguage == null)
      jcasType.jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_acceptLanguage, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for acceptLanguage - gets an indexed value - The list of ISO name of the language, which the result of language identification is limited to.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getAcceptLanguage(int i) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_acceptLanguage == null)
      jcasType.jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_acceptLanguage), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_acceptLanguage), i);}

  /** indexed setter for acceptLanguage - sets an indexed value - The list of ISO name of the language, which the result of language identification is limited to.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAcceptLanguage(int i, String v) { 
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_acceptLanguage == null)
      jcasType.jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_acceptLanguage), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_acceptLanguage), i, v);}
  }

    