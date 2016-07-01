
/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Language-Confidence pair of a language candidate for the document text
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * @generated */
public class LanguageConfidencePair_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LanguageConfidencePair_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LanguageConfidencePair_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LanguageConfidencePair(addr, LanguageConfidencePair_Type.this);
  			   LanguageConfidencePair_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LanguageConfidencePair(addr, LanguageConfidencePair_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LanguageConfidencePair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.tt.LanguageConfidencePair");
 
  /** @generated */
  final Feature casFeat_languageConfidence;
  /** @generated */
  final int     casFeatCode_languageConfidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getLanguageConfidence(int addr) {
        if (featOkTst && casFeat_languageConfidence == null)
      jcas.throwFeatMissing("languageConfidence", "uima.tt.LanguageConfidencePair");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_languageConfidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguageConfidence(int addr, float v) {
        if (featOkTst && casFeat_languageConfidence == null)
      jcas.throwFeatMissing("languageConfidence", "uima.tt.LanguageConfidencePair");
    ll_cas.ll_setFloatValue(addr, casFeatCode_languageConfidence, v);}
    
  
 
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
      jcas.throwFeatMissing("language", "uima.tt.LanguageConfidencePair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "uima.tt.LanguageConfidencePair");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_languageID;
  /** @generated */
  final int     casFeatCode_languageID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLanguageID(int addr) {
        if (featOkTst && casFeat_languageID == null)
      jcas.throwFeatMissing("languageID", "uima.tt.LanguageConfidencePair");
    return ll_cas.ll_getIntValue(addr, casFeatCode_languageID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguageID(int addr, int v) {
        if (featOkTst && casFeat_languageID == null)
      jcas.throwFeatMissing("languageID", "uima.tt.LanguageConfidencePair");
    ll_cas.ll_setIntValue(addr, casFeatCode_languageID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LanguageConfidencePair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_languageConfidence = jcas.getRequiredFeatureDE(casType, "languageConfidence", "uima.cas.Float", featOkTst);
    casFeatCode_languageConfidence  = (null == casFeat_languageConfidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_languageConfidence).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_languageID = jcas.getRequiredFeatureDE(casType, "languageID", "uima.cas.Integer", featOkTst);
    casFeatCode_languageID  = (null == casFeat_languageID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_languageID).getCode();

  }
}



    