

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A paragraph
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class ParagraphAnnotation extends DocStructureAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ParagraphAnnotation.class);
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
  protected ParagraphAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ParagraphAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ParagraphAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ParagraphAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: paragraphNumber

  /** getter for paragraphNumber - gets The sequence number of the paragraph in the document
   * @generated
   * @return value of the feature 
   */
  public int getParagraphNumber() {
    if (ParagraphAnnotation_Type.featOkTst && ((ParagraphAnnotation_Type)jcasType).casFeat_paragraphNumber == null)
      jcasType.jcas.throwFeatMissing("paragraphNumber", "uima.tt.ParagraphAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ParagraphAnnotation_Type)jcasType).casFeatCode_paragraphNumber);}
    
  /** setter for paragraphNumber - sets The sequence number of the paragraph in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParagraphNumber(int v) {
    if (ParagraphAnnotation_Type.featOkTst && ((ParagraphAnnotation_Type)jcasType).casFeat_paragraphNumber == null)
      jcasType.jcas.throwFeatMissing("paragraphNumber", "uima.tt.ParagraphAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((ParagraphAnnotation_Type)jcasType).casFeatCode_paragraphNumber, v);}    
  }

    