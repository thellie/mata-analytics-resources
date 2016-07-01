
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

/** A paragraph
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * @generated */
public class ParagraphAnnotation_Type extends DocStructureAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ParagraphAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ParagraphAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ParagraphAnnotation(addr, ParagraphAnnotation_Type.this);
  			   ParagraphAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ParagraphAnnotation(addr, ParagraphAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ParagraphAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.tt.ParagraphAnnotation");
 
  /** @generated */
  final Feature casFeat_paragraphNumber;
  /** @generated */
  final int     casFeatCode_paragraphNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getParagraphNumber(int addr) {
        if (featOkTst && casFeat_paragraphNumber == null)
      jcas.throwFeatMissing("paragraphNumber", "uima.tt.ParagraphAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_paragraphNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParagraphNumber(int addr, int v) {
        if (featOkTst && casFeat_paragraphNumber == null)
      jcas.throwFeatMissing("paragraphNumber", "uima.tt.ParagraphAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_paragraphNumber, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ParagraphAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_paragraphNumber = jcas.getRequiredFeatureDE(casType, "paragraphNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_paragraphNumber  = (null == casFeat_paragraphNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_paragraphNumber).getCode();

  }
}



    