
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
public class OpinionPhraseLevel1_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (OpinionPhraseLevel1_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = OpinionPhraseLevel1_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new OpinionPhraseLevel1(addr, OpinionPhraseLevel1_Type.this);
  			   OpinionPhraseLevel1_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new OpinionPhraseLevel1(addr, OpinionPhraseLevel1_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OpinionPhraseLevel1.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.mata.genanno.OpinionPhraseLevel1");
 
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
      jcas.throwFeatMissing("value", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_polarity;
  /** @generated */
  final int     casFeatCode_polarity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPolarity(int addr) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, String v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_polarity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ruleName;
  /** @generated */
  final int     casFeatCode_ruleName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRuleName(int addr) {
        if (featOkTst && casFeat_ruleName == null)
      jcas.throwFeatMissing("ruleName", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ruleName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRuleName(int addr, String v) {
        if (featOkTst && casFeat_ruleName == null)
      jcas.throwFeatMissing("ruleName", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_ruleName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentimentTerm;
  /** @generated */
  final int     casFeatCode_sentimentTerm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentimentTerm(int addr) {
        if (featOkTst && casFeat_sentimentTerm == null)
      jcas.throwFeatMissing("sentimentTerm", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentimentTerm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentimentTerm(int addr, String v) {
        if (featOkTst && casFeat_sentimentTerm == null)
      jcas.throwFeatMissing("sentimentTerm", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentimentTerm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentimentMatch;
  /** @generated */
  final int     casFeatCode_sentimentMatch;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentimentMatch(int addr) {
        if (featOkTst && casFeat_sentimentMatch == null)
      jcas.throwFeatMissing("sentimentMatch", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentimentMatch);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentimentMatch(int addr, String v) {
        if (featOkTst && casFeat_sentimentMatch == null)
      jcas.throwFeatMissing("sentimentMatch", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentimentMatch, v);}
    
  
 
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
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ruleId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRuleId(int addr, String v) {
        if (featOkTst && casFeat_ruleId == null)
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_ruleId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_not;
  /** @generated */
  final int     casFeatCode_not;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNot(int addr) {
        if (featOkTst && casFeat_not == null)
      jcas.throwFeatMissing("not", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_not);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNot(int addr, String v) {
        if (featOkTst && casFeat_not == null)
      jcas.throwFeatMissing("not", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_not, v);}
    
  
 
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
      jcas.throwFeatMissing("value1", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue1(int addr, String v) {
        if (featOkTst && casFeat_value1 == null)
      jcas.throwFeatMissing("value1", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_value1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value2;
  /** @generated */
  final int     casFeatCode_value2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue2(int addr) {
        if (featOkTst && casFeat_value2 == null)
      jcas.throwFeatMissing("value2", "com.mata.genanno.OpinionPhraseLevel1");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue2(int addr, String v) {
        if (featOkTst && casFeat_value2 == null)
      jcas.throwFeatMissing("value2", "com.mata.genanno.OpinionPhraseLevel1");
    ll_cas.ll_setStringValue(addr, casFeatCode_value2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OpinionPhraseLevel1_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.String", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

 
    casFeat_ruleName = jcas.getRequiredFeatureDE(casType, "ruleName", "uima.cas.String", featOkTst);
    casFeatCode_ruleName  = (null == casFeat_ruleName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ruleName).getCode();

 
    casFeat_sentimentTerm = jcas.getRequiredFeatureDE(casType, "sentimentTerm", "uima.cas.String", featOkTst);
    casFeatCode_sentimentTerm  = (null == casFeat_sentimentTerm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentimentTerm).getCode();

 
    casFeat_sentimentMatch = jcas.getRequiredFeatureDE(casType, "sentimentMatch", "uima.cas.String", featOkTst);
    casFeatCode_sentimentMatch  = (null == casFeat_sentimentMatch) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentimentMatch).getCode();

 
    casFeat_ruleId = jcas.getRequiredFeatureDE(casType, "ruleId", "uima.cas.String", featOkTst);
    casFeatCode_ruleId  = (null == casFeat_ruleId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ruleId).getCode();

 
    casFeat_not = jcas.getRequiredFeatureDE(casType, "not", "uima.cas.String", featOkTst);
    casFeatCode_not  = (null == casFeat_not) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_not).getCode();

 
    casFeat_value1 = jcas.getRequiredFeatureDE(casType, "value1", "uima.cas.String", featOkTst);
    casFeatCode_value1  = (null == casFeat_value1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value1).getCode();

 
    casFeat_value2 = jcas.getRequiredFeatureDE(casType, "value2", "uima.cas.String", featOkTst);
    casFeatCode_value2  = (null == casFeat_value2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value2).getCode();

  }
}



    