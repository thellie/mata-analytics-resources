
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

/** Morphological information retrieved from a lexical dictionary entry
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * @generated */
public class Lemma_Type extends KeyStringEntry_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Lemma_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Lemma_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Lemma(addr, Lemma_Type.this);
  			   Lemma_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Lemma(addr, Lemma_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Lemma.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.tt.Lemma");
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "uima.tt.Lemma");
    return ll_cas.ll_getIntValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPartOfSpeech(int addr, int v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "uima.tt.Lemma");
    ll_cas.ll_setIntValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frost_ExtendedPOS;
  /** @generated */
  final int     casFeatCode_frost_ExtendedPOS;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFrost_ExtendedPOS(int addr) {
        if (featOkTst && casFeat_frost_ExtendedPOS == null)
      jcas.throwFeatMissing("frost_ExtendedPOS", "uima.tt.Lemma");
    return ll_cas.ll_getIntValue(addr, casFeatCode_frost_ExtendedPOS);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrost_ExtendedPOS(int addr, int v) {
        if (featOkTst && casFeat_frost_ExtendedPOS == null)
      jcas.throwFeatMissing("frost_ExtendedPOS", "uima.tt.Lemma");
    ll_cas.ll_setIntValue(addr, casFeatCode_frost_ExtendedPOS, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Lemma_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.Integer", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_frost_ExtendedPOS = jcas.getRequiredFeatureDE(casType, "frost_ExtendedPOS", "uima.cas.Integer", featOkTst);
    casFeatCode_frost_ExtendedPOS  = (null == casFeat_frost_ExtendedPOS) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frost_ExtendedPOS).getCode();

  }
}



    