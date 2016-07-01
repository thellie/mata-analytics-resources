
/* First created by JCasGen Mon Jun 06 12:46:22 ICT 2016 */
package com.mata.genanno;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Jun 06 12:46:22 ICT 2016
 * @generated */
public class HashtagParse_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (HashtagParse_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = HashtagParse_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new HashtagParse(addr, HashtagParse_Type.this);
  			   HashtagParse_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new HashtagParse(addr, HashtagParse_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = HashtagParse.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.mata.genanno.HashtagParse");
 
  /** @generated */
  final Feature casFeat_hashtag;
  /** @generated */
  final int     casFeatCode_hashtag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHashtag(int addr) {
        if (featOkTst && casFeat_hashtag == null)
      jcas.throwFeatMissing("hashtag", "com.mata.genanno.HashtagParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_hashtag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHashtag(int addr, String v) {
        if (featOkTst && casFeat_hashtag == null)
      jcas.throwFeatMissing("hashtag", "com.mata.genanno.HashtagParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_hashtag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ruleId;
  /** @generated */
  final int     casFeatCode_ruleId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRuleId(int addr) {
        if (featOkTst && casFeat_ruleId == null)
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.HashtagParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ruleId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRuleId(int addr, String v) {
        if (featOkTst && casFeat_ruleId == null)
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.HashtagParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_ruleId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public HashtagParse_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_hashtag = jcas.getRequiredFeatureDE(casType, "hashtag", "uima.cas.String", featOkTst);
    casFeatCode_hashtag  = (null == casFeat_hashtag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hashtag).getCode();

 
    casFeat_ruleId = jcas.getRequiredFeatureDE(casType, "ruleId", "uima.cas.String", featOkTst);
    casFeatCode_ruleId  = (null == casFeat_ruleId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ruleId).getCode();

  }
}



    