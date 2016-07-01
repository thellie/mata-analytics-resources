
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
public class LocationCity_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LocationCity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LocationCity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LocationCity(addr, LocationCity_Type.this);
  			   LocationCity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LocationCity(addr, LocationCity_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LocationCity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.mata.genanno.LocationCity");
 
  /** @generated */
  final Feature casFeat_city;
  /** @generated */
  final int     casFeatCode_city;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCity(int addr) {
        if (featOkTst && casFeat_city == null)
      jcas.throwFeatMissing("city", "com.mata.genanno.LocationCity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_city);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCity(int addr, String v) {
        if (featOkTst && casFeat_city == null)
      jcas.throwFeatMissing("city", "com.mata.genanno.LocationCity");
    ll_cas.ll_setStringValue(addr, casFeatCode_city, v);}
    
  
 
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
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.LocationCity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ruleId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRuleId(int addr, String v) {
        if (featOkTst && casFeat_ruleId == null)
      jcas.throwFeatMissing("ruleId", "com.mata.genanno.LocationCity");
    ll_cas.ll_setStringValue(addr, casFeatCode_ruleId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LocationCity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_city = jcas.getRequiredFeatureDE(casType, "city", "uima.cas.String", featOkTst);
    casFeatCode_city  = (null == casFeat_city) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_city).getCode();

 
    casFeat_ruleId = jcas.getRequiredFeatureDE(casType, "ruleId", "uima.cas.String", featOkTst);
    casFeatCode_ruleId  = (null == casFeat_ruleId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ruleId).getCode();

  }
}



    