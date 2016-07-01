
/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package org.apache.uima.jcas.tcas;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotation covering the entire document, containing document meta information, for example the document language
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * @generated */
public class DocumentAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DocumentAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DocumentAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DocumentAnnotation(addr, DocumentAnnotation_Type.this);
  			   DocumentAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DocumentAnnotation(addr, DocumentAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.tcas.DocumentAnnotation");
 
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "uima.tcas.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "uima.tcas.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_languageCandidates;
  /** @generated */
  final int     casFeatCode_languageCandidates;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLanguageCandidates(int addr) {
        if (featOkTst && casFeat_languageCandidates == null)
      jcas.throwFeatMissing("languageCandidates", "uima.tcas.DocumentAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_languageCandidates);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguageCandidates(int addr, int v) {
        if (featOkTst && casFeat_languageCandidates == null)
      jcas.throwFeatMissing("languageCandidates", "uima.tcas.DocumentAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_languageCandidates, v);}
    
  
 
  /** @generated */
  final Feature casFeat_categories;
  /** @generated */
  final int     casFeatCode_categories;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCategories(int addr) {
        if (featOkTst && casFeat_categories == null)
      jcas.throwFeatMissing("categories", "uima.tcas.DocumentAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_categories);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategories(int addr, int v) {
        if (featOkTst && casFeat_categories == null)
      jcas.throwFeatMissing("categories", "uima.tcas.DocumentAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_categories, v);}
    
  
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "uima.tcas.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "uima.tcas.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fallbackLanguage;
  /** @generated */
  final int     casFeatCode_fallbackLanguage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFallbackLanguage(int addr) {
        if (featOkTst && casFeat_fallbackLanguage == null)
      jcas.throwFeatMissing("fallbackLanguage", "uima.tcas.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fallbackLanguage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFallbackLanguage(int addr, String v) {
        if (featOkTst && casFeat_fallbackLanguage == null)
      jcas.throwFeatMissing("fallbackLanguage", "uima.tcas.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_fallbackLanguage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_acceptLanguage;
  /** @generated */
  final int     casFeatCode_acceptLanguage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAcceptLanguage(int addr) {
        if (featOkTst && casFeat_acceptLanguage == null)
      jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAcceptLanguage(int addr, int v) {
        if (featOkTst && casFeat_acceptLanguage == null)
      jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_acceptLanguage, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getAcceptLanguage(int addr, int i) {
        if (featOkTst && casFeat_acceptLanguage == null)
      jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAcceptLanguage(int addr, int i, String v) {
        if (featOkTst && casFeat_acceptLanguage == null)
      jcas.throwFeatMissing("acceptLanguage", "uima.tcas.DocumentAnnotation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_acceptLanguage), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_languageCandidates = jcas.getRequiredFeatureDE(casType, "languageCandidates", "uima.cas.FSList", featOkTst);
    casFeatCode_languageCandidates  = (null == casFeat_languageCandidates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_languageCandidates).getCode();

 
    casFeat_categories = jcas.getRequiredFeatureDE(casType, "categories", "uima.cas.FSList", featOkTst);
    casFeatCode_categories  = (null == casFeat_categories) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_categories).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_fallbackLanguage = jcas.getRequiredFeatureDE(casType, "fallbackLanguage", "uima.cas.String", featOkTst);
    casFeatCode_fallbackLanguage  = (null == casFeat_fallbackLanguage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fallbackLanguage).getCode();

 
    casFeat_acceptLanguage = jcas.getRequiredFeatureDE(casType, "acceptLanguage", "uima.cas.StringArray", featOkTst);
    casFeatCode_acceptLanguage  = (null == casFeat_acceptLanguage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_acceptLanguage).getCode();

  }
}



    