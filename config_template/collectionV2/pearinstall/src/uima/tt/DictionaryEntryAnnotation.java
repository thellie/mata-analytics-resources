

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Base type for dictionary-based user-defined annotation types
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class DictionaryEntryAnnotation extends LexicalAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DictionaryEntryAnnotation.class);
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
  protected DictionaryEntryAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DictionaryEntryAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DictionaryEntryAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DictionaryEntryAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: lemma

  /** getter for lemma - gets Morphological information for the dictionary entry
   * @generated
   * @return value of the feature 
   */
  public Lemma getLemma() {
    if (DictionaryEntryAnnotation_Type.featOkTst && ((DictionaryEntryAnnotation_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "uima.tt.DictionaryEntryAnnotation");
    return (Lemma)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DictionaryEntryAnnotation_Type)jcasType).casFeatCode_lemma)));}
    
  /** setter for lemma - sets Morphological information for the dictionary entry 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemma(Lemma v) {
    if (DictionaryEntryAnnotation_Type.featOkTst && ((DictionaryEntryAnnotation_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "uima.tt.DictionaryEntryAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DictionaryEntryAnnotation_Type)jcasType).casFeatCode_lemma, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    