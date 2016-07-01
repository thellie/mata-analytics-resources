
/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
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
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * @generated */
public class MentionParse_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MentionParse_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MentionParse_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MentionParse(addr, MentionParse_Type.this);
  			   MentionParse_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MentionParse(addr, MentionParse_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MentionParse.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.mata.genanno.MentionParse");
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "com.mata.genanno.MentionParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "com.mata.genanno.MentionParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mentionNorm;
  /** @generated */
  final int     casFeatCode_mentionNorm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMentionNorm(int addr) {
        if (featOkTst && casFeat_mentionNorm == null)
      jcas.throwFeatMissing("mentionNorm", "com.mata.genanno.MentionParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mentionNorm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMentionNorm(int addr, String v) {
        if (featOkTst && casFeat_mentionNorm == null)
      jcas.throwFeatMissing("mentionNorm", "com.mata.genanno.MentionParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_mentionNorm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mention;
  /** @generated */
  final int     casFeatCode_mention;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMention(int addr) {
        if (featOkTst && casFeat_mention == null)
      jcas.throwFeatMissing("mention", "com.mata.genanno.MentionParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mention);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMention(int addr, String v) {
        if (featOkTst && casFeat_mention == null)
      jcas.throwFeatMissing("mention", "com.mata.genanno.MentionParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_mention, v);}
    
  
 
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
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.MentionParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ruleId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRuleId(int addr, String v) {
        if (featOkTst && casFeat_ruleId == null)
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.MentionParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_ruleId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value1;
  /** @generated */
  final int     casFeatCode_value1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue1(int addr) {
        if (featOkTst && casFeat_value1 == null)
      jcas.throwFeatMissing("value1", "com.mata.genanno.MentionParse");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue1(int addr, String v) {
        if (featOkTst && casFeat_value1 == null)
      jcas.throwFeatMissing("value1", "com.mata.genanno.MentionParse");
    ll_cas.ll_setStringValue(addr, casFeatCode_value1, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MentionParse_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_mentionNorm = jcas.getRequiredFeatureDE(casType, "mentionNorm", "uima.cas.String", featOkTst);
    casFeatCode_mentionNorm  = (null == casFeat_mentionNorm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mentionNorm).getCode();

 
    casFeat_mention = jcas.getRequiredFeatureDE(casType, "mention", "uima.cas.String", featOkTst);
    casFeatCode_mention  = (null == casFeat_mention) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mention).getCode();

 
    casFeat_ruleId = jcas.getRequiredFeatureDE(casType, "ruleId", "uima.cas.String", featOkTst);
    casFeatCode_ruleId  = (null == casFeat_ruleId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ruleId).getCode();

 
    casFeat_value1 = jcas.getRequiredFeatureDE(casType, "value1", "uima.cas.String", featOkTst);
    casFeatCode_value1  = (null == casFeat_value1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value1).getCode();

  }
}



    